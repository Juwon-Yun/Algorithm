package BackJoon;

import java.util.Scanner;
import java.util.Stack;

public class stack_02 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i = 0; i < size; i++){
			System.out.println(pop(sc.next()));
		}
	}
	public static String pop(String p_str){
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < p_str.length(); i++){
			char c = p_str.charAt(i);
			if( c == '(' ){
				stack.push(c);
			}else if(stack.empty()){
				return "NO";
			}
			else{
				stack.pop();
			}
		}
		if(stack.empty()){
			return "YES";
		}else{
			return "NO";
		}
	}
}
