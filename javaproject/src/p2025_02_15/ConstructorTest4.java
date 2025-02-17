package p2025_02_15;

class MyDate4{
	private int year;
	private int month;
	private int day;
	
	public MyDate4(int year, int month, int day) {
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

public class ConstructorTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate4 d = new MyDate4(2025, 1, 1);
		d.setDay(25);
		d.setMonth(12);
		d.print();
		
		System.out.println("돌려받은 year: " + d.getYear());
	}

}
