package p2025_02_10;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {

		// 3. if ~ else if문
		// if(조건식1) {
		//		조건식1이 참인 경우 실행될 문장;
		// } else if(조건식2) {
		//		조건식2가 참인 경우 실행될 문장;
		// } else {
		// 		위의 조건식 모두 만족하지 않을 경우 실행될 문장;
		// }
		
		
//		키보드로 입력한 점수가 어느 학점에 해당 되는지 판별하는 프로그램 작성
//		A학점 - 90점 이상
//		B학점 - 80점 이상
//		C학점 - 70점 이상
//		D학점 - 60점 이상
//		F학점 - 60점 미만
		
		System.out.println("0~100점 사이의 점수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		if (s >= 90) {
			System.out.println("A학점");
		} else if (s >= 80){
			System.out.println("B학점");
		} else if (s >= 70) {
			System.out.println("C학점");
		} else if (s >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
		
	}

}
