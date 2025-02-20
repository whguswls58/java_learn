package p2025_02_20;

public class ConnectString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "자바";
		String str2 = "스크립트";
		
		// 두 String 객체를 "+" 연산 수행
		String temp = str1 + str2;
		System.out.println(temp);
		System.out.println(str1 + str2);
		
		//String + 정수형
		String temp2 = temp + 100;
		System.out.println(temp2);
		
	}

}
