package p2025_02_26;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	TreeSet
//	 : 데이터를 오름차순으로 정렬해서 저장하고 출력하는 기능 제공
		
/*				오름차순 정렬						내림차순정렬
--------------------------------------------------------------------------		
	숫자 | 작은 숫자 -> 큰 숫자 (1,2,3,...)		큰 숫자 -> 작은 숫자 (10,9,8,...)
	문자 | 사전순 정렬(a,b,c,...)				사전 역순 정렬(z,y,x,...)				
*/		
		
		TreeSet hs = new TreeSet();

		if (hs.add("korea")) {
			System.out.println("첫 번째 korea 추가 성공");
		} else {
			System.out.println("첫 번째 korea 추가 실패");
		}
		if (hs.add("japan")) {
			System.out.println("japan 추가 성공");
		} else {
			System.out.println("japan 추가 실패");
		}
		if (hs.add("america")) {
			System.out.println("america 추가 성공");
		} else {
			System.out.println("america 추가 실패");
		}
		if (hs.add("britain")) {
			System.out.println("britain 추가 성공");
		} else {
			System.out.println("britain 추가 실패");
		}
		if (hs.add("korea")) {				// 중복 데이터 저장 불가능
			System.out.println("두 번째 korea 추가 성공");
		} else {
			System.out.println("두 번째 korea 추가 실패");
		}

		// 오름차순으로 정렬된 결과 출력
		System.out.println(hs);
		
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
