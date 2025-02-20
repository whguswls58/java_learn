package p2025_02_20;

import java.util.Calendar;

public class CalendarTesk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calendar 클래스 이용해서 오늘 날짜, 시간, 요일 출력
		
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		
		Calendar c = Calendar.getInstance();
		
		// 오늘 날짜
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;
		int d = c.get(Calendar.DATE);
		
		// 현재 시간
		int h = c.get(Calendar.HOUR_OF_DAY);
		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		int ap = c.get(Calendar.AM_PM);
		
//		if(ap == 0) {
//			System.out.println("오전");
//		}else {
//			System.out.println("오후");
//		}
		
		// 요일
		int wk = c.get(Calendar.DAY_OF_WEEK)-1;
		
		System.out.println(y + "-" + m + "-" + d + 
							" / " + h + ":" + mm + ":" + s + " / " + week[wk] + "요일");
		
		
		
	}

}
