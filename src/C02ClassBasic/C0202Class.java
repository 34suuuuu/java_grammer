package C02ClassBasic;

public class C0202Class {
	public static void main(String[] args) {
	// 	System.out.println(MyCalculator.sum(10,20));
	//
	// //	A부서의 매출
	// //	20원 발생
	// 	MyCalculator.sumAcc(20);
	// 	System.out.println(MyCalculator.total);
	//
	// //	30원 발생
	// 	MyCalculator.sumAcc(30);
	// 	System.out.println(MyCalculator.total);
	//
	// //	40원 발생
	// 	MyCalculator.sumAcc(40);
	// 	System.out.println(MyCalculator.total);
	//
	// //	B부서의 매출
	// 	MyCalculator.total = 0;
	// 	클래스메서드 호출방식 : 클래스명. 메서드명();
	// 	MyCalculator.sumAcc(10);
	// 	MyCalculator.sumAcc(20);
	// 	MyCalculator.sumAcc(30);
	// 	System.out.println(MyCalculator.total);


	// //	객체를 사용한 회계프로그램 : 객체 고유의 메모리 공간 할당
	// //	A회사의 매출
	// 	MyCalculatorInstance m1 = new MyCalculatorInstance();
	// //	객체메서드 호출방식 : 객체명.메서드명();
	// 	m1.sumAcc(10);
	// 	m1.sumAcc(20);
	// 	m1.sumAcc(30);
	//
	// 	MyCalculatorInstance m2 = new MyCalculatorInstance();
	// 	m2.sumAcc(100);
	// 	m2.sumAcc(200);
	// 	m2.sumAcc(300);
	//
	// 	System.out.println(m1.total);
	// 	System.out.println(m2.total);

		C0203Person person = new C0203Person();
		// 변수값에 직접 접근하여 값을 할당하는 방식
		// person.name = "홍길동";
		// person.email = "홍길동@naver.com";
		// person.age = 35;
		// person.eating();
		//
		// System.out.println("이름 : " + person.name);
		// System.out.println("이메일 : " + person.email);
		// System.out.println("나이 : " + person.age);
		// 일반적인 패턴은 변수값에 직접 접근하지 않는다.
		// 의도를 명확히 한 메서드를 통해 변수값을 할당하고 가져옴.

		person.eating();
		person.setName("홍길동");
		System.out.println(person.getName());
		person.eating();


	}

}

 class MyCalculator {
	//	static이 붙어있는 변수는 클래스 변수, static이 붙어있지 않으면 객체변수
	static int total = 0;

	static int sum(int a, int b) {
		return a + b;
	}

	static void sumAcc(int a) {
		total += a;
	}

	static int minus(int a, int b) {
		return a - b;
	}
}

class MyCalculatorInstance {
	 //	static이 붙어있는 변수는 클래스 변수, static이 붙어있지 않으면 객체변수
	 int total = 0;

	 int sum(int a, int b) {
		return a + b;
	}

	 void sumAcc(int a) {
		this.total += a;
	}

	 int minus(int a, int b) {
		return a - b;
	}

}
