//2025.02.11. 과제
package p2025_02_11;

import java.util.Scanner;

public class LoopTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 키보드를 이용해서 입력한 정수의 팩토리얼을 구하는 프로그램 작성
		
		// 변수 선언
		int num;
		int fac = 1;
		
		// 입력값 받기
		System.out.println("정수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		// 팩토리얼 계산
		for(int i=1 ; i <= num ; i++) {
			fac = fac * i;
		}
		System.out.println(num + "! = " + fac);
		
	}

}
