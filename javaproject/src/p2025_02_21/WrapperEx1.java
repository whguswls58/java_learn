package p2025_02_21;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Integer 클래스는 기본생성자를 제공 x -> 기본생성자로 객체생성 x
		// Integer num = new Integer(); 	// 오류발생
		
		// 박싱(boxing) : heap 메모리를 박스로 생각, stack 메모리에 저장된 10을
		//				heap 메모리에 복사하는 것
		
		int n = 10;
		Integer num01 = new Integer(n);		// 박싱(boxing)
		
		// 언박싱(unboxing) : heap 메모리에 있는 데이터를 stack 메모리로 가져오는것
		int n01 = num01.intValue();
		
		// 자료형 변환 : "20" -> 20
		String s = "20";
		Integer num02 = new Integer(s);		// 박싱
		int n02 = num02.intValue();			// 언박싱
		
	}

}
