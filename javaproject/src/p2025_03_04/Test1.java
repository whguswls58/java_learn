package p2025_03_04;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 스레드를 이용한 1초에 한번씩 날짜 시간을 출력하는 프로그램
		Test1 t1 = new Test1();
		
		// 스레드 실행방법 - thread 클래스 상속받아서 하는것/인터페이스 상속받아서 실행하는 것 차이 비교하여 다시보기
		Thread first = new Thread(t1);
		first.start();

	}

	public void run() {
		while (true) {
			
			// 1. Date
			// 년, 월, 일, 시, 분, 초, 요일로 날짜를 출력
			
//			Date d= new Date();
//			System.out.println(d);
//			
//			SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss:EEE요일");
//			// hh : 12시간제 시간
//			// HH : 24시간제 시간
//			System.out.println(sd.format(d));
			
			// 2. Timestamp로 날짜 찍는 법
//			Timestamp ts = new Timestamp(System.currentTimeMillis());
//			// SimpleDateFormat으로 원하는 포맷으로 바꿔 사용
//			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
//			System.out.println(sf.format(ts));
			
			
			// 3. Calendar 클래스로 날짜 찍는 법
			Calendar c = Calendar.getInstance();

			int y = c.get(Calendar.YEAR);
			int m = c.get(Calendar.MONTH) + 1;
			int d = c.get(Calendar.DATE);

			String ymd = y + "-" + m + "-" + d;

			int h = c.get(Calendar.HOUR);
			int mm = c.get(Calendar.MINUTE);
			int s = c.get(Calendar.SECOND);

			int ap = c.get(Calendar.AM_PM);
			String amap;
			
			if(ap == 0) {
				amap = "오전";
			}else {
				amap = "오후";
			}
			
			String hms =amap + " " + h + ":" + mm + ":" + s;
			System.out.println(ymd + " " + hms);

			try {
				// sleep() 메소드를 사용해 프로그래머가 강제로
				// block 상태로 만듦.
				// 1초 동안 thread을 block 상태에 빠트림
				Thread.sleep(1000); // (단위: 1/1000 초)
				// InterruptedException 오류가 날 수 있음
			} catch (InterruptedException ie) {
				System.out.println(ie.toString());
			}
		} // for end
	}// run() end
}
