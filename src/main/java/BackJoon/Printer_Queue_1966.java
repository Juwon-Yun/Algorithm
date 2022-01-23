package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Printer_Queue_1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testNum = Integer.parseInt(br.readLine());

		while(testNum-- > 0){
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken() );
			int M = Integer.parseInt(st.nextToken() );

			LinkedList<int []> q = new LinkedList<>();
			st = new StringTokenizer(br.readLine());

			for(int i = 0; i < N; i++){
				// i => 초기위치
				// st.nextToken() => 중요도
				q.offer( new int [] {i, Integer.parseInt(st.nextToken())} );
			}

			// 출력 횟수
			int cnt = 0;

			// 하나의 케이스에 대한 반복문
			while(!q.isEmpty()){
				// 가장 첫 원소
				int [] front = q.poll();
				// front의 원소가 가장 큰원소인지 판단하는 변수
				boolean isMax = true;
				
				// 큐에 남아있는 원소들과 중료도를 비교하는 반복문
				for(int i = 0; i < q.size(); i++){
					// 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클 경우
					if(front[1] < q.get(i)[1]){
						// 뽑은 원소 및 i 이전의 원소들을 뒤로 보낸다
						q.offer(front);
						for(int j = 0; j < i; j++){
							q.offer(q.poll());
						}
						isMax = false;
						break;
					}
				}

				// front 원소가 가장 큰 원소가 아니였으므로 다음 반복으로 넘어감
				if(!isMax){
					continue;
				}

				// front 원소가 가장 큰 원소였으므로 해당 원소는 출력해야하는 문서임
				cnt++;

				// 찾고자하는 문서라면 해당 테스트케이스 종료
				if(front[0] == M){
					break;
				}

			}
			sb.append(cnt).append("\n");


		}
		System.out.println(sb);
	}
}
