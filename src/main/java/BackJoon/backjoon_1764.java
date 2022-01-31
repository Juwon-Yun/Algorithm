package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class backjoon_1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		String [] inputs = br.readLine().split(" ");

		int N =Integer.parseInt( inputs[0] );

		int M =Integer.parseInt( inputs[1] );

		HashSet<String> strSet = new HashSet<>();
		ArrayList<String> resList = new ArrayList<>();

		for(int i = 0; i < N; i++){
			strSet.add(br.readLine());
		}

		for(int i = 0; i < M; i++){
			String temp = br.readLine();
			if(strSet.contains(temp)){
				resList.add(temp);
			}
		}

		Collections.sort(resList);

		sb.append(resList.size()).append("\n");

		for (String s : resList) {
			sb.append(s).append("\n");
		}
		System.out.println(sb);


	}
}
