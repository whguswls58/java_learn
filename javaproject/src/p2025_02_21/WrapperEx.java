package p2025_02_21;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int형 변수의 최대값과 최소값
		System.out.println("max=" + Integer.MAX_VALUE);
		System.out.println("min=" + Integer.MIN_VALUE);
		
		// String형을 int형으로 변환
		int n = Integer.parseInt("20");
		System.out.println(n);
		System.out.println(n+10);
		
		// 10진수 -> 2진수 (String형 반환)
		System.out.println("2진수: " + Integer.toBinaryString(10));		// 1010
		
		// 10진수 -> 8진수 (String형 반환)
		System.out.println("8진수: " + Integer.toOctalString(10));		// 12
		
		// 10진수 -> 16진수 (String형 반환)
		System.out.println("16진수: " + Integer.toHexString(10));			// a
		
	}

}
