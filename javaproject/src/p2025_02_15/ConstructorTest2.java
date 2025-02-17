package p2025_02_15;

class MyDate2{
	private int year;
	private int month;
	private int day;
	
	public MyDate2() {			// 기본 생성자
		year = 2025;
		month = 2;
		day = 17;
	}
	
	public MyDate2(int year, int month, int day) {		// 매개변수가 있는 생성자
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	// 1. 필드값을 메소드를 호출한 곳에 돌려주는 역할
	public int getYear() {						// getter 메소드
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	// 2. 필드값 수정하는 역할
	public void setYear(int year) {				// setter 메소드
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	// 3. 필드값 출력
	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
	
}


public class ConstructorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate2 d = new MyDate2();
		d.print();
		
		// 필드의 접근제어자가 private 이기 때문에 외부 클래스에서 직접 접근 불가능
		// 접근제어자가 private 일 경우 클래스의 변수에 접근은 getter, setter 메소드로 접근
//		System.out.println(d.year);
		
		d.setYear(2023);
		d.print();
		
		MyDate2 d2 = new MyDate2(2025, 2, 18);
		
	}

}
