package p2025_02_07;

import java.util.Scanner;

public class Oper06 {

	public static void main(String[] args) {
		//키보드로 입력한 정수 2개 중에서 최대값과 최소값을 출력하는 프로그램을 작성하세요?
		
		int n1, n2, max, min;
		
		System.out.println("정수 2개를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();				// 스페이스바 or 엔터키로 출력
		n2 = sc.nextInt();
		
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		if( n1 > n2 ) {
			max = n1;
			min = n2;
			System.out.println(n1 + "이 " + n2 + "보다 크다.");
		} else if (n1 == n2){
			max = n1;
			min = n1;
			System.out.println(n1 + "과" + n2 + "는 같다.");
		} else {
			max = n2;
			min = n1;
			System.out.println(n2 + "가 " + n1 + "보다 크다.");
		}
		
		System.out.println("max= " + max);
		System.out.println("min= " + min);
		
	}

}
