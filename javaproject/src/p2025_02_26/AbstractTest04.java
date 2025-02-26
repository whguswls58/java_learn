package p2025_02_26;

interface IHello04 {
	public abstract void sayHello(String name);
}

abstract class GoodBye04 {
	public abstract void sayGoodBye(String name);
}

// 클래스와 인터페이스를 동시에 상속받을때는 클래스를 먼저 상속받고, 그 뒤에 인터페이스를 상속
// 상속 순서가 바뀌면 오류 발생
class SubClass04 extends GoodBye04 implements IHello04 {
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

class AbstractTest04 {
	public static void main(String[] args) {
		SubClass04 test = new SubClass04();
		test.sayHello("홍길동");
		test.sayGoodBye("홍길동");
	}
}