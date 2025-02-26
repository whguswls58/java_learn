package p2025_02_26;

interface IHello06 {		// 인터페이스
	int a = 10;				// 상수 : public static final 생략

	public abstract void sayHello(String name);		// 추상메소드
}

interface IGoodBye06 {		// 인터페이스
	public abstract void sayGoodBye(String name);	// 추상메소드
}

// 인터페이스끼리 상속 받을때는 extends 사용, 다중 상속 가능
interface ITotal06 extends IHello06, IGoodBye06 {
	public abstract void greeting(String name);
}

// 최종적으로 상속받는 구현 클래스에서 3개의 추상메소드를 모두 메소드 오버라이딩 해야함
class SubClass06 implements ITotal06 {
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕가세요!");
	}

	public void greeting(String name) {
		System.out.println(name + ", 안녕!");
	}
}

class AbstractTest06 {
	public static void main(String[] args) {
		SubClass06 test = new SubClass06();
		test.sayHello("홍길동");
		test.sayGoodBye("홍길동");
		test.greeting("홍길동");
		
		System.out.println(IHello06.a);
//		IHello06.a = 30; 					a: 상수이기 때문에 값을 수정할 수 없다.
		System.out.println(test.a);
	}
}