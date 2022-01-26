package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Least_Heap_1927 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		int N = Integer.parseInt(br.readLine());

		for(int i = 0; i < N; i++){
			int x = Integer.parseInt(br.readLine());

			if( x == 0){
				if(pq.size() == 0){
					sb.append(0).append("\n");
				}else{
					sb.append(pq.poll()).append("\n");
				}
			}else{
				pq.offer(x);
			}
		}
		System.out.println(sb);
	}
}
