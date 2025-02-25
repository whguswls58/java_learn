package p2025_02_25;

public abstract class AbsClass {		// 추상클래스

	int a = 10;							// 필드
	
	void check() {						// 일반메소드
		System.out.println("호출성공");
	}
	
	public abstract void method();		// 추상메소드
	
}
