package Example;

/*
	결재 시스템
	- 전처리 : 결재를 기안 시
	- 후처리 : 최종 결재자가 승인 시

	reflextion
	ex) text 로 메소드를 호출하고 parameter에 추가하는 기능

 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflextion01 {
	
	static {
		System.out.println("최초 클래스 로딩 시 호출");
	}
	{
		System.out.println("객체 생성시 마다 호출");
	}
	String data = "data";
	public void Test01(){
		System.out.println("객체 생성1");
	}

	public void Test01(String data){
		System.out.println("객체 생성2");
		this.data = data;
	}

	public void test(String param1){
		System.out.println("test 함수 => " + param1);
	}

	public static void main(String[] args) throws Exception{
		/*
			1. String
				-> Class
				    -> Constructor
				    -> Method
				    -> Feild
				    -> Annotaion

		 */
		Class<?> forName = Class.forName("Example.Reflextion01");
		
		// 객체 생성
		Object newInstance = forName.newInstance(); // => new Test01() 과 동일함

		Constructor<?> constructor1 = forName.getConstructor();// public Test01();
		Constructor<?> constructor2 = forName.getConstructor(String.class);// public Test01(String data);

		Object obj1 = constructor1.newInstance();
		Object obj2 = constructor2.newInstance("data");

		// 객체명.함수()
//		forName.getDeclaredMethod("MethodName", "parameterTypes");
		Method method = forName.getDeclaredMethod("test", String.class);
//		method.invoke("객체", "파라미터값");
		method.invoke(obj1, "parameter");

		// 필드 : Class -> Field
		Field declaredField = forName.getDeclaredField("data");
		declaredField.setAccessible(true);
		declaredField.set(obj1, "필드값1");

		Object object = declaredField.get(obj1);
		declaredField.get(object);

		System.out.println(object);

	}
}
