package BackJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IronStick_10799 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();

		int open = 0;
		int res = 0;

		for(int i = 0; i < input.length(); i++){
			char c = input.charAt(i);

			if(c == '('){
				open++;
			}else{
				open--;
				if(input.charAt(i - 1) == '('){
					res += open;
				}else{
					res++;
				}

			}
		}
		bw.write(res + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
//
//		Stack<Character> stack = new Stack<>();
//
//		int res = 0;
//
//		for(int i = 0; i < input.length(); i++){
//			if(input.charAt(i) == '('){
//				stack.push('(');
//				continue;
//			}
//
//			if(input.charAt(i) == ')'){
//				stack.pop();
//				if(input.charAt(i - 1) == '('){
//					res += stack.size();
//				}else{
//					res++;
//				}
//			}
//		}
//
//		bw.write(res + "\n");
//		bw.flush();
//		bw.close();
//		br.close();
//
//	}
