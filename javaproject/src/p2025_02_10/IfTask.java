package p2025_02_10;

import java.util.Scanner;

public class IfTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//키보드로 정수 3개를 입력 받았을때, 최대값과 최소값을 구하는 프로그램을 작성
		
		int n1, n2, n3;		// 입력받을 정수값
		int max, min;		// 최대값, 최소값
		
		System.out.println("정수 3개를 입력하세요: ");
		
		// 정수 3개 입력
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		// 최대값
		if (n1>=n2 && n1>=n3) {
			max = n1;
		} else if(n2 >= n3) {
			max = n2;
		} else {
			max = n3;
		}
		
		// 최소값
		if (n1<=n2 && n1<=n3) {
			min = n1;
		} else if(n2 <= n3) {
			min = n2;
		} else {
			min = n3;
		}
		
		// 결과 출력
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		
	}

}
