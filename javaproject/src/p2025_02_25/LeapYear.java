package p2025_02_25;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 키보드로 연도 입력받음
		// 입력받은 연도가 윤년인지 평년인지 판별
		
		// 윤년 판별
		// y % 4 == 0
		// + y % 100 == 0
		// + y % 400 == 0
		
		int yy;			// 입력받을 년도
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요?");
		yy = sc.nextInt();
		
		if(checkLeap(yy)) {
			System.out.println(yy + "년은 윤년입니다.");
		}else {
			System.out.println(yy + "년은 평년입니다.");
		}
		
		
	}
	
	public static boolean checkLeap(int yy) {
		
		return (yy%4==0 && yy%100!=0) || yy%400==0 ? true : false; 
	}

}
