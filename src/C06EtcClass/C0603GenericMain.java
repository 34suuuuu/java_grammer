package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0604GenericMain {
	public static void main(String[] args) {
		String[] stArr = {"java", "python", "C"};
		stChange(stArr, 0, 1);
		System.out.println(Arrays.toString(stArr));
		Integer[] intArr = {10, 20, 30};
		intChange(intArr, 0, 1);
		System.out.println(Arrays.toString(intArr));
		genericChange(stArr, 1, 2);
		System.out.println(Arrays.toString(stArr));
		genericChange(intArr, 1, 2);
		System.out.println(Arrays.toString(intArr));

		Person p1 = new Person();
		p1.setValue("34suuuuu");

		GenericPerson<Integer> p2 = new GenericPerson();
		p2.setValue(7);
		System.out.println(p2.getValue());

	//	제네릭 사용
		List<String> myList = new ArrayList<>();
		myList.add("hello");
		myList.add("java");

	//	컴파일 후 제네릭 소거
	// 	List<String> myList = new ArrayList<>();
	// 	myList.add("hello");
	// 	myList.add("java");

	}

	//	제메릭메서드 생성 : 반환타입 왼쪽에 <T> 선언
	//	유의점 : 제네릭은 객체 타입이 들어와야함
	static <T>void genericChange(T[] stArr, int a, int b) {
		T tmp = stArr[a];
		stArr[a] = stArr[b];
		stArr[b] = tmp;
	}

	static void stChange(String[] stArr, int a, int b) {
		String tmp = stArr[a];
		stArr[a] = stArr[b];
		stArr[b] = tmp;
	}

	static void intChange(Integer[] intarr, int a, int b) {
		Integer tmp = intarr[a];
		intarr[a] = intarr[b];
		intarr[b] = tmp;
	}
}

class Person{
	String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}

//	제네릭 클래스는 클래스명 옆에 <T> 선언
class GenericPerson<T> {
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}