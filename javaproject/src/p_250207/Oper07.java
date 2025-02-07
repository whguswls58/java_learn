package p_250207;

import java.util.Scanner;

public class Oper07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 논리 연산자 : and(&&), or(||), not(!)
		
		// 5과목의 점수를 키보드로 입력 받았을때, 합격, 불합격을 판별하는 프로그램 작성
		// 각 과목당 과락은 40점, 평균 60점이상을 받아야 합격
		
		int n1, n2, n3, n4, n5, total;
		double avg;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5개의 과목의 점수를 입력하세요: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		
		total = n1 + n2 + n3 + n4 + n5;		// 총합
		avg = total / 5.0;					// 평균
		
		System.out.println("각 과목별 점수는 " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + "입니다.");
		System.out.println("평균 점수 : " + avg);
		if ( n1 < 40 || n2 < 40 || n3 < 40 || n4 < 40 || n5 < 40 || avg < 60) {
			System.out.println("불합격입니다.");
		} else {
			System.out.println("축하합니다. 합격하셨습니다.");
		}
		
		
	}

}
