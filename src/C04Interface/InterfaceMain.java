package C04Interface;

public class InterfaceMain {
	public static void main(String[] args) {
		CatImplments cat1 = new CatImplments();
		cat1.makeSound();

		DogImplments dog1 = new DogImplments();
		dog1.makeSound();

		AnimalInterface1 cat2 = new CatImplments();
		cat2.makeSound();
		AnimalInterface1 dog2 = new DogImplments();
		dog2.makeSound();
	//	다형성 : 하나의 객체가 여러개의 참조변수를 가질 수 있음을 의미

		CatMultiImplments cat3 = new CatMultiImplments();
		cat3.makeSound();
		System.out.println(cat3.play("코숏", "먼치킨"));

		DogMultiImplments dog3 = new DogMultiImplments();
		dog3.makeSound();
		System.out.println(dog3.play("리트리버", "보더콜리"));

		// AnimalInterface1 cat3 = new CatMultiImplments();
		// cat3.makeSound();
		// System.out.println(cat3.play("코숏", "먼치킨"));
		//
		// AnimalInterface1 dog3 = new DogMultiImplments();
		// dog3.makeSound();
		// System.out.println(dog3.play("리트리버", "보더콜리"));

	//	기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나,
	//	익명내부클래스 방식으로 생성가능

		AnimalInterface1 ai1 = new AnimalInterface1() {
			@Override
			public void makeSound() {
				System.out.println("hello");
			}
		};
		ai1.makeSound();

	}
}
