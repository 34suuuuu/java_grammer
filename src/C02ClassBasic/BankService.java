package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//어떤 서비스를 이용할지 질문
//1.계좌 개설 2.입금 3.출금 4.계좌송금
//1-1) 계좌번호 입력하세요
//2-1)얼마 입금하시겠어요?
//3-1)얼마 출금하시겠어요?r
//4-1)누구한테 입금하시나요?
//4-2)얼마 입금하시나요?
public class BankService {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<BankAccount> bankAccounts = new ArrayList<>();

		BankAccount b1 = new BankAccount("1234");
		bankAccounts.add(b1);
		b1.deposit(10000);
		// b1.widhdraw(30000);
		// b1.widhdraw(80000);

		BankAccount b2 = new BankAccount("4321");
		bankAccounts.add(b2);
		b2.deposit(5000);
		// b2.widhdraw(20000);
		// b2.transfer(b1, 3000);


		while (true) {
			System.out.println("서비스 번호를 입력하세요: 1.계좌 개설 2.입금 3.출금 4.계좌송금");
			String input = br.readLine();
			switch (input) {
				case "1":
					System.out.println("계좌번호를 입력하세요");
					String newAccountNum = br.readLine();
					BankAccount bank = new BankAccount(newAccountNum);
					bankAccounts.add(bank);
					break;
				case "2":
					System.out.println("계좌를 입력하세요");
					String accountNum = br.readLine(); // 내 계좌
					System.out.println("입금할 금액을 입력하세요");
					int money = Integer.parseInt(br.readLine());
					for (BankAccount b : bankAccounts) {
						if (b.getAccountNumber().equals(accountNum)) {
							b.deposit(money);
						}
					}
					break;
				case "3":
					System.out.println("계좌를 입력하세요");
					accountNum = br.readLine(); // 내 계좌
					System.out.println("출금할 금액을 입력하세요");
					money = Integer.parseInt(br.readLine());
					for (BankAccount b : bankAccounts) {
						if (b.getAccountNumber().equals(accountNum)) {
							b.widhdraw(money);
						}
					}
					break;
				case "4":
					System.out.println("본인 계좌를 입력하세요");
					String myAccountNum = br.readLine(); // 송금할 계좌
					System.out.println("상대방 계좌를 입력하세요");
					String yourAccountNum = br.readLine(); // 송금할 계좌
					System.out.println("입금할 금액을 입력하세요");
					money = Integer.parseInt(br.readLine());

					BankAccount myAccount = null;
					BankAccount yourAccount = null;
					for(int i=0; i<bankAccounts.size(); i++){
						if(bankAccounts.get(i).getAccountNumber().equals(myAccountNum)){
							myAccount = bankAccounts.get(i);
						}
						if(bankAccounts.get(i).getAccountNumber().equals(yourAccountNum)){
							yourAccount = bankAccounts.get(i);
						}
					}
					myAccount.transfer(yourAccount, money);
					break;

				default:
					System.out.println("다시 입력해주십시오");

			}
		}


	}
}
//	BanckAccount
//	accountNumber(계좌번호), balance(잔액) 변수
//	생성자1개 : accountNumber 초기화
//	getter가 모든 변수에 맞게 존재

//	deposit(예금하기) : balance(잔액) 증가시키는 메서드
//	=> "~원 입금되었습니다."

//	withdraw(출금하기) : balance(잔액) 감소시키는 메서드
//	=> 가지고 있는 돈보다 잔액이 부족하면 "잔액이 부족합니다."
// 	=> 충분하면 ~원 출금되었습니다.
class BankAccount {
	private String accountNumber;
	private int balance;

	BankAccount(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	BankAccount() {

	}

	// 예금하기
	public void deposit(int money) {
		this.balance += money;
		System.out.println(this.accountNumber + "계좌에 " + money + "를 입금하였습니다");
	}

	//	출금하기
	public void widhdraw(int money) {
		if (this.balance < money) {
			System.out.println("잔액이 부족합니다.");
		} else {
			this.balance -= money;
			System.out.println(this.accountNumber + "계좌에서 " +money + "원이 출금되었습니다");
		}
	}

	public void transfer(BankAccount b, int money) {
		// this.widhdraw(money);
		// b.deposit(money);
		this.balance -= money;
		b.deposit(money);
		System.out.println(this.accountNumber + "계좌 잔액은 " + this.balance + "입니다.");
		System.out.println(b.accountNumber + "계좌 잔액은 " + b.balance + "입니다.");
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}
}