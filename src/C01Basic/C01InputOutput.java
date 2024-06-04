package C01Basic;

import java.util.Scanner;

public class C01InputOutput {
	public static void main(String[] args) {
		// 출력 : System.out (콘솔)
		int a = 20;
		// println : 출력 후 줄바꿈
		// print : 출력 후 줄바꿈 없이
		System.out.print(a);
		String b = "hello world!";
		System.out.println(b);
		// 문자열과 숫자를 합하면 문자가 된다.
		System.out.println(a + b);
		// 숫자+숫자
		System.out.println(20 + 10);

		// 입력 : System.in (키보드 입력) + Scanner (입력을 위한 클래스)
		Scanner myScnner = new Scanner(System.in);
		// System.out.println("아무 문자열을 입력해주세요");
		// // nextLine은 입력 받은 데이터를 한 줄 읽어서 String 리턴
		// String inputs =	myScnner.nextLine();
		// System.out.println(inputs);

		// System.out.println("더하기 할 두 숫자를 입력해주세요");
		// int a1 = myScnner.nextInt();
		// int a2 = myScnner.nextInt();
		// System.out.println("두 수를 더 한 값은 " + (a1+a2) + "입니다");
		// System.out.println("두 수를 더 한 값은 " + a1+a2 + "입니다"); // 앞의 문자열과 a1까지가 문자열로 먼저 처리되게 됨

		// System.out.println("실수를 입력해주세요");
		// double input_double = myScnner.nextDouble();
		// System.out.println(input_double);

		// System.out.println("true/false를 입력해주세요");
		// boolean input_boolean = myScnner.nextBoolean();
		// System.out.println(input_boolean);

		// 입출력 시스템 메모리 해제
		// java밖의 시스템이므로 입출력 시스템 메모리 해제를 해주는 것이 좋다
		myScnner.close();
	}
}
