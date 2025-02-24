package p2025_02_24;

// 메소드 오버라이딩(Method Overriding)
// : 부모 클래스로부터 상속받은 메소드를 자식 클래스에서 재정의해서 사용
// 1. 자식 클래스로 객체를 생성한 다음에 메소드를 호출하면, 메소드 오버라이딩 된 메소드만 호출
// 2. 부모 클래스에서 상속해주는 메소드는 더 이상 사용할 수 없는 은닉 메소드가 됨
// 3. 부모 클래스의 은닉 메소드를 자식 클래스에서 사용할 때, super.parentPrn()로 호출 가능

// super : 부모 클래스 의미
// 부모클래스의 은닉된 메소드를 호출할때 자식클래스의 메소드 안에서 호출가능


class Parent02{
	public void parentPrn() {
		System.out.println("부모 클래스: ParentPrn 메소드");
	}
}

class Child02 extends Parent02{

	@Override
	public void parentPrn() {		// 메소드 오버라이딩
		// TODO Auto-generated method stub
		System.out.println("자식 클래스: ParentPrn 메소드");
//		super.parentPrn();
	}
	
	public void childPrn() {
		System.out.println("자식 클래스 : ChildPrn 메소드");
		
	}

}

public class SuperSub06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child02 c = new Child02();
		c.parentPrn();			// 메소드 오버라이딩 된 메소드 호출
		c.childPrn();			// 자식클래스의 메소드 사용
		
		Parent02 p = new Parent02();
		p.parentPrn();
	}

}
