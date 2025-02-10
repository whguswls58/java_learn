package p2025_02_10;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 키보드로 입력한 점수가 어느 학점에 해당 되는지 판별하는 프로그램 작성
		
		System.out.println("0~100점 사이의 점수를 입력 : ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		// int형과 int형을 산술연산을 수행하면, int형으로 처리됨
		switch(s/10) {							// s/10 -> 90점대, 80점대, 70점대, ...
			case 10:							// 만약 break 문이 없을 경우 다음 case 수행
			case 9: 							// break 문을 만날때까지 수행함
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");				
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
		}
				
	}

}
