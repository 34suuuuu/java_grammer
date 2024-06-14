package C03Inheritance;


//클래스에는 public과 default 접근 제어자 존재
public class C0304ProtectedClass {
	//	변수, 메서드에는 4가지 접근 제어자 존재
	//	public : 프로젝트 전체에서 접근 가능
	//	protected : 패키지 벗어나더라도 상속관계인 경우네느 접근 가능
	//	default : 패키지내이세머나 접근 가능
	//	private : 클래스내에서만 접근 가능
	private String st1 = "hello java1";
	String st2 = "hello java2";
	protected String st3 = "hello java3";
	public String st4 = "hello java4";
}
