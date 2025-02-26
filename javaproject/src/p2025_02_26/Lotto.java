package p2025_02_26;

import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~45 정수 중 6개 숫자 추출
		// Set 자료구조 사용 중복 숫자 저장 x
		// 추출된 6개의 숫자 오름차순 정렬
		
		TreeSet lotto = new TreeSet();
		
		for(int i=0 ; i < 6 ; ) {
			boolean check = lotto.add((int)(Math.random()*45 +1));
			if(check)
				i++;
		}
		
		System.out.println(lotto);
		
	}

}
