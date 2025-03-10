package p_java_Test;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로 연도 입력
		// 윤년인지 평년인지 판단
		
		Scanner sc = new Scanner(System.in);
		GregorianCalendar gc = new GregorianCalendar();

		System.out.print("년도를 입력하세요: ");
		int year = sc.nextInt();
		if(gc.isLeapYear(year)) {
			System.out.println(year + "년도는 윤년입니다.");
		}else {
			System.out.println(year + "년도는 평년입니다.");
		}
		
	}

}
