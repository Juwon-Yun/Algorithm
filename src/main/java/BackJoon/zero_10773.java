package BackJoon;

import java.util.Scanner;
import java.util.Stack;

public class zero_10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int max_idx = sc.nextInt();
		int sum = 0;

		for(int i =0; i < max_idx; i++){
			int num = sc.nextInt();
			if(num == 0){
				stack.pop();
			}else{
				stack.push(num);
			}
		}

		for (Integer element : stack) {
			sum += element;
		}
		System.out.println(sum);
	}
}
