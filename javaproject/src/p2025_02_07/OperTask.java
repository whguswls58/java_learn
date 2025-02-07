package p2025_02_07;

import java.util.Scanner;

public class OperTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 키보드로 3개의 정수를 입력 받았을때 최대값과
		// 최소값을 구하는 프로그램을 작성하세요.
		// (단, 조건 연산자를 활용해서 작성하세요.)
		
		int n1, n2, n3;			// 입력받을 값 3개
		int max, min;			// 최대값, 최소값
		int max2, min2;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3개의 값을 입력하세요.");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("n3: " + n3);
		
		max2 = (n1 > n2) ? n1 : n2;
		System.out.println("max2: " + max2);
		max2 = max2 > n3 ? max2 : n3;
		System.out.println("max2: " + max2);
				
		
		max = ( (n1 > n2) && (n1 > n3) ) ? n1 : ( n2 > n3 ) ? n2 : n3;
		min = ( n1 < n2 && n1 < n2 ) ? n1 : ( n2 < n3 ) ? n2 : n3;
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
						
		
	}

}
