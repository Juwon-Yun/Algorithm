package BackJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class find_1920 {

	public static int [] p_arr;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(  br.readLine() );
		p_arr = new int[num];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for(int i = 0; i < num; i++){
			p_arr[i] = Integer.parseInt(  st.nextToken() );
		}
		Arrays.sort(p_arr);
		int M = Integer.parseInt( br.readLine() );
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < M; i ++){
			if(binarySearch(Integer.parseInt(st.nextToken())) >= 0){
				sb.append(1);
			}else {
				sb.append(0);
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}
	public static int binarySearch(int num){
		int low = 0;
		int height = p_arr.length -1;

		while(low <= height){
			int middleIdx = (low + height) / 2;

			// num이 중간 위치의 값보다 작을 경우
			// middleIdx보다 왼쪽에 위치함
			// height가 재정의 되어야함
			if(num < p_arr[middleIdx]){
				height = middleIdx - 1 ;

			// num이 중간 위치의 값보다 클 경우
			// middleIdx보다 오른쪽에 위치함
			// low가 재정의 되어야함
			}else if(num > p_arr[middleIdx]){
				low = middleIdx + 1;

			// num이 중간 위치의 값이 같을 경우
			}else{
				return middleIdx;
			}

		}

		// 찾을 값이 없는 경우
		return -1;
	}
}

