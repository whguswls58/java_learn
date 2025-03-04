package p2025_03_04;

import java.util.*;

public class YearCheck {

	public static void main(String[] args) {
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		// 업캐스팅이 되면 참조 가능한 영역 축소
		// 업캐스팅이 되면 부모가 상속해준 메소드만 접근가능
//		Calendar y = new GregorianCalendar();
		GregorianCalendar y = new GregorianCalendar();

		if (y.isLeapYear(year)) {
			System.out.println(year + "은 윤년입니다");
		} else {
			System.out.println(year + "은 평년입니다");
		}

	}

}
