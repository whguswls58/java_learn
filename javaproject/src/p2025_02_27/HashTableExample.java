package p2025_02_27;

import java.util.*;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new Hashtable<String, String>();
		
		// key - id, value - password 저장
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "124");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.println("아이디: ");
			String id = sc.nextLine();			// id 입력
			
			System.out.println("비밀번호: ");
			String password = sc.nextLine();	// password 입력
			System.out.println();
			
			if(map.containsKey(id)) {					// 키가 존재하는지 확인
				if(map.get(id).equals(password)) {		// 해당 키의 value(비밀번호)와 비교
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
			
			
		}
		
	}

}
