package p2025_02_14;

class MyDate{
	
	private int year;		// field, 멤버변수
	private int month;		// 접근제어자가 private : 외부 클래스에서 접근 불가능
	private int day;
	
	// 생성자
	// 1. 생성자는 객체를 생성할때 호출
	// 2. 생성자는 필드값을 초기화 시키는 역할 
	public MyDate() {		// 기본 생성자(매개변수가 없는 생성자)
		year = 2025;
		month = 2;
		day = 14;
		
		System.out.println("객체가 생성될때 호출");
		
	}
	
	public void print() {		//메소드
		System.out.println(year+"/"+month+"/"+day);
	}	  	
}

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate md = new MyDate();
		
//		System.out.println(md.year);	// 접근제어자가 private 외부 클래스에서 직접 접근 불가능		
		md.print();
				
	}

}
