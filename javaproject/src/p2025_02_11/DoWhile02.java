package p2025_02_11;

public class DoWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// do ~ while 문으로 1~100까지 홀수, 짝수의 합을 구하는 프로그램 작성
		
		int i = 1, odd = 0, even = 0;
		
		do {
			if(i%2 == 1) {				// 짝수
				odd += i;
			}else {						// 홀수
				even += i;
			}
			i++;
		}while(i<=100);
		
		System.out.println("1부터 100까지 홀수의 합: " + odd);
		System.out.println("1부터 100까지 짝수의 합: " + even);
	}

}
