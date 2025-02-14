package p2025_02_14;

class Car{
	
	// 필드
	// 필드는 Car 클래스로 객체를 생성할때 heap 메모리상에 공간을 할당  
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	public Car() {		// 기본 생성자
		System.out.println("생성자 호출 성공");
	}
	
}

public class CarExample {
	public static void main(String[] args) {

		// 객체 생성
		Car myCar = new Car();
		
		// 필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		// 필드값 변경
		myCar.speed = 30;
		System.out.println("수정된 현재속도: " + myCar.speed);
		
	}

}
