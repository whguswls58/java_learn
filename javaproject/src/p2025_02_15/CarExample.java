package p2025_02_15;


class Car{
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
// 생성자 오버로딩 : 한개의 클래스에 생성자를 여러개 선언
// 생성자 오버로딩 조건 : 매개변수의 자료형, 갯수, 순서를 서로 다르게 선언
	public Car(){
	}
	
	public Car(String model) {
		this.model=model;
	}
	public Car(String model, String color) {
		this.model=model;
		this.color=color;
	}
	public Car(String model, String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
}

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		System.out.println("car1.company: " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
	}

}
