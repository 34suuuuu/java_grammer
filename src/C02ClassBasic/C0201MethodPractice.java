package C02ClassBasic;

public class C0201MethodPractice {
	public static void main(String[] args) {
		int num = 7;
		if (chkDecimal(num)) {
			System.out.println("소수입니다");
		} else {
			System.out.println("거짓입니다");
		}

		chkDecimalPrint(num);
	}

	public static boolean chkDecimal(int num) {
		for (int i = 2; i*i <= num; i++) {
			if (num % i == 0) {
				//메서드 return을 만나면 바로 메서드를 종료
				//void 리턴타입에서도 메서드 강제 종료를 위해 return 사용
				return false;
			}
		}
		return true;
	}

	public static void chkDecimalPrint(int num) {
		for (int i = 2; i*i <= num; i++) {
			if (num % i == 0) {
				//메서드 return을 만나면 바로 메서드를 종료
				//void리턴타입에서도 메서드 강제 종료를 위해 return 사용
				System.out.println("거짓입니다");
				return;
			}
		}
		System.out.println("소수입니다");
	}

}
