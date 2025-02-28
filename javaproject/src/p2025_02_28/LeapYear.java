package p2025_02_28;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * 키보드를 통해 연도를 입력 받는다.
 * 이때 연도가 윤년인지 평년인지 판별하는 프로그램
*/
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar c = new GregorianCalendar();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요.");
		int y = sc.nextInt();
		
		boolean b = c.isLeapYear(y);
		
		if(b) {
			System.out.println(y + "년은 윤년입니다.");
		}else {
			System.out.println(y + "년은 평년입니다.");
		}
		
	}

}
