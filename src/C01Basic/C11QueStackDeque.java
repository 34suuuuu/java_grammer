package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
	public static void main(String[] args) {
		// Queue<Integer> myQue = new LinkedList<>();
		// myQue.add(10);
		// myQue.add(20);
		// myQue.add(30);
		// System.out.println(myQue.peek());	//10
		// System.out.println(myQue);	//10,20,30
		// System.out.println(myQue.poll());	//10
		// System.out.println(myQue);	//20,30

		// LinkedList와 ArrayList 비교
		// LinkedList의 add
		// long startTime = System.currentTimeMillis();
	// 	LinkedList<Integer> list1 = new LinkedList<>();
	// 	for (int i = 0; i < 10000; i++) {
	// 		list1.add(0, 10);
	// 	}
	// // 	long endTime = System.currentTimeMillis();
	// // 	System.out.println("Linkedlist의 중간삽입 : " + (endTime - startTime));
	// //
	// // 	long startTime2 = System.currentTimeMillis();
	// 	ArrayList<Integer> list2 = new ArrayList<>();
	// 	for (int i = 0; i < 10000; i++) {
	// 		list2.add(0, 10);
	// 	}
	// // 	long endTime2 = System.currentTimeMillis();
	// // 	System.out.println("ArrayList의 중간삽입 : " + (endTime2 - startTime2));
	//
	// 	long startTime3 = System.currentTimeMillis();
	// 	for(int i=0; i<10000; i++){
	// 		list1.get(i);
	// 	}
	// 	long endTime3 = System.currentTimeMillis();
	// 	System.out.println("linkedList의 조회: " + (endTime3-startTime3));
	//
	// 	long startTime4 = System.currentTimeMillis();
	// 	for(int i=0; i<10000; i++){
	// 		list2.get(i);
	// 	}
	// 	long endTime4 = System.currentTimeMillis();
	// 	System.out.println("ArraayList의 조회: " + (endTime4-startTime4));

		// Queue<String> myQue = new LinkedList<>();
		// myQue.add("문서1");
		// myQue.add("문서2");
		// myQue.add("문서3");
		// while (!myQue.isEmpty()) {
		// 	System.out.println(myQue.poll());
		// }

	//	ArrayBlockingQueue : 길이 제한 큐
	// 	Queue<String> que = new ArrayBlockingQueue<>(3);
	//	add를 사용하면 길이제한 초과시 예외 발생
	//	offer
	// 	que.add("10");
	// 	que.add("20");
	// 	que.add("30");
	// // 	que.add("40");
	// 	que.offer("10");
	// 	que.offer("20");
	// 	que.offer("30");
	// 	que.offer("40");
	// 	System.out.println(que);

	//	우선 순위 큐 : 데이터를 꺼낼 때 정렬된 데이터 pop
	//	오름차순이 기본정렬
	// 	Queue<Integer> pq = new PriorityQueue<>();
	// 	pq.add(30);
	// 	pq.add(20);
	// 	pq.add(10);
	// 	pq.add(40);
	// 	pq.add(50);
	// 	System.out.println(pq);
	//
	// 	// System.out.println(pq.poll());
	// 	// System.out.println(pq.poll());
	// 	// System.out.println(pq.poll());
	// 	// System.out.println(pq.poll());
	// 	// System.out.println(pq.poll());
	//
	// 	while (!pq.isEmpty()) {
	// 		System.out.println(pq.poll());
	// 	}

		// 프로그래머스) 더 맵게
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int answer = 0;

		Queue<Integer> pq = new PriorityQueue<>();
		for (int i : scoville) {
			pq.add(i);
		}

		while (pq.peek() < K) {
			if(pq.size() == 1) answer =  -1;
			int first = pq.poll();
			int second = pq.poll();

			pq.add(first + (second * 2));
			answer++;
		}
	}
}
