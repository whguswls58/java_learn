package p2025_02_24;

class Point2D06 {				// 부모클래스
	protected int x = 10;
	protected int y = 20;

//	public Point2D06() {		// 기본생성자
//		System.out.println("슈퍼 클래스인 Point2D 생성자 호출");
//	}

	public Point2D06(int xx, int yy) {		
		x = xx;
		y = yy;
	}
}

// super()
// 1. super()는 부모클래스의 매개변수를 가진 생성자를 호출
// 2. super()를 사용할 땐, 자식클래스의 생성자 안에서 첫번째 라인에 사용 
// 3. super()를 이용해서 부모클래스의 매개변수를 가진 생성자를 호출하면, 더 이상 부모클래스의 기본생성자는 호출되지 않음

class Point3D06 extends Point2D06 {
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + ", " + z);
	}

	public Point3D06() {
		super(40,50);			// 부모 클래스의 매개변수가 있는 생성자 호출
		System.out.println("서브 클래스인 Point3D 생성자 호출");
	}
}

class SuperTest06 {
	public static void main(String[] args) {
		Point3D06 pt = new Point3D06();
		pt.print();
	}
}