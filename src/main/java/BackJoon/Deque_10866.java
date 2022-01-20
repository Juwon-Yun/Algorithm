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
			switch (str){
				case "push_front":

					break;
				case "push_back":
					break;
				case "pop_front":
					break;
				case "pop_back":
					break;
				case "size":
					break;
				case "empty":
					break;
				case "front":
					break;
				case "back":
					break;
			}
		}
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
