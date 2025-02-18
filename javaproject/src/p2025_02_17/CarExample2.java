package p2025_02_17;

class Car2{
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
// 생성자 오버로딩 : 한개의 클래스에 생성자를 여러개 선언
// 생성자 오버로딩 조건 : 매개변수의 자료형, 갯수, 순서를 서로 다르게 선언
	
// this() : 같은 클래스안에 있는 생성자를 호출
	public Car2(){
	}
	
	public Car2(String model) {
		this(model, "은색", 250);
	}
	public Car2(String model, String color) {
		this(model, color, 250);
	}
	public Car2(String model, String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
}


public class CarExample2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car2 car1 = new Car2();
		System.out.println("car1.company: " + car1.company);
		System.out.println("car1.model: " + car1.model);
		System.out.println("car1.color: " + car1.color);
		System.out.println("car1.maxSpeed: " + car1.maxSpeed);
		System.out.println();
		
		Car2 car2 = new Car2("자가용");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println("car2.color: " + car2.color);
		System.out.println("car2.maxSpeed: " + car2.maxSpeed);
		System.out.println();
		
		Car2 car3 = new Car2("자가용", "빨강");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println("car3.maxSpeed: " + car3.maxSpeed);
		System.out.println();
		
		Car2 car4 = new Car2("택시", "검정", 200);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
	}

}
