package p2025_02_10;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 ~ 100까지 홀수, 짝수의 합을 구하는 프로그램을 작성
		// for문 1개, if else 문 1개
		
		int odd = 0, even = 0;
		
		for(int i=1 ; i <= 100 ; i++) {
			if(i%2 == 0) {			// 짝수
				even += i;
			}else {					// 홀수
				odd += i;
			}
		}
		System.out.println("1~100까지 홀수의 합: " + odd);
		System.out.println("1~100까지 짝수의 합: " + even);
	}

}
