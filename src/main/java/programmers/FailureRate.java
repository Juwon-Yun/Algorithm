package programmers;

import java.util.*;

public class FailureRate {
	public static void main(String[] args) {
		/*

		    실패율의 정의
		     => 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수

			전체 스테이지의 수 => N
			게임을 이용하는 사용자가 현재 멈춰 있는 스테이지의 번호가 담긴 배열 => stages(<- parameter)
			실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return

			N => 1 <= N >= 500
			stages.length => 1 <= stages.length >= 200000
			stages[index.element] => 1 <= element >= N + 1
					   element -> 현재 도전 중인 스테이지의 번호
					   N + 1 -> 마지막스테이지(500)를 클리어한 사용자
			만약 같은 실패율이 같은 스테이지가 있다면 더 작은 번호의 스테이지가 먼저 오도록 한다
			스테이지에 도달한 유저가 없는 경우 스테이지의 실패율은 0

		 */

		int [] stages = {4,4,4,4,4};

		int[] result = solution(4, stages);

		System.out.println(Arrays.toString(result));

	}

//	stage를 클리어하지 못한 사람은 다음스테이지에서 총 num - 1해줘야함
	public static int [] solution(int N, int [] stages){
		int [] answer = new int [N];

		int [] stage = new int[N + 1];

		// stage에 도달한 사람 수
		int num = stages.length;

		int temp = 0;

		List<Integer> failRate = new ArrayList<>();

		// i => stage Number
		for (int i : stage) {
			if(i == N + 1){
				continue;
			}
			stage[i]++;
		}



		for(int i = 1; i < stage.length; i++){
			temp = stage[i];

			if( num == 0 ){
				stage[i] = 0;
			}else{
				stage[i] = stage[i] / num;
				
				num = num - temp;
			}
			failRate.add(stage[i]);
		}

		System.out.println(failRate.toString());

		// 내림차순 정렬
		Collections.sort(failRate, Collections.reverseOrder());

		for(int i =0; i < failRate.size(); i++){
			for(int j = 1; j < stage.length; j++){
				if(failRate.get(i) == stage[j]){
					answer[i] = j;
					stage[j] = -1;
					break;
				}
			}
		}


		return answer;
	}

}
