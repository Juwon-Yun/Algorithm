package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Max_Heap_11279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		int N = Integer.parseInt( br.readLine() );

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for(int i = 0; i < N; i++){
			int temp = Integer.parseInt(br.readLine());

			if(temp == 0){
				sb.append(pq.size() == 0 ? 0 : pq.poll()).append("\n");
			}else{
				pq.offer(temp);
			}

		}
		System.out.println(sb);

	}
}
