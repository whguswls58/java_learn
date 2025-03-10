package p_java_Test;

import java.util.Hashtable;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();

		// 해쉬 테이블에 키/데이터를 입력한다.
//		put(Object key, Object value)
		ht.put("딸기", 1213);
		ht.put("사과", 132);
		ht.put("포도", 133);
		
		System.out.println(ht);
	}

}
