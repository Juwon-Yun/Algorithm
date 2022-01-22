package BackJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Card2_2164 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt( br.readLine() );
		Queue<Integer> q = new LinkedList<>();

		for(int i = 1; i <= N; i++){
			q.add(i);
		}

		while(q.size() > 1){
			q.poll();
			int temp = q.poll();
			q.offer(temp);
		}

		sb.append(q.poll()).append("\n");
		System.out.println(sb);
	}
}
