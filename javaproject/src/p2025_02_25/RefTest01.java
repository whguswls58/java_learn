package p2025_02_25;

class Parent{						// 부모 클래스
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : Parentprn 메소드");
	}
}

class Child extends Parent{			// 자식 클래스
	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메소드");
	}
}

//	자동 형변환(업 캐스팅)
//	1. 자식클래스에서 부모클래스로 형변환 하는 것이다.
// 	2. 참조 가능한 영역이 축소가 된다.
//	3. 컴파일러에 의해서 자동 형변환이 된다

public class RefTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.parentPrn();				// 상속받은 메소드 호출
		c.childPrn();
		
		Parent p;					// 업캐스팅(자동 형변환)
		p = c;
		
		Parent p1 = new Child();	// 업캐스팅(자동 형변환)
		
		p.parentPrn();				// 업캐스팅 후에는 부모로부터 상속받은 메소드만 호출 가능
//		p.childPrn();				// 자식 클래스의 메소드에는 접근 불가능
		
	}

}
