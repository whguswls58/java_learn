package p2025_02_27;

import java.util.*;

class Collections05 {
	public static void main(String[] args) {

		Vector vec = new Vector();
		
//		제네릭이 설정되어 있지 않으면, 여러가지 자료형의 자료를 모두 저장 가능
//		add(Object e)		
		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
//		vec.add(30);
//		vec.add(3.14);

//		Object get(int index)
		String temp;
		for (int i = 0; i < vec.size(); i++) {
			
			// 제네릭을 사용하지 않을때 자료구조에서 값을 구해올때 자료형 생략 불가능
			temp = (String) vec.get(i); // 다운 캐스팅
//			temp=vec.get(i);
			System.out.println(vec.get(i));
			System.out.println(temp.toUpperCase());
		}
	}
}
