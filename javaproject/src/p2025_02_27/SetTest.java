package p2025_02_27;

import java.util.*;

public class SetTest {

	public static void main(String[] args) {		
		
//		Set s = new HashSet();
		TreeSet s = new TreeSet();		// 오름차순 정렬로 값 저장
		
		Random r = new Random();		
		
		int i = 0;			// 루프 횟수 카운팅
		
		while(true){
//			int n = (int)(Math.random()*45) + 1; // 1 ~ 45 난수 발생
			int n = r.nextInt(45)+1;			
			s.add(n);
			i++;
			if(s.size() == 6){
				System.out.println(s);
				System.out.println(i + "번 루프 실행");
				break;
			}
		}
	}

}
