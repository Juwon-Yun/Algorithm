package BackJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Deque_10866 {
		public static void  main(String[] args) throws Exception {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
			StringBuilder sb = new StringBuilder();

			int N = Integer.parseInt(br.readLine());

			for (int i = 0; i < N; i++) {

				String[] s = br.readLine().split(" ");

				// 첫 번째 단어에 대한 switch-case
				switch (s[0]) {

					case "push_front": {
						dq.addFirst(Integer.parseInt(s[1]));
						break;
					}

					case "push_back": {
						dq.addLast(Integer.parseInt(s[1]));
						break;
					}

					case "pop_front": {
						if (dq.isEmpty()) {
							sb.append(-1).append('\n');
						}
						else {
							sb.append(dq.pollFirst()).append('\n');
						}
						break;
					}

					case "pop_back": {
						if (dq.isEmpty()) {
							sb.append(-1).append('\n');
						}
						else {
							sb.append(dq.pollLast()).append('\n');
						}
						break;
					}

					case "size": {
						sb.append(dq.size()).append('\n');
						break;
					}

					case "empty": {
						if (dq.isEmpty()) {
							sb.append(1).append('\n');
						}
						else {
							sb.append(0).append('\n');
						}
						break;
					}

					case "front": {
						if (dq.isEmpty()) {
							sb.append(-1).append('\n');
						}
						else {
							sb.append(dq.peekFirst()).append('\n');
						}
						break;
					}

					case "back": {
						if (dq.isEmpty()) {
							sb.append(-1).append('\n');
						}
						else {
							sb.append(dq.peekLast()).append('\n');
						}
						break;
					}
				}
			}
			System.out.println(sb);
		}
	}
		//		deque = new LinkedList<>();
//
//		for(int i = 0; i <= N; i++){
//			String str = br.readLine();
//			int temp = 0;
//			switch (str){
//				case "push_front":
//					temp = Integer.parseInt( br.readLine() );
//					push_front( temp );
//					break;
//				case "push_back":
//					temp = Integer.parseInt( br.readLine() );
//					push_back( temp );
//					break;
//				case "pop_front":
//					temp = pop_front();
//					sb.append(temp).append("\n");
//					break;
//				case "pop_back":
//					temp = pop_back();
//					sb.append(temp).append("\n");
//					break;
//				case "size":
//					temp = size();
//					sb.append(temp).append("\n");
//					break;
//				case "empty":
//					temp = empty();
//					sb.append(temp).append("\n");
//					break;
//				case "front":
//					temp = front();
//					sb.append(temp).append("\n");
//					break;
//				case "back":
//					temp = back();
//					sb.append(temp).append("\n");
//					break;
//			}
//		}
//		System.out.println(sb);
//	}
//	public static void push_front(int item){
//		deque.addFirst(item);
//	}
//
//	public static void push_back(int item){
//		deque.addLast(item);
//	}
//
//	public static int pop_front(){
//		return deque.size() == 0 ? -1 : deque.pollFirst();
//	}
//
//	public static int pop_back(){
//		return deque.size() == 0 ? -1 : deque.pollLast();
//	}
//
//	public static int size(){
//		return deque.size();
//	}
//
//	public static int empty(){
//		return deque.size() == 0 ? 1 : 0;
//	}
//
//	public static int front(){
//		if(deque.size() == 0) {
//			return -1;
//		}
//		return deque.pollFirst();
//	}
//
//	public static int back(){
//		if(deque.size() == 0) {
//			return -1;
//		}
//		return deque.pollLast();
//	}
