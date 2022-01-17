package BackJoon;

import java.util.*;

public class Queue_01 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		int back = -1;
		int size = sc.nextInt();

		for(int i = 0; i < size; i++){
			String str = sc.next();

			switch (str){
				case "push" :
					back = sc.nextInt();
					queue.offer(back);
					break;
				case "pop" :
					if(queue.isEmpty()){
						builder.append("-1").append("\n");
						break;
					}
					builder.append(queue.poll()).append("\n");
					break;
				case "size" :
					builder.append(queue.size()).append("\n");
					break;
				case "empty" :
					builder.append(queue.isEmpty() ? 1:0).append("\n");
					break;
				case "front" :
					builder.append(queue.isEmpty()? -1:queue.peek()).append("\n");
					break;
				case "back" :
					builder.append(queue.isEmpty()? -1 : back).append("\n");
					break;

			}
		}
		System.out.println(builder);
	}

}
