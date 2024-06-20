package C08Thread;

public class Library {
	static int bookCount = 100;

	// synchronized키워드를 통해서 해당 메서드에 한해서 lock을 걸도록 설정
	public synchronized static void borrow() {
	// public static void borrow() {
		if (bookCount > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			bookCount--;
			System.out.println("대출완료");
			System.out.println("남아 있는 책 수량은 " + bookCount);
		} else {
			System.out.println("대출불가");
		}
	}
}
