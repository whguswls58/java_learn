package p2025_02_07;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2;			// 컴파일 에러발생
		
		int intValue1 = byteValue1 + byteValue2;			// 자동 형변환(byte -> int)
		System.out.println(intValue1);						// 30
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;			// 컴파일 에러
		
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드: " + intValue2);			// 66
		System.out.println("출력문자: " + (char)intValue2);	// B
		
		// 같은 자료형끼리 산술연산 할 경우 같은 자료형으로 출력 ( int / int = int 나머지는 소실)
		int intValue3 = 10;									
		int intValue4 = intValue3 / 4;						// 2 정수타입끼리 나눗셈 할 경우 몫만 출력(나머지는 버림)
		System.out.println(intValue4);
		
		int intModValue = intValue3 % 3;					// 몫 : / 연산, 나머지 : % 연산
		System.out.println(intModValue);
		
		int intValue5 = 5;
//		int intValue6 = 10 / 4.0;							// 컴파일 에러
		double doubleValue = intValue5 / 4.0;				// 분모가 4일 경우 int형이므로 소숫점이 소실된 값인 2가 출력됨
		System.out.println(doubleValue);					// 2.5
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;						// double 형으로 형변환을 안할 경우 0.0 출력
		System.out.println(result);							// 0.5
		
		
	}

}
