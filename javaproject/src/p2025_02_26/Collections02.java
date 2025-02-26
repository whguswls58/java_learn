package p2025_02_26;

import java.util.*;

class Collections02 {

	public static void main(String[] args) {
//  	List list = new List();		//List 인터페이스는 자체적으로 객체생성을 할수 없다
		
		List ls = new ArrayList();			// 업캐스팅
		ArrayList list = new ArrayList();
		
		list.add("하나");
		list.add(2);			// 중복 데이터 저장 가능
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(6);

		System.out.println(list);

	}
}
