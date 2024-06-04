package C01Basic;

import java.util.Scanner;

public class C04IfStatements {
	public static void main(String[] args) {

	//	도어락키 if문
	// 	Scanner sc = new Scanner(System.in);
	// 	int answer = 1234;
	// 	int input = sc.nextInt();
	// 	if (input == answer) {
	// 		System.out.println("문이 열렸습니다.");
	// 	} else {
	// 		System.out.println("비밀번호가 틀렸습니다.");
	// 	}

		// 알파벳인지 소문자인지 대문자인지 판별하는 프로그램
		// 소문자 -> 대문자 -> 알파벳이 아닙니다.
		// Scanner sc = new Scanner(System.in);
		// char c = sc.next().charAt(0);
		// if (c >= 'a' && c <= 'z') {
		// 	System.out.println("소문자 입니다.");
		// } else if (c >= 'A' && c <= 'Z') {
		// 	System.out.println("대문자 입니다.");
		// } else {
		// 	System.out.println("알파벳이 아닙니다.");
		// }

		// 10000 - 택시, 3000 - 버스, 2000 - 킥보드
		// 사용자에게 얼마가 있는지 물어보고 구간별로 교통수단 추천
		Scanner sc = new Scanner(System.in);
		int moneyInput = sc.nextInt();
		if (moneyInput >= 10000) {
			System.out.println("택시타세요");
		} else if (moneyInput < 10000 && moneyInput >= 3000) {
			System.out.println("버스타세요");
		} else if (moneyInput < 3000 && moneyInput >= 2000) {
			System.out.println("킥보드타세요");
		} else{
			System.out.println("걸어가세요");

		}

			// if문 독립적으로 존재할 경우에는 정확한 범위지정을 하지 않으면,
			// 모든 if문이 중복되어 실행될 가능성이 존재.
		if (moneyInput >= 10000) {
			System.out.println("택시타세요");
		}
		if (moneyInput >= 3000) {
			System.out.println("버스타세요");
		}
		if (moneyInput >= 2000) {
			System.out.println("킥보드타세요");
		} else {
			System.out.println("걸어가세요");
		}
	}


}
