package p2025_02_27;

import java.util.*;

class HashTableTest {
	public static void main(String[] args) {

/*		업캐스팅
		1. 업캐스팅이 되면 참조 가능한 영역의 축소 발생
		2. 업캐스팅이 되면 부모가 상속해준 메소드만 접근 가능
*/		
//		Map ht = new Hashtable();			// 업캐스팅
		Hashtable ht = new Hashtable();
		
		// 해쉬 테이블에 키/데이터를 입력한다.
//		put(Object key, Object value)
		ht.put("딸기", "StrawBerry");
		ht.put("사과", "Apple");
		ht.put("포도", "Grapes");

		// 해쉬 테이블의 값을 키를 이용하여 얻는다.
		
//	방법1. key를 알고 있는 경우 (보통은 키를 알고 있기 때문에 이 방식을 많이 씀)
		// Object get(Object key)
		// Object obj = ht.get("포도");
		String Val = (String) ht.get("포도");
		if (Val != null) {
			System.out.println("포도-> " + Val);
		}
		
		String s = (String)ht.get("딸기");
		String a = (String)ht.get("사과");

//	방법2. key를 모르는 경우
		// keys() 메소드는 Hashtable에만 존재 - Map으로 업캐스팅하면 해당 메소드 사용 불가능
		// 열거형(Enumeration) : 딸기, 사과, 포도
		Enumeration Enum = ht.keys();			
		while (Enum.hasMoreElements()) {
			Object k = Enum.nextElement();
			Object v = ht.get(k);
			System.out.println(k + " : " + v);
		}
	}
}
