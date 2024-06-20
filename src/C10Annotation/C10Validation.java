package C10Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

import C10Annotation.User.NotEmpty;

public class C10Validation {
	public static void main(String[] args) throws IllegalAccessException {
		User user = new User("hong", "");
		validate(user);
	}

	static void validate(Object object) throws IllegalAccessException {
		Class<?> myClass = object.getClass();
		Field[] fields = myClass.getDeclaredFields();
		for (Field f : fields) {
			if(f.isAnnotationPresent(NotEmpty.class)){
				f.setAccessible(true);
				String value = (String)f.get(object);
				if(value == null || value.isEmpty()){
					NotEmpty notEmpty = f.getAnnotation((NotEmpty.class));
					throw new IllegalArgumentException(notEmpty.message());
				}
			}
		}
	}
}

class User {
	@NotEmpty(message = "name cannot be empty")
	private String name;
	@NotEmpty(message = "email cannot be empty")
	private String email;

	User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	//  특정 필드 값이 비어있는지 아닌지 검사하는 어노테이션
	// RetentionPolicy.RUNTIME : 런타임 동작하도록 지정
	@Retention(RetentionPolicy.RUNTIME)
	// 	Field : 변수 적용, Method : 메서드, TYPE: 클래스, 인터페이스 등에 적용
	@Target(ElementType.FIELD)
	@interface NotEmpty {
		String message() default "this field cannot be empty";
	}
}
