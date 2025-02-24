package p2025_02_24;

// 상속에서 메소드
// 1. 부모 클래스의 메소드는 자식 클래스로 상속
// 2. 부모 클래스에서 자식 클래스의 메소드는 접근 할 수 없다.

class Parent{
	public void parentPrn() {
		System.out.println("부모 클래스의 메소드는 상속된다.");
	}
}

class Child extends Parent{
	public void childPrn() {
		System.out.println("자식 클래스의 메소드는 부모가 사용할 수 없다.");
	}
}


public class SuperSub05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.parentPrn();			// 상속받은 메소드 사용
		c.childPrn();			// 자식클래스의 메소드 사용
		
		Parent p = new Parent();
		p.parentPrn();
		
	}

}
