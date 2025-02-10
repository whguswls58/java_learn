package p2025_02_10;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2. if ~ else문
		// if( 조건식 ) {
		//		조건식이 참일 경우 실행될 문장;
		// } else {
		//		조건식이 거짓일 경우 실행될 문장;
		// }
		// if문 또는 else문 중에서 반드시 1개는 실행
		
		// 키보드가 입력한 정수가 짝수인지, 홀수인지 판별하는 프로그램
		
		System.out.println("정수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		boolean tf;
		int n = sc.nextInt();
		
		if( n % 2 == 0 ) {
			System.out.println(n + "은(는) 짝수");
			tf = true;
		} else {
			System.out.println(n + "은(는) 홀수");
			tf = false;
		}
		
		System.out.println(tf ? n + "은(는) 짝수" : n + "은(는) 홀수");
		
	}

}
