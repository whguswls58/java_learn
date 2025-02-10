package p2025_02_10;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 ~ 100까지 홀수, 짝수의 합을 구하는 프로그램 작성
		
		int odd = 0, even = 0;			//odd = 홀수, even = 짝수
		
		// 홀수의 합
		for(int i = 1 ; i <= 100 ; i += 2) {
			odd += i;
		}
		
		// 짝수의 합
		for(int i = 0 ; i <= 100 ; i += 2) {
			even += i;
		}
		
		System.out.println("1~100 사이의 홀수의 합: " + odd);
		System.out.println("1~100 사이의 짝수의 합: " + even);
		
	}

}
