package C04Interface.BankService;

import java.util.Scanner;

// Controller 역할은 사용자와의 인터페이싱
public class BankController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호를 입력하세요");
		String accountNumber = sc.nextLine();
		BankAccount bankAccount = new BankAccount(accountNumber);

		while (true) {
			System.out.println("서비스 번호를 입력하세요. 1.카드 2.카카오페이 3.종료");
			int serviceNumber = Integer.parseInt(sc.nextLine());

			if (serviceNumber == 3) {
				System.out.println("서비스를 종료합니다.");
				break;
			}

			BankService bankService = null;
			if (serviceNumber == 1) {
				System.out.println("카드서비스입니다.");
				bankService = new BankCardService();
			} else if (serviceNumber == 2) {
				System.out.println("카카오페이 서비스입니다.");
				bankService = new BankKakaoService();
			} else {
				System.out.println("잘못된 서비스 번호입니다.");
				continue;
			}

			System.out.println("입금하시려면 1번, 출금하시려면 2번");
			int transactionType = Integer.parseInt(sc.nextLine());
			System.out.println("금액을 입력하세요");
			int amount = Integer.parseInt(sc.nextLine());

			if (transactionType == 1) {
				bankService.deposit(amount, bankAccount);
			} else if (transactionType == 2) {
				bankService.withdraw(amount, bankAccount);
			} else {
				System.out.println("잘못된 거래 유형입니다.");
			}
		}
		sc.close();
	}
}