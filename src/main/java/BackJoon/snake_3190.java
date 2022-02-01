package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class snake_3190 {

	private static Queue<Point> direction = new LinkedList<>();
	private static Deque<Point> snakeDeque = new ArrayDeque<>();
	private static int snakeDir = 3;
	private static int [][] map;
	private static int [] dx = {-1, 0, 1, 0};
	private static int [] dy = {0, -1, 0, 1};
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		map = new int [N][N];
		map[0][0] = -1; // 뱀이 있는곳은 -1
		
		snakeDeque.offer(new Point(0, 0));
		
		// 사과 위치 입력받기
		for(int i = 0; i < K; i++){
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			
			// 사과가 있는 곳은 1
			map[x][y] = 1; 
		}
		// 뱀의 방향 변환 정보 입력받기
		int L = Integer.parseInt(br.readLine());
		for(int i = 0; i < L; i++){
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());

			String s = st.nextToken();

			int c;
			if(s.equals("L")){
				c = 0;	// 왼쪽으로 90도 => 0
			}else{
				// 오른쪽으로 90도 => 1
				c = 1;
			}
			direction.add(new Point(x, c));
		}
		int time = 0;

		// X초가 끝난 후
		int X =direction.peek().x;
		// C방향으로 90도 회전
		int C = direction.poll().y;

		while(true){
			time++;

			// 머리를 늘려 위치시킬 다음 칸
			int nx = snakeDeque.peekFirst().x + dx[snakeDir];
			int ny = snakeDeque.peekFirst().y + dy[snakeDir];

			// 벽또는 자신과 부딫힌 경우
			if( nx < 0 || nx >= N || ny < 0 || ny >= N || map[nx][ny] == -1){
				break;
			}
			// 사과라면
			if(map[nx][ny] == 1){
				map[nx][ny] = -1;
				snakeDeque.offerFirst(new Point(nx, ny));
			}else{
				map[nx][ny] = -1;
				snakeDeque.offerFirst(new Point(nx, ny));

				map[snakeDeque.peekLast().x][snakeDeque.pollLast().y] = 0;
			}
			if(time == X){
				if(C == 0){
					snakeDir = (snakeDir + 1) % 4;
				}else{
					snakeDir = (snakeDir + 3) % 4;
				}
				if(!direction.isEmpty()){
					X = direction.peek().x;
					C = direction.poll().y;
				}
			}
		}
		System.out.println(time);
		br.close();
	}
}

class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
