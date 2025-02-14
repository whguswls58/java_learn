package p2025_02_14;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "자바";
		String str2 = "자바";
		String str3 = new String("자바");
		String str4 = new String("자바");
		
		// 비교 연산자(==)로 참조하는 주소 비교
		System.out.println(str1==str2 ? "같은 주소" : "다른 주소");	// 같은 주소
		System.out.println(str3==str4 ? "같은 주소" : "다른 주소");	// 다른 주소
		
		// 참조하는 값(데이터) 비교
		// String.equals(object) : boolean
		System.out.println(str1.equals(str2) ? "참조하는 값이 같다." : "참조하는 값이 다르다.");
		System.out.println(str3.equals(str4) ? "참조하는 값이 같다." : "참조하는 값이 다르다.");
		
	}

}
