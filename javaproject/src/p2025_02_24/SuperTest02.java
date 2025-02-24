package p2025_02_24;

class Point2D02{				// 부모클래스
	protected int x =10;	
	protected int y =20;
}

class Point3D02 extends Point2D02{	// 자식 클래스
	protected int z = 30;
	public void print() {
		System.out.println(x + ", " + y + ", " + z);	// x, y 상속받아 사용하는 필드
	}													// 10, 20, 30
}

public class SuperTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D02 pt =new Point3D02();
		pt.print();
		
	}

}
