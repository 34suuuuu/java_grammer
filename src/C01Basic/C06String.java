package C01Basic;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

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
	// 	int a = 10;
	// // int -> String
	// 	String st1 = Integer.toString(a);
	// // String -> int
	// 	String st2 = String.valueOf(a);
	//
	// //	참조자료형에 원시자료형을 담을 떄는 Wrapper클래스를 써야한다.
	// 	List<Integer> list1 = new ArrayList<>();

	//	String 변수 생성 방법
	//	객체 생성 방식
	// 	String st1 = new String("hello");
	// //	리터럴 방식 : 권장하는 방식
	// 	String st2 = "hello";
	// 	String st3 = "hello";

		// String st1 = new String("hello");
		// String st2 = "hello";
		// String st3 = new String("hello");
		// String st4 = "hello";
		//
		// System.out.println(st1 == st3);	// false
		// System.out.println(st2 == st4);	// true
		// System.out.println(st3== st4);	// false
		//
		// System.out.println(st1.equals(st3));	// false
		// System.out.println(st2.equals(st4));	// true
		// System.out.println(st3.equals(st4));	// false

		// String 문자열 비교는 equals : 메모리 주소 비교가 아니라 값비교
	// 	System.out.println("hello".equals("Hello"));	//false
	// 	System.out.println("hello".equalsIgnoreCase("Hello"));	//true
	//
	// //	문자열 길이 : length();
	// 	String st1 = "hello java java";
	// 	System.out.println(st1.length());	// 15
	// //	indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
	// 	int index1 = st1.indexOf("java");	// 6
	// 	System.out.println(index1);	// 11
	// 	// 마지막 문자열의 index 위치
	// 	System.out.println(st1.lastIndexOf("java"));
	//
	// //	contains : 특정 문자열이 있는지 여부를 boolean을 리턴
	// 	System.out.println(st1.contains("hello"));	// true
	// 	System.out.println("world");	// false
	//
	// //	charAt : 특정 인덱스의 문자(char)값을 리턴
	// 	String st = "abcdefabaadf";
	// 	char ch1 = st.charAt(3);
	// 	System.out.println(ch1);	// d
	//
	// //	위의 문자열에 a의 갯수가 몇개인지 count
	// 	int cnt = 0;
	// 	for (int i = 0; i < st.length(); i++) {
	// 		if(st.charAt(i) == 'a') cnt++;
	// 	}
	// 	System.out.println(cnt);
	//
	// 	// toCharArray() : String문자열을 char배열로 리턴
	// 	cnt = 0;
	// 	for (char c : st.toCharArray()) {
	// 		if(c =='a') cnt++;
	// 	}
	// 	System.out.println(cnt);

	//	문자열 더하기 : +=
	// 	String st1 = "hello";
	// 	st1 += " world";
	// 	System.out.println(st1); // hello world
	//
	// //	특정 문자 제거하기
	// // 프로그래머스) 특정 문자 제거하기
	// 	String my_string = "BCBdbe";
	// 	String letter = "B";
	// 	String answer = "";
	//
	// 	for (char c : my_string.toCharArray()) {
	// 		if (c != letter.charAt(0)) {
	// 			answer += c;
	// 		}
	// 	}
	// 	System.out.println(answer);

	//	substring(a,b) : a이상 b미만의 index의 문자를 잘라 리턴
	// 	String st1 = "hello world";
	// 	System.out.println(st1.substring(0, 5));
	// 	System.out.println(st1.substring(6, st1.length()));

		// 프로그래머스) 특정 문자 제거하기 : char없이 substr으로 풀이
		// String my_string = "BCBdbe";
		// String letter = "B";
		// String answer = "";
		// for (int i = 0; i < my_string.length(); i++) {
		// 	if (!my_string.substring(i, i + 1).equals(letter)) {
		// 		answer += my_string.substring(i, i + 1);
		// 	}
		// }

	//	프로그래머스) 가운데 글자 가져오기
	// 	String s = "qwer";
	// 	String answer;
	// 	if (s.length() % 2 == 0) {
	// 		answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
	// 	} else {
	// 		answer = s.substring(s.length() / 2, s.length() / 2 + 1);
	// 	}
	// 	System.out.println(answer);

	//	trim, strip : 문자열 양쪽 끝의 공백 제거
	// 	String trimSt1 = "hello world                  ";
	// 	String trimSt2 = trimSt1.trim();
	// 	System.out.println(trimSt1 +"//");
	// 	System.out.println(trimSt2 +"//");
	// 	String strip3 = trimSt1.strip();
	// 	System.out.println(strip3 +"//");

	// toUpperCase : 대문자로 변환, toLowerCase : 소문자로 변환
	// 	String st1 = "hElLo";
	// 	String st2 = st1.toUpperCase();
	// 	String st3 = st1.toLowerCase();
	// 	System.out.println(st2);
	// 	System.out.println(st3);
	//
	// //	char -> String 형변환
	// 	char ch1 = 'a';
	// 	System.out.println(Character.toString(ch1));

	// //	replace(a,b) : a문자열을 b문자열로 대체
	// 	String st1 = "hello world";
	// 	String st2 = st1.replaceFirst("world", "java");
	// 	System.out.println(st2);

	//	replaceAll(a,b) : replace와 동일, 정규표현식을 쓸 수 있음
	// 	String st1 = "01abcABC1234한글123"; // 숫자, 알파벳, 한글 등이 섞여 있을 때
	//	for문을 활용해서 알파벳(소문자) 제거 answer 리턴
	// 	String answer = "";
	// 	for (char c : st1.toCharArray()) {
	// 		if(c < 'a') answer += c;
	// 	}
	// 	System.out.println(answer);

	//	replaceAll과 정규표현식을 사용해서 알파벳(소문자) 제거
	//	[a-z]+ : 1개 이상의 소문자 알파벳 표현하는 정규표현식
	//	[A-Za-Z]+ : 대소문자 포함
	//	[가-힣]+ : 한글
	// 	String st1 = "01abcABC1234한글123"; // 숫자, 알파벳, 한글 등이 섞여 있을 때
		// // 	String answer = st1.replaceAll("[A-Za-z]+", "");
	// 	System.out.println(answer);
	//
	// //	matches와 Pattern.matches()
	// 	String test = "helloA";
	// 	System.out.println(test.matches("[A-Za-z]+"));	//true
	//
	// 	boolean b1 = Pattern.matches("[0-9]+", "12345"); // true
	// 	System.out.println(b1);
	//
	// 	String s = "a234";
	//
	// 	boolean answer = (Pattern.matches("[0-9]+", s) && (s.length() == 4 || s.length() == 6));
	// 	System.out.println(answer);
	//
	// 	// ^: 정규표현식의 시작, $: 정규표현식의 끝, *: 빈값 포함
	// 	boolean b2 = Pattern.matches("^[A-Za-z]*$", "");
	// 	System.out.println(b2);

	//	전화번호 패턴 검증
	// 	Scanner sc = new Scanner(System.in);
	// 	while (true) {
	// 		String number = sc.nextLine();
	// 		boolean check = false;
	// 		if (Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number)) {
	// 			System.out.println("올바르게 입력하셨습니다.");
	// 		} else {
	// 			System.out.println("틀린 형식의 전화번호 입니다.");
	// 		}
	// 	}

	//	이메일 검증 : 소문자 알파벳과 숫자로 이루어져있는 id@알파벳.com
	// 	String email = "abc@naver.com";
	// 	boolean b3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", email);
	// 	System.out.println(b3);

	//	split : 특정 문자를 기준으로 문자열을 자르는 것, 문자열 배열을 return
	// 	String a = "a:b:c:d";
	// 	String[] a_arr = a.split(":");
	// 	System.out.println(Arrays.toString(a_arr));
	//
	// 	String b = "a b c  d";
	// 	String[] b_arr = b.split(" ");
	// 	System.out.println(Arrays.toString(b_arr));
	//
	// //	공백을 의미하는 정규표현식 : \s
	// 	String[] b_arr_regex = b.split("\\s+"); // 공백이 하나 이상 있을 때
	// 	System.out.println(Arrays.toString(b_arr_regex));

	//	isEmpty와 null(자료타입)
	// 	String st1 = null;
	// 	String st2 = " ";
	// //	equal관계 아님
	// 	System.out.println(st1 == st2); //false
	// //	문제 발생 X
	// 	System.out.println(st2.isEmpty()); //true
	// //  문제 발생 O : NullPointerException 예외 발생
	// 	System.out.println(st1.isEmpty()); // false가 아니라 예외가 발생

	//	StringBuffer
	// 	StringBuffer sb1 = new StringBuffer("hello");
	// 	sb1.append(" java");
	// 	sb1.append(" world");
	// 	System.out.println(sb1);
	// 	String answer = sb1.toString();
	// 	sb1.insert(5, " python");
	// 	sb1.delete(17, sb1.length());
	// 	System.out.println(sb1);

	//	StringBuilder
	//	String+= < StringBuffer < StringBuilder
	//	StringBuilder는 스레드 safeX
	// 	StringBuilder sb2 = new StringBuilder();
	// 	sb2.append("hello");
	// 	sb2.append("\n"); //줄바꿈

	//	StringBuilder를 사용해서
	// 	String my_string = "hello";
	// 	int n = 3;	///hhheeellllllooo 결과가 answer에 담기도록
	// 	StringBuilder sb3 = new StringBuilder();
	// 	for (char c : my_string.toCharArray()) {
	// 		for (int i = 0; i < n; i++) {
	// 			sb3.append(Character.toString(c));
	// 		}
	// 	}
	// 	System.out.println(sb3);

		// 프로그래머) 문자열 밀기

	}
}
