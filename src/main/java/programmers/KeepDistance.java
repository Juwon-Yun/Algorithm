package programmers;

public class KeepDistance {
	public static void main(String[] args) {
	/*
		5 x 5
		맨해튼 거리 2이하로 앉기 금지

		ex) T1, T2 => (r1, c1), (r2, c2)
		맨해튼 거리 => |r1 - r2| + |c1 - c2|

	 */
		String [][] places = 
		{

				{
					"POOOP"
				  , "OXXOX"
				  , "OPXPX"
				  , "OOXOX"
				  , "POXXP"
				},

				{
					"POOPX"
				  , "OXPXP"
				  , "PXXXO"
				  , "OXXXO"
				  , "OOOPP"
				},

				{
					"PXOPX"
				  , "OXOXP"
				  , "OXPOX"
				  , "OXXOP"
				  , "PXPOX"
				},

				{
					"OOOXX"
				  , "XOOOX"
				  , "OOOXX"
				  , "OXOOX"
				  , "OOOOO"
				},

				{
					"PXPXP"
				  , "XPXPX"
				  , "PXPXP"
				  , "XPXPX"
				  , "PXPXP"
				}

		};

	}
	public static int[] solution(String[][] places) {
		int[] answer = {};

		return answer;
	}
}
