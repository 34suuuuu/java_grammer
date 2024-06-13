package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0207RecurCombiPermu {
	static List<List<Integer>> answer;
	static List<Integer> myList;
	static int cnt;

	public static void main(String[] args) {

		// List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

	//	myList로 만들 수 있는 2개짜리 숫자 조합을 2중 리스트에 담기
	// 	List<Integer[]> result = new ArrayList<>();
	// 	List<List<Integer>> answer = new ArrayList<>();
	// 	List<Integer> tmp = new ArrayList<>();
	//
	// 	int cnt = 0;
	// 	for (int i = 0; i < myList.size()-1; i++) {
	// 		tmp.add(myList.get(i));
	// 		for (int j = i + 1; j < myList.size(); j++) {
	// 			tmp.add(myList.get(j));
	// 			comb(myList, answer, tmp, cnt, i);
	// 			tmp.remove(myList.size() - 1);
	// 		}
	// 		tmp.remove(myList.size() - 1);
	// 	}

		myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		answer = new ArrayList<>();
		cnt = 2;

		// comb(new ArrayList<>(), 0);
		// System.out.println(answer);

		//	이미 방문한 지점을 확인하기 위해서 visited
		boolean[] visited = new boolean[myList.size()];
		permutation(new ArrayList<>(), visited);
		System.out.println(answer);

	}

	static void comb(List<Integer> tmp, int start) {
		if (tmp.size() == cnt){
			// tmp값을 그대로 add할 경우 tmp메모리값이 add되므로,
			// 모든 answer리스트에 같은 tmp리스트 add
			answer.add(new ArrayList<>(tmp));
			return ;
		}

		for (int i = start; i < myList.size(); i++) {
			tmp.add(myList.get(i));
			comb(tmp, i + 1);
			tmp.remove(tmp.size() - 1);
		}
	}

	static void permutation(List<Integer> tmp, boolean[] visited) {
		if (tmp.size() == cnt){
			// tmp값을 그대로 add할 경우 tmp메모리값이 add되므로,
			// 모든 answer리스트에 같은 tmp리스트 add
			answer.add(new ArrayList<>(tmp));
			return ;
		}

		for (int i = 0; i < myList.size(); i++) {
			if (!visited[i]) {
				visited[i] = true;
				tmp.add(myList.get(i));
				permutation(tmp,visited);
				tmp.remove(tmp.size() - 1);
				visited[i] = false;
			}

		}
	}

}
