package p2025_02_24;

class Point2D05 {					// 부모 클래스
	protected int x = 10;
	protected int y = 20;

	public Point2D05() {			// 기본 생성자
		System.out.println("슈퍼 클래스인 Point2D 생성자 호출");
	}
}

class Point3D05 extends Point2D05 {		// 자식 클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + "," + z);
	}

	// 자식클래스의 생성자 (기본생성자, 매개변수가 있는 생성자)가 호출되면,
	// 부모 클래스의 기본 생성자를 호출
	public Point3D05() {
		System.out.println("서브 클래스인 Point3D 생성자 호출");
	}
}

class SuperTest05 {
	public static void main(String[] args) {
		Point3D05 pt = new Point3D05();
		pt.print();
	}
}