package p2025_02_12;

import java.util.Scanner;

public class MethodEx03 {

	// 키보드로 입력한 2개의 정수 중에서 최대값과 최소값을 구하는 프로그램 작성
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2;			//입력받을 값 2개
		int max, min;		//최대값, 최소값
		
		System.out.println("정수 2개를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		sc.close();
		// 메소드 호출해서 max값, min값 저장
		max = MethodEx03.max(n1, n2);
		min = MethodEx03.min(n1, n2);
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
	}
	
	static int max(int a, int b) {
		
		return a>b ? a : b;
		
//		if(a>b) {
//			return a;
//		}else {
//			return b;
//		}
	}

	static int min(int a, int b) {
		if(a<b) {
			return a;
		}else {
			return b;
		}
	}
}
