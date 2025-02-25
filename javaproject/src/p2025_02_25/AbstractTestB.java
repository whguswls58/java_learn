package p2025_02_25;

abstract class AbstractClassB {				// 추상클래스
	abstract void Method01();				// 추상메소드

	void Method02() {
		System.out.println("Method02:  추상클래스에서 구현");
	}
}

abstract class MiddleClass extends AbstractClassB {	// 추상클래스
	@Override
	void Method01() {								// 추상메소드 메소드오버라이딩
		System.out.println("Method01: 미들클래스에서 구현된 추상메소드");
	}

	public void Method03() {
		System.out.println("Method03: 추상클래스에서 구현");
	}
}

class SubClassB extends MiddleClass {
	void Method01(){		// MiddleClass의 추상메소드 혹은 SubClassB의 추상메소드 둘중하나는 반드시 오버라이딩 해야함
	  System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
	}
}

class AbstractTestB {
	public static void main(String args[]) {
		SubClassB obj = new SubClassB();
		obj.Method01();
		obj.Method02();
		obj.Method03();
	}
}
