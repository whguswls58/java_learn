package p2025_02_19;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 날짜 시간 관련 클래스 : Date, Timestamp
		
		// 1. Date
		// 년, 월, 일, 시, 분, 초, 요일로 날짜를 출력
		
		
		Date d= new Date();
		System.out.println(d);
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss:EEE요일");
		// hh : 12시간제 시간
		// HH : 24시간제 시간
		System.out.println(sd.format(d));
		
		// 2. Timestamp - 정밀한 날짜, 시간을 처리하는 클래스
		// 년, 월, 일, 시, 분, 초로 날짜를 출력
		
		// Timestamp 객체 만드는 법 다시 한번 보기 - 라이브러리 참고
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(ts);
		// SimpleDateFormat으로 원하는 포맷으로 바꿔 사용
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		System.out.println(sf.format(ts));
		
	}

}
