package p2025_02_26;

import java.util.*;

class Collections04 {

	public static void main(String[] args) {
		List list = new ArrayList(); // 업캐스팅
//	ArrayList list = new ArrayList();

		list.add("하나");
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(6);
		
		System.out.println(list);

		System.out.println(list.get(2));		// 인덱스 2번 원소 추출
		System.out.println(list.get(4));
		
		// Object get(int index)
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(i + " 번째 요소는 " + list.get(i));
			Object s = list.get(i);
//			String s = (String) (list.get(i));
			System.out.println(s);
		}

		// 향상된 for문
		for(Object s : list ) {
			System.out.print(s + "\t");
		}
		
		// Iterator(반복자)
		Iterator elements = list.iterator();
		while (elements.hasNext()) {
			System.out.println("\t\t" + elements.next());
		}

	}
}
