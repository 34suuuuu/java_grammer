package C03Inheritance;

// 상속 불가
// public class C0305Others extends FinalParents
public class C0305Others {
	public static void main(String[] args) {
		final int a = 10;
		// a = 20;

		//추상 클래스와 인터페이스는 구현업싱 객체생성 불가
		AbstractDog dog = new AbstractDog();
	}
}

//	final을 클래스에 붙임면 상속불가한 클래스 생성

final class FinalParents {

}

class AbstractAnimal {
	void makeSound1(){
		System.out.println("동물 소리를 냅니다.");
	}

	// 오버라이딩 불가
	final void makeSound2(){
		System.out.println("동물 소리를 냅니다.");
	}

	// abstract 키워드는 자식 클래스로 하여금 오버라이딩 강제
	// abstract 메서드가 하나라도 있으면 반드시 클래스에도 abstract 키워드가 붙어야함
	// abstract void makeSound3();
}

class AbstractDog extends AbstractAnimal {


	// @Override
	// void makeSound2() {
	// 	System.out.println("멍멍2");
	// }
}