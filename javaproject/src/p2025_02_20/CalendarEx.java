package p2025_02_20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. Calendar 클래스
		// Calendar c1 = new Calendar();	// Calendar 클래스는 추상 클래스이기 때문에 new 연산자로 직접 객체생성 불가능 
		
		// 레퍼런스 형변환(업케스팅) - 두 클래스 사이에 상속관계가 있어야만 형변환 가능, 왼쪽 - 부모/오른쪽 - 자식
		Calendar c2 = new GregorianCalendar();
		Calendar c = Calendar.getInstance();		// Calendar 클래스 객체는 주로 이방식으로 생성
		
		System.out.println(c);
		System.out.println(Calendar.YEAR);			// YEAR 값은 상수 = 1
		
		int y = c.get(Calendar.YEAR);				// 년 : .get() 메소드로 YEAR값을 불러와야 현재 YEAR 값 출력
		int m = c.get(Calendar.MONTH) + 1;			// 월 : 0 ~ 11 -> +1 해줘야함
		int d = c.get(Calendar.DATE);				// 일
		System.out.println(y + "-" + m + "-" + d);
		
		int h1 = c.get(Calendar.HOUR);
		int h2 = c.get(Calendar.HOUR_OF_DAY);
		int ap = c.get(Calendar.AM_PM);
		
		if(ap == 0) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
		int mm = c.get(Calendar.MINUTE);					// 분
		int s = c.get(Calendar.SECOND);						// 초
		System.out.println(h1 + ":" + mm + ":" + s);		// 12시간 표기
		System.out.println(h2 + ":" + mm + ":" + s);		// 24시간 표기
		
		
		
	}

}
