package BackJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class josephus_1158 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer( br.readLine() );
		int N = Integer.parseInt( st.nextToken() );
		int K = Integer.parseInt( st.nextToken() );

		Queue<Integer> queue = new LinkedList<>();

		for(int i = 1; i <= N; i++){
			queue.offer(i);
		}

		StringBuilder sb = new StringBuilder();

		sb.append("<");

		// Queue의 사이즈가 1이 될떄까지 반복
		while(queue.size() != 1){
			// K -1 번째까지는 처음에 있던 값을 맨 뒤로 보낸다.
			for(int i = 0; i < K -1; i++){
				queue.offer(queue.poll());
			}
			sb.append(queue.poll() + ", ");
		}

		sb.append(queue.poll() + ">");
		bw.write(sb.toString() + "\n");
		bw.flush();
		bw.close();
		br.close();

	}
}
