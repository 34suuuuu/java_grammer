package C01Basic;

import java.util.ArrayList;
import java.util.List;

public class C06String {
	public static void main(String[] args) {
	//	참조자료형 : 기본 자료형을 제외한 모든 자료형
	//	WrapperClass : 기본형 타입을 Wrapping한 클래스
	//	int와 Integer간의 형변환
	// 	int a = 10;
	// 	Integer b = new Integer(20);
	// //	오토 언박싱 : Integer -> int 형변환
	// 	int c = b;
	// // 오토 박싱 : Int -> Integer 형변환
	// 	Integer d = a;
	//
	//	String과 int의 형변횐
		int a = 10;
	// int -> String
		String st1 = Integer.toString(a);
	// String -> int
		String st2 = String.valueOf(a);

	//	참조자료형에 원시자료형을 담을 떄는 Wrapper클래스를 써야한다.
		List<Integer> list1 = new ArrayList<>();

		

	//	String 변수 생성 방법
	//	객체 생성 방식
	// 	String st1 = new String("hello");
	// //	리터럴 방식
	// 	String st2 = "hello";
	// 	String st3 = "hello";
	}
}
