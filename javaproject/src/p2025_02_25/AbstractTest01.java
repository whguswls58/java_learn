package p2025_02_25;

abstract class AbstractClass {			// 부모클래스(추상클래스)
	int a = 10;							// 필드
	
	abstract void Method01();			// 추상메소드 - 이름만 존재하고 내용이 없는 메소드

	void Method02() {					// 일반메소드
		System.out.println("Method02:  추상클래스에서 구현");
	}
}

// 추상 클래슬르 상속받으면 추상클래스의 추상메소드를 반드시 메소드오버라이딩을 수행해야 함
class SubClass extends AbstractClass {	// 자식클래스
	@Override
	void Method01() {					// 추상메소드 - 메소드오버라이딩
		System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
	}
}

class AbstractTest01 {
	public static void main(String args[]) {

		// 추상 클래스는 자체 객체 생성 불가능
//		AbstractClass abs = new AbstractClass();	// 오류발생
		
		SubClass obj = new SubClass();
		obj.Method01();					// 메소드오버라이딩 된 메소드가 호출
		obj.Method02();					// 부모클래스로부터 상속받은 메소드 호출
	}
}
