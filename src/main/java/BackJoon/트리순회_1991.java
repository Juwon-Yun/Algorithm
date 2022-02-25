package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 트리순회_1991 {
	// char A => 65, B => 66, C => 67...
	static class Node {
		int left;
		int right;
		public Node(int left, int right){
			this.left = left;
			this.right = right;
		}
	}
	
	static List<Node>[] list;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt( br.readLine() );

		// 최하위 노드의 하위 노드를 순회해야하기 때문에 + 1
		list = new ArrayList[N + 1];

		StringTokenizer st = null;

		for(int i = 1; i < N + 1; i++){
			list[i] = new ArrayList<>();
		}

		for(int i = 1; i < N + 1; i++){
			String [] s = br.readLine().split(" ");
			// 부모 노드 ( 둘다 . 인경우 최하위 노드)
			int data = s[0].charAt(0) - '0'+ 1;
			// 하위 노드의 왼쪽
			int left = s[1].charAt(0) - '0'+ 1;
			// 하위 노드의 오른쪽
			int right = s[2].charAt(0) - '0'+ 1;
			list[data].add(new Node(left, right));
		}

	}

	//	전위 순회 VLR
	static void preOrderTraversal(int start){
		for (Node node : list[start]) {
			int leftNode = node.left;
			int rightNode = node.right;
			sb.append( start + '0' - 1);
			if(leftNode != -18){
				preOrderTraversal(leftNode);
			}
			if( rightNode != -18){

			}

		}
	}
}
