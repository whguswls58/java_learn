package p2025_02_15;

class MyDate3{
	private int year;			// 필드
	private int month;
	private int day;
	
	// 기본 생성자는 객체를 생성할때 컴파일러가 자동적으로 생성하지만,
	// 매개변수를 가진 생성자가 있을 경우 자동으로 생성 x -> 직접 생성해야함
	public MyDate3() {			// 기본 생성자
	}

	// 매개변수가 있는 생성자 자동 생성
	// source - generate constructor using fields...
	
	// this : 내부 레퍼런스 변수
	public MyDate3(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
	
}


public class ConstructorTest3 {

	public static void main(String[] args) {
		
		MyDate3 d = new MyDate3();
		d.print();
		
		MyDate3 d2 = new MyDate3(2025, 12, 25);
		d2.print();
		
		
	}

}
