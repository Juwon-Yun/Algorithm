package BackJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 피보나치수_2 {

	static  long[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		arr = new long[N  + 1];

		for(int i = 0; i < N + 1; i++){
			arr[i] = -1;
		}

		arr[0] = 0;
		arr[1] = 1;

		System.out.println(fibo(N));
	}
	public static long fibo(int n){
		if(arr[n] == -1){
			arr[n] = fibo(n - 1) + fibo(n - 2);
		}
		return arr[n];
	}
}
