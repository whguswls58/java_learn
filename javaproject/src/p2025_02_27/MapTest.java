package p2025_02_27;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {

		// Map 은 인터페이스이기 때문에 자체 객체 생성 불가능

		// HashMap 객체 생성
//		Map hm = new HashMap();			// 업캐스팅
		HashMap hm = new HashMap();
		// 키와 데이터 쌍을 삽입
		hm.put("woman", "gemini");
		hm.put("man", "johnharu");
		hm.put("age", new Integer(10));
		hm.put("city", "seoul");
		hm.put("city", "busan"); // key 값이 중복이 일어날 경우, 가장 마지막에 설정된 value 값으로 저장

		// HashMap에 있는 객체들을 출력
		System.out.println(hm);

		// 키 값만 출력
		System.out.println(hm.keySet());

		// value 값만 출력
		System.out.println(hm.values());

		// 키를 이용해 해당 데이터를 출력
		// Object get(Object key)-> 값을 사용할때는 다운캐스팅으로 강제형변환을 시켜야함
		System.out.println(hm.get("woman"));
		System.out.println(hm.get("city"));
	}
}
