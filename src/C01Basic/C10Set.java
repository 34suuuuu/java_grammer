package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class C10Set {
	public static void main(String[] args) {
		// Set<String> mySet = new HashSet<>();
		// mySet.add("h");
		// mySet.add("h");
		// mySet.add("e");
		// mySet.add("l");
		// mySet.add("l");
		// mySet.add("o");
		// System.out.println(mySet);

		// 프로그래머스) 폰켓몬
		// int[] nums = {3, 3, 3, 2, 2, 4};
		// int num = nums.length / 2;
		// Set<Integer> numSet = new HashSet<>();
		// for (int i : nums) {
		// 	numSet.add(i);
		// }
		// int answer = num > numSet.size() ? numSet.size() : num;

	// 	List<String> myList = new ArrayList<>();
	// 	myList.add("tennis");
	// 	myList.add("basketball");
	// 	myList.add("basketball");
	// 	myList.add("baseball");
	// 	myList.add("baseball");
	//
	// //	list자체를 인자값으로 받아서 초기값 세팅 가능
	// 	Set<String> mySet = new HashSet<>(myList);
	// 	System.out.println(mySet);
	//
	// 	String[] arr = {"baseball", "basketball", "basketball"};
	// 	Set<String> mySet2 = new HashSet<>(Arrays.asList(arr));
	// 	mySet2.remove("baseball");
	// 	System.out.println(mySet2);

		// 프로그래머스) 전화번호 목록
		// String[] phone_book = {"119", "97674223", "1195524421"};
		// Arrays.sort(phone_book);

		// for (int i = 0; i < phone_book.length; i++) {
		// 	if (phone_book[i + 1].startsWith(phone_book[i])) {
		// 		return false;
		// 	}
		// }
		// return true;

		// Set<String> mySet = new HashSet<>(Arrays.asList(phone_book));
		// boolean answer = true;
		// for (String s : phone_book) {
		// 	for (int i = 0; i < s.length(); i++) {
		// 		if (mySet.contains(s.substring(0, i))) {
		// 			answer = false;
		// 			break;
		// 		}
		// 	}
		// }

		// 집합 관련 함수 : 교집합(retainAll), 합집합(addAll), 차집합(removeAll)
		// Set<String> set1 = new HashSet<>(Arrays.asList("java", "python", "javascript"));
		// Set<String> set2 = new HashSet<>(Arrays.asList("java", "html", "css"));

		// set1.retainAll(set2);
		// System.out.println(set1);
		// set1.addAll(set2);
		// System.out.println(set1);
		// set1.removeAll(set2);
		// System.out.println(set1);

		//	관련 문제 : 프로그래머스) 뉴스 클러스터링

		//	LinkedHashSet, TreeSet
		// Set<String> mySet = new TreeSet<>();
		// mySet.add("hello5");
		// mySet.add("hello5");
		// mySet.add("hello4");
		// mySet.add("hello1");
		// System.out.println(mySet);


		//	두개 뽑아서 더하기
		// int[] numbers = {2, 1, 3, 4, 1};
		// Set<Integer> mySet = new TreeSet<>();
		// for (int i = 0; i < numbers.length - 1; i++) {
		// 	for (int j = i + 1; j < numbers.length; j++) {
		// 		mySet.add(numbers[i] + numbers[j]);
		// 	}
		// }
		//
		// int idx = 0;
		// int[] answer = new int[mySet.size()];
		// for (Integer i : mySet) {
		// 	answer[idx] = i;
		// 	idx++;
		// }

 	}
}
