package C04Interface.BankService;

//어떤 서비스를 이용할지 질문
//1.계좌 개설 2.입금 3.출금 4.계좌송금
//1-1) 계좌번호 입력하세요
//2-1)얼마 입금하시겠어요?
//3-1)얼마 출금하시겠어요?r
//4-1)누구한테 입금하시나요?
//4-2)얼마 입금하시나요?


// 비즈니스 로직이 동작하는 코드가 Service코드
public class BankCardService implements BankService{

	@Override
	public void deposit(int money, BankAccount bankAccount){
		int myMoney = bankAccount.getBalance();
		int total = myMoney + money;
		bankAccount.updateBalance(total);
		System.out.println(money+"원 카드로 입금되었습니다.");
		System.out.println("현재 잔액은 " + total);
	}

	@Override
	public void withdraw(int money, BankAccount bankAccount){
		int myMoney = bankAccount.getBalance();
		int total = 0;
		if(myMoney < money){
			System.out.println("잔액 부족입니다.");
		}else {
			total = myMoney - money;
			bankAccount.updateBalance(total);
			System.out.println(money + "원 카드로 출금되었습니다.");
		}
		System.out.println("현재 잔액은 " + total);
	}
}