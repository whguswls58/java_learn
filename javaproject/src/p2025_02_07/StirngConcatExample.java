package p2025_02_07;

public class StirngConcatExample {

	public static void main(String[] args) {

		// 숫자 연산
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);		// 20
		
		//문자열 결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1);		//128
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2);		//1028
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3);		//1028
		
		String str4 = "10" + (2 + 8);				//1010
		System.out.println("str4: " + str4);
		
	}

}
