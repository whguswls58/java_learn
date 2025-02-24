package p2025_02_24;

// 1. 부모 클래스에 있는 필드를 자식 클래스에서 재정의(동일한 이름의 변수)하면,
//	 자식 클래스에서 재정의한 필드만 사용가능
// 2. 부모 클래스의 필드는 더이상 상속되지 않기 때문에 은닉 변수가 됨

class Point2D03{				// 부모클래스
	protected int x = 10;		// 자식 클래스에서 x, y를 재정의하면 부모 클래스의 x, y는 은닉변수가됨
	protected int y = 20;		// 은닉변수 or 쉐도우변수
}

class Point3D03 extends Point2D03{	// 자식 클래스
	protected int x = 40;	// 부모 클래스에 존재하는 멤버변수를 자식 클래스에서 재정의
	protected int y = 50;
	
	protected int z = 30;
	public void print() {
		System.out.println(x + ", " + y + ", " + z);	// 자식 클래스의 재정의된 x, y 출력
	}													// 40, 50, 30
}


public class SuperTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D03 pt =new Point3D03();
		pt.print();
	}

}
