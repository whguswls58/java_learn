package p2025_02_26;

import java.util.*;

class Collections01 {
	public static void main(String[] args) {
		
		// Set은 인터페이스이기 때문에 자체적으로 객체생성 불가
		Set set = new HashSet();
//		HashSet	set = new HashSet();
		System.out.println("요소의 갯수->" + set.size());
		
		// boolean add(Object e) : 추가 성공하면 true 실패하면 false
		set.add("하나");			// Object e = new String("하나");	   업캐스팅
		set.add(2);							// 업캐스팅 + 박싱
		set.add(3.42);						// 업캐스팅 + 박싱
		set.add("넷");
		set.add("five");
		set.add(6);
		set.add(6);
		
		// Set는 중복된 데이터 저장 불가능, 순차적 x
		System.out.println("요소의 갯수->" + set.size());
		System.out.println(set);

		// Iterator(반복자) : 2, 6, 넷, 하나, 3.42, five
		Iterator elements = set.iterator();
		while (elements.hasNext()) {	// 가져올 데이터가 있을때 true 리턴
			System.out.println("\t\t" + elements.next());
		}

		/*
		 * Vector에만 적용 Enumeration enu = set.elements(); while( enu.hasMoreElements()){
		 * System.out.println( enu.nextElement() ); }
		 */
	}
}
