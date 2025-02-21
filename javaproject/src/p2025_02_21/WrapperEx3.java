package p2025_02_21;

public class WrapperEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자동 박싱
		Integer obj = 100;
		System.out.println("언박싱: " + obj.intValue());
		System.out.println("자동언박싱: " + obj);
		
		// 언박싱
		int Value1 =obj.intValue();
		
		// 자동 언박싱
		int value2 = obj;
		
		//자동 언박싱
		int result = obj + 100;
		System.out.println("result: " + result);
		
		
		
	}

}