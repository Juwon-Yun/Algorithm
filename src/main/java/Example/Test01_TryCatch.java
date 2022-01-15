package Example;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test01_TryCatch {
	public static void main(String[] args) throws  Exception{

		/* 심상원 선생님께서 쓰는 파일 읽기*/

		BufferedReader br = new BufferedReader(new FileReader(""));
		while(true){
			String readLine = br.readLine();
			if(readLine == null){break;}
			System.out.println(readLine);
		}
		br.close();
	}
}
