package p2025_02_27;

import java.util.*;

class Collections06 {
	public static void main(String[] args) {
		
//		제네릭 사용 경우
//		제네릭 : 자료구조에 한가지 자료형의 데이터만 저장하도록 만들어주는 기능
		
		Vector<String> vec = new Vector<String>();

//		add(Object e)
		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
		
//		vec.add(30);		// 제네릭을 써서 String 형이 아닌 데이터를 입력하면 오류 발생

//		Object get(int index)
		String temp;
		for (int i = 0; i < vec.size(); i++) {
			
			// 제네릭을 사용하면 자료구조에서 값을 구해올때 자료구조에서 자료형 생략 가능
			temp = vec.get(i);
			System.out.println(temp.toUpperCase());
		}
	}
}
