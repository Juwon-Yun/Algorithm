package BackJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Deque_10866 {
	private static Deque<Integer> deque;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt( br.readLine() );

		deque = new LinkedList<>();

		for(int i = 0; i <= N; i++){
			String str = br.readLine();
			int temp = 0;
			switch (str){
				case "push_front":
					temp = Integer.parseInt( br.readLine() );
					push_front( temp );
					break;
				case "push_back":
					temp = Integer.parseInt( br.readLine() );
					push_back( temp );
					break;
				case "pop_front":
					temp = pop_front();
					sb.append(temp).append("\n");
					break;
				case "pop_back":
					temp = pop_back();
					sb.append(temp).append("\n");
					break;
				case "size":
					temp = size();
					sb.append(temp).append("\n");
					break;
				case "empty":
					temp = empty();
					sb.append(temp).append("\n");
					break;
				case "front":
					temp = front();
					sb.append(temp).append("\n");
					break;
				case "back":
					temp = back();
					sb.append(temp).append("\n");
					break;
			}
		}
		System.out.println(sb);
	}
	public static void push_front(int item){
		deque.addFirst(item);
	}

	public static void push_back(int item){
		deque.addLast(item);
	}

	public static int pop_front(){
		return deque.size() == 0 ? -1 : deque.pollFirst();
	}

	public static int pop_back(){
		return deque.size() == 0 ? -1 : deque.pollLast();
	}

	public static int size(){
		return deque.size();
	}

	public static int empty(){
		return deque.size() == 0 ? 1 : 0;
	}

	public static int front(){
		if(deque.size() == 0) {
			return -1;
		}
		return deque.pollFirst();
	}

	public static int back(){
		if(deque.size() == 0) {
			return -1;
		}
		return deque.pollLast();
	}
}
