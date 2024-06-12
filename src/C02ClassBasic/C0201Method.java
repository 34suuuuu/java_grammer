package C02ClassBasic;

public class C0201Method {
	public static void main(String[] args) {

	//	for문을 이용해서 1~10까지 total값 출력
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
		}
		System.out.println(total);

	//	코드의 중복이 발생하므로, 반복을 피하기 위해 위 기능을 분리
		System.out.println(sumAcc(100, 200));

	//	클래스명.메서드 : 기본방식
	//	같은 클래스내에서의 클래스메서드 호출은 클래스명 생략가능
	}

	//	int라는 리턴타입을 가짐
	//	input(매개변수) 값을 int 2개로 정의
	//	메서드 구성요소 : 매개변수, 리턴타입, 접근제어자(public), 클래스메서드여부(static)
	public static int sumAcc(int start, int end) {
		int total = 0;
		for (int i = start; i <= end; i++) {
			total += i;
		}
		return total;
	}


}
