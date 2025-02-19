package p2025_02_19;

class Singleton{
	
	// 싱글톤(singleton) : 객체 생성을 1번만 수행
	private static Singleton s = new Singleton();	// 정적 필드
	
	private Singleton() {};						// 기본 생성자를 private로 접근 제한 - 직접 객체 생성을 막아주는 역할
	
	public static Singleton getInstance() {		// 정적 메소드
		return s;
	}
	
	public void check() {
		System.out.println("메소드 호출 성공1");
	}
	
	public void check1() {
		System.out.println("메소드 호출 성공2");
	}

}


public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// private 접근제어자 때문에 외부 클래스에서 접근 x
		//
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		
		if(obj1 == obj2) {						// 주소값 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		// Singleton s = new Singleton();		// 오류 발생
		
		obj1.check();
		obj1.check1();
		obj2.check();
		obj2.check1();
		
		
	}

}
