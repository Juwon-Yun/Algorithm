package BackJoon;


import java.util.PriorityQueue;

public class Priority_queue {

	public static void main(String[] args) {
		// 결과값 : 1 3 5 6 23  
		// 자기가 알아서 정렬해줌
		PriorityQueue<Integer> priorityQueue  = new PriorityQueue<>();

		// 우선순위가 높은 숫자 순으로 정렬
		// 결과값 : 23 6 5 3 1
//		PriorityQueue<Integer> priorityQueue  = new PriorityQueue<>(Collections.reverseOrder());

		int N = 5;
		priorityQueue.offer(3);
		priorityQueue.offer(5);
		priorityQueue.offer(6);
		priorityQueue.offer(23);
		priorityQueue.offer(1);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++){
			sb.append(priorityQueue.poll()).append(" ");
		}
		System.out.println(sb);
	}
}

