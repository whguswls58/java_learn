package p2025_02_06;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);		// 가
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);		//500
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);		// 3
		
	}

}
