package p2025_02_25;

class Parent03 {
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child03 extends Parent03 {
	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

//	▪ 강제 형변환(다운 캐스팅)
//	1. 부모클래스에서 자식클래스로 형변환 하는 것이다.
// 	2. 참조 가능한 영역이 확대가 된다.
//	3. 컴파일러에 의해서 자동 형변환이 되지 않기 때문에 프로그래머가 직접 강제 형변환을
//	  해야 하며, 강제 형변환시 자료형을 생략할 수 없다.

class RefTest03 {
	public static void main(String[] args) {
		Parent03 p = new Child03(); // 업캐스팅
		p.parentPrn();				// 부모가 상속해준 메소드만 호출 가능
		// p.childPrn();			//-컴파일 에러
		
		// 안전한 방법으로 다운캐스팅 수행
		Child03 c; 					
		c = (Child03) p; 			// 강제 형변환으로 다운 캐스팅
									// 한번 업캐스팅을 한 p 를 다운 캐스팅해야함
		Child03 c1 = (Child03) p;	// 다운 캐스팅
		
		c.parentPrn();				// 참조가능한 영역의 확대
		c.childPrn();				// 다운캐스팅을 하면 자식 클래스의 메소드도 호출 가능
	}
}