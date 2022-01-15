package Example;

import java.util.HashMap;
import java.util.Map;

public class Test01_Variable {

	public static void main(String [] args){

		int a = 1;
		String b = "test";
		Map<String, String> c = new HashMap<>();
		c.put("key1", "value1");

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		test(a, b, c);

		// 값을 바라봄
		System.out.println(a);
		// String의 기본이 다르기 때문에 ( 크기를 정할 수 없기 때문에 )
		// String의 instance 풀에 메모리 주소가 계속 바뀌기 때문에
		System.out.println(b);
		// map은 참조형
		System.out.println(c);
	}

	public static void test(int a, String b, Map<String, String> c){
		a = 2;
		b = "test02";
		// 주소값이 바뀜
//		c = new HashMap<>();
		c.put("key1", "value2");
	}

}
