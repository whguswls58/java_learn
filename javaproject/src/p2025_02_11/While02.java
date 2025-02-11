package p2025_02_11;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while문을 이용해서 1~100까지 홀수, 짝수의 합을 구하시오
		
		int odd = 0, even = 0;			// 초기값
		int i = 1;
		
		while(i <= 100) {				// 조건식
			if(i%2 == 1) {				// 홀수
				odd += i;
			}else {						// 짝수
				even += i;
			}
			
			i++;
		}
		
		System.out.println("1부터 100까지의 홀수의 합 : " + odd);
		System.out.println("1부터 100까지의 짝수의 합 : " + even);
		
		
	}

}
