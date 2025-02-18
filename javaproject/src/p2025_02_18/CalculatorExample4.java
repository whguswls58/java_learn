package p2025_02_18;

// 정적 멤버
// 1. 정적 필드와 정적 메소드는 공유를 목적으로 누구나 쉽게 접근할 경우 사용
// 2. 클래스에 고정된 필드와 메소드
// 3. 정적 필드와 정적 메소드는 static 을 붙여만듬
// 4. 정적 필드와 정적 메소드는 heap 영역이 아닌 메소드 영역(공유 영역)에 저장됨
// 5. 정적 필드와 정적 메소드는 객체를 생성하지 않고 클래스명으로 직접 접근

// 정적 메소드
// 1. this 레퍼런스 변수 사용불가
// 2. 일반적인 변수 사용불가
//    정적 멤버변수만 사용가능
// 3. 메소드 오버라이딩 불가능

class Calculator4{
	int k;		// 인스턴스 필드 - 정적 메소드에선 사용 불가능
	
	static int i;						// 0 	정적 필드 - 일반 필드와 마찬가지로 자동으로 초기값 설정됨
	static double d;					// 0.0
	static boolean b;					// false
	
	static double pi = 3.14159;			// 정적 필드
	
	static void check() {				
//		System.out.println(k);			// 정적 메소드에선 인스턴스 필드 사용 불가능
		System.out.println(i);			// 정적 메소드에선 정적 필드만 사용
	}
	
	
	static int plus(int x, int y) {		// 정적 메소드
		return x+y;
	}
	
	static int minus(int x, int y) {	// 정적 메소드
		return x-y;
	}
}

public class CalculatorExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("i: " + Calculator4.i);
		System.out.println("d: " + Calculator4.d);
		System.out.println("b: " + Calculator4.b);
		
		double result1 = 10 * 10 * Calculator4.pi;		// 정적 필드 호출
		int result2 = Calculator4.plus(10, 5);			// 정적 메소드 호출
		int result3 = Calculator4.minus(10, 5);			// 정적 메소드 호출
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
	}

}
