package algorithm;

public class algorithm_SecletMap {
	public static void main(String[] args) {


	}

	public static String[] solutions(int n, int[] arr1, int [] arr2){
		String [] answer = {};
		int[][] tempArr = new int [n][n];

		for(int i =0; i < arr1.length; i++){
				int temp = 0;
				String a = "";
				String zero = "0";
				a = Integer.toBinaryString(arr1[i]);
				if(n > a.length()){
					for(int j = 0; j <= n; n++){
						a = zero + a;
					}
				}
		}


		return  answer;
	}
}
