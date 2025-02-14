package p2025_02_14;

public class Animal {

//	사용자 정의 클래스(자료형)
	
	int age;			// 필드(field), 멤버변수, 전역변수 - 메소드 바깥쪽에 정의되는 변수
						// heap 영역에 저장
	public Animal() {	// 기본 생성자(Default Constructor) - 매개 변수가 없는 생성자
		System.out.println("생성자 호출 성공");
	}
	
	public Animal(int age) {
		this.age = age;
	}
	
	
	public static void main(String[] args) {

		int a = 10;		// 지역 변수 : stack 영역에 저장
		
		String str = new String("자바");
		Animal ani 		= 	new 	Animal();
//		클래스   레퍼런스변수		연산자	생성자 호출
		
		System.out.println(ani.age);	// 초기화 시키지 않으면 int 형은 0을 초기값으로 가짐
		ani.age = 3;					// ani 객체의 age 값을 3으로 갱신
		System.out.println(ani.age);
		
		Animal ani2 = new Animal(2);
		System.out.println(ani2.age);
		
//		ani와 ani2의 주소값 비교
		System.out.println( ani==ani2 ? "같은 주소" : "다른 주소");
		
		
		
	}

}
