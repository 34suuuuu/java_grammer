package C02ClassBasic;

public class C0203Person {
	private String name;
	private String email;
	private int age;

	public void eating() {
		System.out.println(this.name +"이 밥을 먹는다.");
	}

	//	setter
	public void setName(String name) {
		this.name = name;
	}

	//	getter
	public String getName() {
		return this.name;
	}

}
