package p2025_02_25;

abstract class Hello {								// 추상클래스
	public abstract void sayHello(String name);		// 추상메소드
}

abstract class GoodBye {							// 추상클래스, 부모클래스
	public abstract void sayGoodBye(String name); 	// 추상메소드
}

// 자바에서는 클래스의 다중상속 허용하지 않음
class SubClass03 extends GoodBye{			// 클래스 다중상속을 하면 오류가 생김

	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

class AbstractTest03 {
	public static void main(String[] args) {
		SubClass03 test = new SubClass03();
		test.sayHello("홍길동");
		test.sayGoodBye("홍길동");
	}
}
