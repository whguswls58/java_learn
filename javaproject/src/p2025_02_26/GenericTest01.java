package p2025_02_26;

class TestClass {
	private int member;

	public void setValue(int value) { // 매개변수 자료형이 int -> int형이 아닌 다른 자료형의 값을 넘기면 오류 발생
		member = value;
	}

	public int getValue() {
		return member;
	}
}

class GenericTest01 {
	public static void main(String[] args) {
		TestClass obj01 = new TestClass();
		obj01.setValue(3); // 정상적인 호출가능

		System.out.println("되돌리는 값은->" + obj01.getValue());
//     obj01.setValue(3.4);					// 에러 발생 - 매개변수 자료형이 int
		System.out.println("되돌리는 값은->" + obj01.getValue());
//     obj01.setValue("이해할 수 있다.");		// 에러 발생 - 매개변수 자료형이 int
		System.out.println("되돌리는 값은->" + obj01.getValue());
	}
}
