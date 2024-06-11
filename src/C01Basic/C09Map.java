package C01Basic;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class C09Map {
	public static void main(String[] args) throws IOException {
	// 	Map<String, String> myMap = new HashMap<>();
	// 	myMap.put("basketball", "농구");
	// 	myMap.put("baseball", "야구");
	// 	myMap.put("soccer", "축구");
	// 	System.out.println(myMap);
	// 	System.out.println(myMap.get("soccer"));
	// 	myMap.put("basketball", "크리켓");
	//
	// //	baseball을 map에서 검색하는 복잡도 O(1)
	// 	System.out.println(myMap.get("baseball"));
	// 	System.out.println(myMap);
	// //	putIfAbsent : 비어있으면 put
	// 	myMap.putIfAbsent("basketball", "배구");
	// 	System.out.println(myMap);
	// //	getOrDefault : key가 없으면 default값 return
	// 	System.out.println(myMap.getOrDefault("baseball", "비어있음"));

	// 	String[] arr = {"농구", "농구", "배구", "야구", "배구"};
	// 	Map<String, Integer> myMap = new HashMap<>();
	// 	for (String s : arr) {
	// 		if (myMap.containsKey(s)) {
	// 			myMap.put(s, myMap.get(s) + 1);
	// 		} else {
	// 			myMap.put(s, 1);
	// 		}
	// 		// myMap.put(s, myMap.getOrDefault(s, 0) + 1);
	// 	}
	// 	System.out.println(myMap);
	//
	// //	keySet() : 키목록을 반환
	// //	valyes() : value목록을 반환
	//
	// //	enhanced for문을 통해 Key값 하나씩 출력
	// 	for (String a : myMap.keySet()) {
	// 		System.out.println(a);
	// 		System.out.println(myMap.get(a));
	// 	}
	//
	// 	for (int a : myMap.values()) {
	// 		System.out.println(a);
	// 	}

	//	iterator를 통해 Key값 하나씩 출력
	// 	Iterator<String> myIter = myMap.keySet().iterator();
	// //	next()메서드는 데이터를 하나씩 소모시키면서 return;
	// // 	System.out.println(myIter.next());
	//
	// //	hasNext() : iterator안에 값이 있는지 없는지 boolean return
	// 	while (myIter.hasNext()) {
	// 		System.out.println(myIter.next());
	// 	}

		// String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		// String[] completion = {"josipa", "filipa", "marina", "nikola"};
		// Arrays.sort(partic/*ipant);
		// Arrays.sort(completion);
		//
		// for (int i = 0; i < participant.length - 1; i++) {
		// 	if (!participant[i].equals(completion[i])) {
		// 		System.out.println(participant[i]);
		// 		break;
		// 	}
		// }
		// System.out.println(p*/articipant[participant.length -1]);
		//
		// Map<String, Integer> parti = new HashMap<>();
		// for (String s : participant) {
		// 	parti.put(s, parti.getOrDefault(s, 0) + 1);
		// }
		//
		// for (String s : completion) {
		// 	if (parti.containsKey(s)) {
		// 		if (parti.get(s) == 1) {
		// 			parti.remove(s);
		// 		} else {
		// 			parti.put(s, parti.get(s) - 1);
		// 		}
		// 	}
		// }

		//프로그래머스) 의상
		// String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		// Map<String, Integer> clothesMap = new HashMap<>();
		//
		// for (int i = 0; i < clothes.length; i++) {
		// 	clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0) + 1);
		// }
		// int answer = 1;
		// for (Integer i : clothesMap.values()) {
		// 	answer *= (i + 1);
		// }
		// answer--;
		// System.out.println(answer);

	//	LinkedHashMap : 데이터 삽입순서 유지
	// 	Map<String, Integer> linkedMap = new LinkedHashMap<>();
	// 	linkedMap.put("hello5", 1);
	// 	linkedMap.put("hello4", 1);
	// 	linkedMap.put("hello3", 1);
	// 	linkedMap.put("hello2", 1);
	// 	linkedMap.put("hello1", 1);
	// 	System.out.println(linkedMap);

	//	TreeMap : key를 통해 데이터를 정렬 (최적화)
	// 	Map<String, Integer> treeMap = new TreeMap<>();
	// 	treeMap.put("hello5", 1);
	// 	treeMap.put("hello4", 1);
	// 	treeMap.put("hello3", 1);
	// 	treeMap.put("hello2", 1);
	// 	treeMap.put("hello2", 1);
	// 	treeMap.put("hello1", 1);
	// 	System.out.println(treeMap);

		// 프로그래머스) 문자열 내 마음대로 정렬하기
		// String[] strings = {"sun", "bed", "car"};
		// Map<String, String> treeMap = new TreeMap<>();
		// int n = 1;
		// String[] answer = new String[strings.length];
		// for (String s : strings) {
		// 	treeMap.put(s.charAt(n) + s, s);
		// }
		// int idx  = 0;
		// for (String s : treeMap.values()) {
		// 	answer[idx] = s;
		// 	idx++;
		// }
		// System.out.println(Arrays.toString(answer));








	}
}
