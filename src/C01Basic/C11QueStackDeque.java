package C01Basic;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
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
		// int[] scoville = {1, 2, 3, 9, 10, 12};
		// int K = 7;
		// int answer = 0;
		//
		// Queue<Integer> pq = new PriorityQueue<>();
		// for (int i : scoville) {
		// 	pq.add(i);
		// }
		//
		// while (pq.peek() < K) {
		// 	if(pq.size() == 1) answer =  -1;
		// 	int first = pq.poll();
		// 	int second = pq.poll();
		//
		// 	pq.add(first + (second * 2));
		// 	answer++;
		// }

	//	stack
	// 	Stack<Integer> st1 = new Stack<>();
	// 	st1.push(10);
	// 	st1.push(20);
	// 	st1.push(30);
	//
	// 	// pop : 스택에서 요소를 제거 후 해당 요소 반환
	// 	System.out.println(st1.pop());
	// 	System.out.println(st1.peek());
	// 	System.out.println(st1.size());
	// 	System.out.println(st1.isEmpty());

	//	String객체 5개 정도 Stack 추가 후에 while문을 통해 출력
	// 	Stack<String> st2 = new Stack<>();
	// 	st2.push("a");
	// 	st2.push("b");
	// 	st2.push("c");
	// 	st2.push("d");
	// 	st2.push("e");
	//
	// 	while (!st2.isEmpty()) {
	// 		System.out.println(st2.pop());
	// 	}

	//	같은 숫자는 싫어
	// 	int[] arr = {1, 1, 3, 3, 0, 1, 1};
	// 	Stack<Integer> stack = new Stack<>();
	//
	// 	stack.add(arr[0]);
	// 	for (int i : arr) {
	// 		if (i != stack.peek()) {
	// 			stack.add(i);
	// 		}
	// 	}
	// 	int idx = stack.size() - 1;
	// 	int[] answer = new int[stack.size()];
	// 	while (!stack.isEmpty()) {
	// 		answer[idx] = stack.pop();
	// 		idx--;
	// 	}

		// List<Integer> myList = new ArrayList<>();
		// for (int i = 0; i < arr.length; i++) {
		// 	if (i == 0 || arr[i - 1] != arr[i]) {
		// 		myList.add(arr[i]);
		// 	}
		// }
		// System.out.println(myList);

	//	올바른 괄호
	// 	String s = "()()";
	// 	boolean answer = false;
	// 	Stack<Character> stack = new Stack<>();
	// 	for (char c : s.toCharArray()) {
	// 		if (c == '(') {
	// 			stack.add(c);
	// 		} else {
	// 			if (stack.size() == 0) {
	// 				answer = false;
	// 				System.out.println(answer);
	// 				return;
	// 			}
	// 			if (stack.peek() == '(') {
	// 				stack.pop();
	// 			}
	// 		}
	// 	}
	// 	if (stack.size() == 0) {
	// 		answer = true;
	// 	} else {
	// 		answer = false;
	// 	}
	// 	System.out.println(answer);


	//	Deque
		Deque<Integer> d1 = new ArrayDeque<>();
		d1.addLast(10);
		d1.addLast(20);
		System.out.println(d1);
		d1.addFirst(30);
		System.out.println(d1);
		System.out.println(d1.peekFirst());
		System.out.println(d1.peekLast());

	//	프로그래머스) 다리를 지나는 트럭


	}
}
