package p2025_02_12;

public class MethodEx01 {


	// main() 메소드는 자바 가상머신(java.exe)로만 호출
	// main() 메소드는 프로그래머가 직접 호출할 수 없다
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodEx01.check(); 		// check 메소드 호출
		check();					// 정정 메소드(static)은 같은 클래스 안에서 메소드 호출은 클래스명 생략이 가능
		check(30);
		check(10, 20.3);
		check('A');
		check(true);
		check("자바");				// "자바"는 참조형변수(String 클래스의 객체)이기 때문에 heap 메모리 영역에 값이 저장
		check("자바");				// "자바"는 주소값이 모두 동일하다
		System.out.println("주소 값 : " + System.identityHashCode("자바"));
		check(new String ("파이썬"));	// 새로운 주소값을 가짐
		
		
		check01();				//return 문으로 돌려받을 값이 출력 x
		int result = check01();
		System.out.println("돌려 받은 값1: " + result);
		System.out.println("돌려 받은 값2: " + check01());
		
		double result2 = check02(50, 3.14);
		System.out.println("돌려 받은 값1: " + result2);
		System.out.println("돌려 받은 값2: " + check02(50,3.14));
	}

	// 메소드 : 여러가지 코드를 묶어 놓은 집합체
	// 메소드를 사용하는 이유는 코드의 재사용
	
	// 사용자 정의 메소드
	// 사용자 정의 메소드는 프로그래머가 직접 호출
	
	static void check() {					// static: 정적 메소드
		System.out.println("메소드 호출 성공");
		return;								// 리턴 값이 없으므로 생략이 가능함
	}
	
	// 값 전달에 의한 메소드 호출방식(Call by Value 방식)
	static void check(int a) {			// 매개변수(parameter) : int a = 30
		System.out.println("전달된 값 : " + a);
		return;
	}
	
	static void check(int a, double d) {
		double result = a + d;
		System.out.println("전달된 값의 핪: " + result);
		return;
	}
	
	static void check(char c) {
		System.out.println("전달된 값: " + c);
		return;
	}
	
	static void check(boolean b) {
		System.out.println("전달된 값: " + b);
		return;
	}
	
	// 주소값 전달에 의한 메소드 호출방식(Call by Reference 방식)
	static void check(String s) {
		System.out.println("전달된 값: " + s);
		System.out.println("주소 값 : " + System.identityHashCode(s));	// 값이 저장된 주소값
		return;
	}
	
	// return문: 메소드를 호출한 곳에 값을 돌려주는 역할
	// return 문은 메소드 가장 마지막에 사용
	static int check01() {
		System.out.println("리턴구문");
		return 50;								
	}
	
	static double check02(int a, double d) {
		double result = a + d;
		return result;
	}
	
}
