package BackJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCard2_10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt( br.readLine() );

		int [] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt( st.nextToken() );
		}

		Arrays.sort(arr);

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");

		for(int i = 0; i < M; i++){
			int key = Integer.parseInt(st.nextToken());
			sb.append(upperBound(arr, key) - lowerBound(arr,key)).append(" ");
		}

		System.out.println(sb);
	}
	public static int lowerBound(int [] arr, int key){
		int lo = 0;
		int hi = arr.length;

		while(lo < hi){
			// int overflow를 생각한 중간 지점 = 시작점 + (거리차) / 2
			int mid = lo  + ((hi - lo) / 2);
			// 중간 위치를 구함
//			int mid = (lo + hi) / 2;

			// key 값이 중간 위치의 값보다 작거나 같을경우(중복원소에 대해 왼쪽[lower]으로 탐색하도록 명령한다.)
			if(key <= arr[mid]){
				hi = mid;
			}else{
				lo = mid + 1;
			}
		}
		return lo;
	}

	public static int upperBound(int[]arr, int key){
		int lo = 0;
		int hi = arr.length;

		while(lo < hi){
//			int mid = (lo + hi) / 2;

			int mid = lo  + ((hi - lo) / 2);

			if(key < arr[mid]){
				hi = mid;
			}else{
				lo = mid + 1;
			}
		}
		return lo;
	}
}
