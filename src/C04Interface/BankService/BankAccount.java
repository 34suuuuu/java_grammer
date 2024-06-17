package C04Interface.BankService;

//	BanckAccount
//	accountNumber(계좌번호), balance(잔액) 변수
//	생성자1개 : accountNumber 초기화
//	getter가 모든 변수에 맞게 존재

//	deposit(예금하기) : balance(잔액) 증가시키는 메서드
//	=> "~원 입금되었습니다."

//	withdraw(출금하기) : balance(잔액) 감소시키는 메서드
//	=> 가지고 있는 돈보다 잔액이 부족하면 "잔액이 부족합니다."
// 	=> 충분하면 ~원 출금되었습니다.

// 작업의 대상이 되는 객체 즉, Entity
public class BankAccount {
	static long static_id = 0L;
	private long id;
	private String accountNumber;
	private int balance;

	BankAccount(String accountNumber) {
		static_id += 1;
		id = static_id;
		this.accountNumber = accountNumber;
	}

	public void updateBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public Long getId() {
		return id;
	}
}