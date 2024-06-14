package C04Interface;

public class DogImplments implements AnimalInterface1{

	@Override
	public void makeSound(){
		System.out.println("멍멍");
	}
}
class DogMultiImplments implements AnimalInterface1, AnimalInterface2{

	@Override
	public void makeSound() {
		System.out.println("멍멍");
	}

	@Override
	public String play(String a, String b) {
		return a + "와 " + b + "가 같이 뛰어 놉니다.";
	}
}