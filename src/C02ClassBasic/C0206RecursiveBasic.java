package C02ClassBasic;

public class C0206RecursiveBasic {
	public static void main(String[] args) {
		// for문으로 1~10까지 누적합계
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println(addAcc(10));
	}

	static int addAcc(int n) {
		if (n == 1) {
			return 1;
		}
		System.out.println("n : " + n);
		return n + addAcc(n - 1);
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
