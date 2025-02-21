package p2025_02_21;

public class WrapperEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자형을 기본 자료형으로 변환
		
		int value1 = Integer.parseInt("10");			// 10
		double value2 = Double.parseDouble("3.14");		// 3.14
		boolean value3 = Boolean.parseBoolean("true");	// true
		boolean value4 = Boolean.parseBoolean("TRUE");	// true
		boolean value5 = Boolean.parseBoolean("TEST");	// false - true, false 가 아닌 다른 값을 넣을 경우 false 반환
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		System.out.println("value4: " + value4);
		System.out.println("value5: " + value5);
		
	}

}
