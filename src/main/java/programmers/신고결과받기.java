package programmers;

import javax.smartcardio.TerminalFactory;
import java.util.*;

public class 신고결과받기 {
	public static void main(String[] args) {

		String [] id_list = {"muzi", "frodo", "apeach", "neo"};

		String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

		int k = 2;

		int[] res = solution(id_list, report, k);

		System.out.println(Arrays.toString(res));
	}
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int [id_list.length];

		Map<String, HashSet<String>> actorId = new HashMap<>();

		Map<String, Integer> receiveCount = new HashMap<>();

		for (String s : id_list) {
			receiveCount.put(s, 0);
			actorId.put(s, new HashSet<>());
		}

		for (String s : report) {
			String [] temp = s.split(" ");
			actorId.get(temp[1]).add(temp[0]);
		}

		for (String key : actorId.keySet()) {
			HashSet<String> actor = actorId.get(key);
			if(actor.size() >= k){
				for (String s : actor) {
					Integer integer = receiveCount.get(s);
					receiveCount.put(s, integer + 1);
				}
			}
		}
		for(int i = 0; i < answer.length; i++){
			answer[i] = receiveCount.get(id_list[i]);
		}
		return answer;

	}
}
