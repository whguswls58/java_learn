package p2025_02_26;

interface IHello {					// 부모 인터페이스
	void sayHello(String name);		// 추상 메소드(public abstract 생략)
}

// 인터페이스를 상속받을 때는 implements 로 상속
class Hello implements IHello {
	
	@Override
	public void sayHello(String name) {		// 메소드 오버라이딩
//	void sayHello(String name){
		System.out.println(name + "씨 안녕하세요!");
	}
}

class InterfaceTest01 {
	public static void main(String[] args) {
		// 인터페이스는 자체적으로 객체 생성을 할 수 없다.
//		IHello01 ih = new IHello01();	
		
		Hello obj = new Hello();
		obj.sayHello("홍길동");			// 메소드 오버라이딩 된 메소드가 호출
		obj.sayHello("홍길동");
	}
}
