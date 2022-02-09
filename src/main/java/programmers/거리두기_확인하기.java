package programmers;

public class 거리두기_확인하기 {
	public static void main(String[] args) {
		
		// 대기실은 5개이며, 각 대기실은 5x5 크기입니다.
		// 거리두기를 위해 배열간 거리가 2이하로 앉기 금지
		// 응시자가 앉아있는 자리 사이가 파티션으로 되어있는 경우에는 허용
		// 거리두기를 지키면 1 한명이라도 안지키면 0 리턴
		
		// p => 응시자
		// o => 빈 테이블
		// x => 파티션

		// 1차원 정수 배열에 5개의 원소를 담아서 return

		String [][]temp = {
				{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}
				, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}
				, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}
				, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}
				, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
		};

		String [][] res = solution(temp);

		for (String[] re : res) {
			for (String s : re) {
				System.out.println(s);
			}
		}

	}

	public static String [][] solution(String [][] places){
		int [] answer = {};


		String [][] temp = places;



		for (int i = 0; i < places.length; i++){
			for(int j = 0; j < places[i].length; j++){
			}
		}



		return temp;
	}
}
