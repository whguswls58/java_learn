package p2025_02_21;

class TestClass1 {
	private Object member;

	public void setValue(Object value) { // 매개변수 Object(최상위 클래스, 슈퍼 클래스 - Object 하위 클래스 객체 모두 받을수 있음)
		member = value; // 어떤 자료형이 와도 받을수 있다.
	}

	public Object getValue() {
		return member;
	}
}

class GenericTest02 {
	public static void main(String[] args) {
		TestClass1 obj01 = new TestClass1();
		obj01.setValue(3);
		System.out.println("되돌리는 값은->" + obj01.getValue());

		obj01.setValue(3.4);
		System.out.println("되돌리는 값은->" + obj01.getValue());

		obj01.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->" + obj01.getValue());

	}
}
