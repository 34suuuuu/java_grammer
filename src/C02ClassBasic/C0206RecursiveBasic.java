package C02ClassBasic;

import java.util.Arrays;

public class C0206RecursiveBasic {
	public static void main(String[] args) {
		// for문으로 1~10까지 누적합계
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		// System.out.println(sum);
		// System.out.println(addAcc(10));


	//	피보나치 수열
	//	재귀문 이용
		long first = 1;
		long second = 1;
		long total = first + second;
		for (int i = 0; i <= 3; i++) {
			first = second;
			second = total;
			total = first + second;
			// System.out.println("total: " + total);
		}
		System.out.println(total);

	//	재귀문 이용
		System.out.println(fibonacci(5));
	}

	static int addAcc(int n) {
		if (n == 1) {
			return 1;
		}
		System.out.println("n : " + n);
		return n + addAcc(n - 1);
	}

	// 재귀문으로 처리하면 중복으로 계산해야하는 부분이 너무 많음
	static int fibonacci(int n){
		if (n <= 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}


	static void function1() {
		System.out.println("function1 시작");
		function2();
		System.out.println("function1 끝");
	}

	static void function2() {
		System.out.println("function2 시작");
		System.out.println("function2 끝");
	}
}
