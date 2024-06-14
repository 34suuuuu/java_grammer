package C04Interface;

public interface StaticFinalInterface {
	public static void main(String[] args) {

		MyImplements m1 = new MyImplements();
		m1.methodA();
		//MyImplements에 my_constant변수가 상속(static final)
		System.out.println();
	}
}

interface  MyInterface{
	//	아래 변수는 컴파일타임에 static final키워드가 붙음
	int my_constant = 10;
}

class MyImplements implements MyInterface{

	public void methodA(){
		System.out.println("methodA");
	}

}
