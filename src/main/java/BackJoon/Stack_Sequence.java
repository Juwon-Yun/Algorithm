package BackJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_Sequence {

//	private static Stack<Integer> stack;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt( br.readLine() );

		int [] stack = new int[N];

		int idx = 0;
		int start = 0;

		while(N-- > 0){
			int value = Integer.parseInt(br.readLine());
			if(value > start){
				for(int i = start + 1; i <= value; i++){
					stack[idx] = i;
					idx++;
					sb.append("+").append("\n");
				}
				start = value;
			}

			else if(stack[idx-1] != value){
				System.out.println("NO");
				return;
			}

			idx--;
			sb.append("-").append("\n");
		}
		System.out.println(sb);
		br.close();
	}
//		int N = Integer.parseInt( st.nextToken() );
//		int start = 0;
//		stack = new Stack<>();
//
//		stack.push(start);
//
//		for(int i = 0; i <= N; i++){
//			if(stack.peek() > Integer.parseInt(st.nextToken()) ){
//				push(Integer.parseInt( st.nextToken() ));
//				sb.append("+").append("\n");
//			}else if(stack.peek() <= Integer.parseInt( st.nextToken()) ){
//				pop();
//				sb.append("-").append("\n");
//			}
//		}
//		bw.write( sb.toString() + "\n" );
////		bw.flush();
////		bw.close();
////		br.close();
//
//	public static void push(int item){
//		stack.push(item);
//	}
//
//	public static void pop(){
//		stack.pop();
//	}

}
