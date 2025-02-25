package p2025_02_25;

// 메소드의 다형성
// : 부모클래스로 상속받은 3개의 자식클래스에서 메소드오버라이딩한 draw() 메소드를 같은 이름으로 되어있지만
//  서로 동작하는 내용이 다름
abstract class ShapeClass {
	abstract void draw();
}

class Circ extends ShapeClass {
	void draw() {
		System.out.println("원을 그린다");
	}
}

class Rect extends ShapeClass {
	void draw() {
		System.out.println("사각형을 그린다");
	}
}

class Tria extends ShapeClass {
	void draw() {
		System.out.println("삼각형을 그린다");
	}
}

public class AbstractTest02 {
	public static void main(String args[]) {
		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();

		c.draw();
		r.draw();
		t.draw();
	}
}
