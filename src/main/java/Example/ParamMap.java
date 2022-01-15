package Example;

import java.util.HashMap;
import java.util.Map;

public class ParamMap extends HashMap<String, Object>{

	// new 못하게 => 싱글톤
	private ParamMap(){}

	public static ParamMap init(){
		return new ParamMap();
	}

	public String getString(String key){
		Object o = this.get(key);
		if(o == null){
			return null;
		}else{
			return String.valueOf(o);
		}
	}

	public <T> T get(String key, Class<T> clazz){
		Object o = this.get(key);
		if(o == null){
			return null;
		}else{
//			o.getClass().isAssignableFrom(clazz);
			// 제네릭에서 동적으로 리턴 타입을 만들고 싶을때 사용함
			return (T) o;
		}
	}

	public static void main(String[] args){
		ParamMap param = ParamMap.init();
		param.put("key1", "value1");
		String value = param.getString("key1");
		System.out.println(value);

		StringBuffer sb = new StringBuffer();
		sb.append("test");
		param.put("key2", sb);
		StringBuffer stringBuffer = param.get("key2", StringBuffer.class);
		System.out.println(stringBuffer);
	}

}
