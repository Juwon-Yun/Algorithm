package BackJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Deque_10866 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Integer> deque = new ArrayDeque<>();

		int N = Integer.parseInt(  br.readLine());

		for(int i = 0; i < N; i++){
			String [] sp = br.readLine().split(" ");
			switch (sp[0]){
				case "push_front":{
					deque.addFirst(Integer.parseInt( sp[1]));
					break;
				}
				case "push_back":{
					deque.addLast(Integer.parseInt( sp[1]));
					break;
				}
				case "pop_front":{
					if(deque.isEmpty()){
						sb.append(-1).append("\n");
					}else{
						sb.append(deque.pollFirst())
								.append("\n");
					}
					break;
				}

				case "pop_back":{
					if(deque.isEmpty()){
						sb.append(-1).append("\n");
					}else{
						sb.append(deque.pollLast())
								.append("\n");
					}
					break;
				}

				case "size":{
					sb.append(deque.size()).append("\n");
					break;
				}

				case "empty":{
					if(deque.isEmpty()){
						sb.append(1).append("\n");
					}else{
						sb.append(0).append("\n");
					}
					break;
				}
				case "front":{
					if(deque.isEmpty()){
						sb.append(-1).append("\n");
					}else{
						sb.append(deque.peekFirst()).append("\n");
					}
					break;
				}

				case "back":{
					if(deque.isEmpty()){
						sb.append(-1).append("\n");
					}else{
						sb.append(deque.peekLast()).append("\n");
					}
					break;
				}
			}
		}
		System.out.println(sb);
	}
}