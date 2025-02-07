package p_250206;

public class PromotionExample {

	public static void main(String[] args) {

		// 자동 형변환 : 작은 자료형 -> 큰 자료형 변수에 할당
		// 자료형 크기: byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		// long보다 float가 더 큰 이유 -> float는 부동소수점방식으로 숫자를 표현하기 때문에 숫자 표현 범위가 훨씬 넓다
		
		byte byteValue = 10;
		int intValue = byteValue;						// 자동 형변환
		System.out.println("intValue: " + intValue);
		
		// char(2byte) --> int(4byte) 형변환시
		// 영문 : 아스키코드로 처리	'a' --> 97
		// 한글 : 유니코드로 처리		'가' --> 44032
		char charValue = '가';
		intValue = charValue;							// 자동 형변환
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;						// 자동 형변환
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;					// 자동 형변환
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;				// 자동 형변환
		System.out.println("doubleValue: " + doubleValue);
	}

}
