package p2025_02_21;

import java.util.StringTokenizer;

public class StringTokenizer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer str = new StringTokenizer("이순신#을지문덕#강감찬#광개토대왕", "#");
		
		// 토큰(token) : 구분기호(#)로 분리된 문자
		// 파싱된 문자(토큰)가 몇개인지 구한다
		int cnt = str.countTokens();
		System.out.println("파싱할 문자열의 총갯수: " + cnt);
		
//		System.out.println(str.nextToken());	// 이순신
//		System.out.println(str.nextToken());	// 을지문덕
//		System.out.println(str.nextToken());	// 강감찬
//		System.out.println(str.nextToken());	// 광개토대왕
//		System.out.println(str.nextToken());	// 가져올 토큰이 없으면 예외 발생 - NoSuchElementException
		
		// hasMoreTokens() - 남은 토큰이 있으면 true, 없으면 false
		while(str.hasMoreTokens()) {		// 토큰이 있으면 차례대로 파싱된 문자열 불러옴(예외 처리)
			System.out.println(str.nextToken());
		}
		
		
	}

}
