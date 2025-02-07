package p2025_02_07;

public class Oper04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 비교 연산자 : >, >=, <, <=, ==(같다), !=(같지 않다)
		// 비교 연산자의 결과가 참이면 true, 거짓이면 false 값을 리턴
		
		int n1 = 10;
		int n2 = 20;
		
		if(n1 > n2) {
			System.out.println(n1 + "은 " + n2 + "보다 크다");
		}else {
			System.out.println(n1 + "은 " + n2 + "보다 작거나 같다");			
		}
		
		
		String str1 = "자바";							// str1에 "자바" 값이 있는 주소값을 저장함
		String str2 = "자바";							// "자바"라는 값이 존재하므로 기존에 저장된 주소값을 저장
		String str3 = new String ("자바");			// 새로운 공간을 만들어서 "자바" 값을 저장함
		
		// 비교 연산자로 주소값을 비교
		if(str1 == str2) {
			System.out.println("같은 주소");					// 같은 주소
		}else {
			System.out.println("다른 주소");
		}
		
		if(str1 == str3) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");					// 다른 주소
		}
		
		// 값을 비교(String 클래스의 equals 메소드 이용)
		System.out.println(str1.equals(str2));				// true
		System.out.println(str1.equals(str3));				// true
		
		
	}

}
