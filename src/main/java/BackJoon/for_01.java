package BackJoon;

import sun.misc.IOUtils;

import java.io.IOException;

import java.util.*;

public class for_01 {
	public static void main(String[] args) {
		/*
		키워드
		(Util)
		Process.(dir);
		process로 cmd 명령어를 날린다.
		 생성
		 storage
		    -> projectName
		        -> src
		            => Main.java ( public class main { public static void main(String [] args) }
				-> class
					=> Main.class
                -> META-INF ( Main Method가 들어가있는 class를 만들어야함 )
                    => MANIFEST.MF에 Main class를 잡아주고 설정이 되어 있어야 Main.java의 main method를 실행할 수 있다 ( 기본으로 잡혀있긴함 )
                    => .javaPath와 .classPath가 설정되어있어야 실행할 준비가 된다.

		순서 컴파일을 하고 자바 파일을 jar로 export 해줘야함
			( 지정한 임의의 dir tree로 잡아둠 )
			임의의 경로를 실행해서 결과를 cmd가 return 해준다


         이제 Jar파일로 빼야함

		 */
		String [] cmd = {};
		try {
			Process process = Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
