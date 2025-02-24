package p2025_02_24;

class Point2D04{				// 부모클래스
	protected int x = 10;		// 자식 클래스에서 x, y를 재정의하면 부모 클래스의 x, y는 은닉변수가됨
	protected int y = 20;		// 은닉변수 or 쉐도우변수
}

class Point3D04 extends Point2D04{	// 자식 클래스
	protected int x = 40;	// 부모 클래스에 존재하는 멤버변수를 자식 클래스에서 재정의
	protected int y = 50;
	
	protected int z = 30;
	public void print() {
		System.out.println(x + ", " + y + ", " + z);	// 자식 클래스의 재정의된 x, y 출력
	}													// 40, 50, 30
	
	// super : 부모 클래스 의미
	// super.x는 부모 클래스의 은닉된 필드를 접근할 때 사용	
	// super.x는 자식클래스의 메서드 안에서만 사용 가능
//	System.out.println(super.x);	// 오류발생
	
	public void print02() {
		System.out.println(super.x + ", " + super.y + ", " + z);	// super를 이용 부모 클래스 x, y 출력
	}																// 10, 20, 30
}


public class SuperTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point3D04 pt =new Point3D04();
		pt.print();
		pt.print02();
		
		
	}

}
