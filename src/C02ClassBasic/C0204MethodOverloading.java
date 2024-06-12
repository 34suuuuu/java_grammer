package C02ClassBasic;

public class C0204MethodOverloading {

	public static void main(String[] args) {
		C0204MethodOverloading overloading = new C0204MethodOverloading();
		System.out.println(overloading.sum(10, 20));
	}

	//	접근제어자를 안붙이면 기본적으로 default 접근제어자 : 같은 패키지내에서만 유효
	int sum(int a, int b) {
		return a + b;
	}

	int sum(int a, int b, int c) {
		return a + b + c;
	}

	// 매개변수의 타입 또는 개수가 다르면,같은 이름과 메소드 정의 가능 즉, 메서드 오버로딩
	double sum(double a, double b) {
		return a + b;
	}

}
