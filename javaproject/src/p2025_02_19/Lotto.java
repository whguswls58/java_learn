package p2025_02_19;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~45 사이의 숫자를 6개 추출하는 프로그램
		// (단, 중복된 숫자는 1번만 출력하고 오름차순으로 정렬)
		// Math.random() 이용
		
		
		// 추출한 번호를 받을 배열
		int[] lottoNum = new int[6];
		
		// 본인과 비교 x
		int flag;
				
		for(int i=0; i<lottoNum.length ; i++) {
			flag = 0;
			
			lottoNum[i] = (int)(Math.random()*45 + 1);
			
			if(i>0) {
				
				// 중복값 제거
				for(int j : lottoNum) {
					// i != flag -> 자기 자신과 비교 x
					if(lottoNum[i] == j && i != flag) {
						System.out.println("중복값 발생!! 새로운 랜덤값 생성");
						System.out.println(lottoNum[i]);
						i--;
						break;
					}
					flag++;					
				}
			}
			
		}
		
		// 배열 정렬
		Arrays.sort(lottoNum);
		
		// 값 출력
		System.out.println("추출한 랜덤한 숫자 6개 : ");
		for(int i=0 ; i<lottoNum.length ; i++)
			System.out.print(lottoNum[i] + " ");
		
	}

}
