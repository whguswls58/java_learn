package p2025_02_27;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// generic 표기법 - <String> : 지정된 한가지 자료형(String)만 저장함
		List<String> list = new ArrayList<String>();		// 업캐스팅
		
		list.add("Java");
		list.add("JDBC");
		list.add("Jervlet/JSP");
		list.add(2, "Database");				// 해당 인덱스에 객체 삽입(한칸씩 뒤로 밀림)
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2);		
//		String skill = (String)list.get(2);		// generic으로 설정된 자료형은 list에서 값 호출시 자료형 생략가능
		
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0 ; i<size ; i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		list.remove(2);							// 해당 인덱스의 객체 삭제
		list.remove(2);				// 메소드 오버로딩
		list.remove("iBATIS");		// 메소드 오버로딩
		
		for(int i=0 ; i<list.size() ; i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		list.set(1, "Python");					// 해당 인덱스의 리스트 객체 변경
		for(int i=0 ; i<list.size() ; i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		
		
	}

}
