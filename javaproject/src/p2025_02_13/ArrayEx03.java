package p2025_02_13;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 키보드로 5과목 점수를 입력 받아서, 총점과 평균
		
		int[] s = new int[5];
		
		System.out.println("5과목의 점수를 입력:");
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; 		// 합계
		for(int i=0; i<s.length; i++) {
			s[i] = sc.nextInt();
			sum += s[i];
		}
		
		double avg = sum / 5.0;
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
	}

}
