package BackJoon;

import java.util.Scanner;

public class stack {

	public static int [] stack;
	public static int size = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();


		int N = sc.nextInt();

		stack = new int[N];

		for(int i = 0; i < N; i++) {

			String str = sc.next();

			switch (str) {

				case "push":
					push(sc.nextInt());
					break;

				case "pop":
					builder.append(pop()).append('\n');
					break;

				case "size":
					builder.append(size()).append('\n');
					break;

				case "empty":
					builder.append(empty()).append('\n');
					break;

				case "top":
					builder.append(top()).append('\n');
					break;
			}

		}
		System.out.println(builder);
	}


	public static void push(int item) {
		stack[size] = item;
		size++;
	}

	public static int pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int res = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return res;
		}
	}

	public static int size() {
		return size;
	}

	public static int empty() {
		if(size == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public static int top() {
		if(size == 0) {
			return -1;
		}
		else {
			return stack[size - 1];
		}
	}

}
