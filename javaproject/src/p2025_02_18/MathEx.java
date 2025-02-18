package p2025_02_18;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Math 클래스
		// Math 클래스 = 정적 필드 + 정적 메소드
		
		// Math 클래스는 생성자 제공 x -> Math 클래스로 직접 객체 생성 불가능
//		Math m = new Math();		// 오류 발생
		
		System.out.println("E= " + Math.E);		// 오일러 상수
		System.out.println("PI= " + Math.PI);	// 원주율
		
		System.out.println("abs(-10)= " + Math.abs(-10));			// 절대값: 10
		System.out.println("ceil(3.14)= " + Math.ceil(3.14));		// 올림 : 4.0
		System.out.println("round(10.5)= " + Math.round(10.5));		// 반올림 : 11
		System.out.println("floor(10.9)= " + Math.floor(10.9));		// 내림 : 10.0
		System.out.println("max(10,20)= " + Math.max(10, 20));		// 최대값 : 20
		System.out.println("min(10,20)= " + Math.min(10, 20));		// 최소값 : 10
		System.out.println("pow(2,3)= " + Math.pow(2, 3));			// 2^3 : 8.0
		
		System.out.println("random()= " + Math.random());		// 0.0 <= Math.random() < 1.0
		System.out.println("sqrt(5)= " + Math.sqrt(5)); 			// 제곱근
		
		// 주사위 번호 1~6
		int dice = (int)(Math.random() * 6 )+ 1;
		System.out.println("주사위번호: " + dice);
		
		int lotto = (int)(Math.random() * 45 )+ 1;
		System.out.println("로또번호: " + lotto);
	
	}

}
