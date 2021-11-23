package programmers;

import java.util.Arrays;

public class dartGame {
	public static void main(String[] args) {
		String dartRes = "1S*2T*3S";
		int test = solution(dartRes);
		System.out.println("result => "  +  test );
	}
		public static int solution(String dartResult) {
			int answer = 0;
			int score = 0, total = 0, idx = 0, chance = 0;
			int[] scoreArr = new int[3];

			//  S => ^1, D => ^2, T => ^3
			// star => * 2, acha => * -1
			for (int i = 0; i < dartResult.length(); i++) {
				char chr = dartResult.charAt(i);

				// chr가 숫자인지 판별
				if (Character.isDigit(chr)) {
					score = 0;
					if (chr == '1' && dartResult.charAt(i + 1) == '0') {
						score = 10;
						i++;
					} else {
						score = Character.getNumericValue(chr);
					}
					chance++;
				} else {
					switch (chr) {
						case 'S':
//							System.out.println("S idx => " + idx);
//							System.out.println("S score => " + score);
							scoreArr[idx++] = (int) Math.pow(score, 1);

							break;
						case 'D':
//							System.out.println("D idx => " + idx);
//							System.out.println("D score => " + score);
							scoreArr[idx++] = (int) Math.pow(score, 2);
							break;
						case 'T':
//							System.out.println("T idx => " + idx);
//							System.out.println("T score => " + score);
							scoreArr[idx++] = (int) Math.pow(score, 3);
							break;
						case '*':
							// ?? 왜 '*' 갯수만큼 -1 이 되어서 나올까
							System.out.println("* idx => " + idx);
							if(idx -2 < 0){
								idx = 0;
							}else {
								idx -= 2;
							}

							while (idx < chance) {
								scoreArr[idx++] *= 2;
							}
							score = 0;
							break;
						case '#':
							System.out.println("# idx => " + idx);
							scoreArr[idx - 1] *= -1;
							score = 0;
							break;
					}
				}
			}
//			System.out.println("Arrays.toString => " + Arrays.toString(scoreArr));
			for (int result : scoreArr) {
				answer += result;
			}

			return answer;
		}

}
