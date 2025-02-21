package p2025_02_21;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// length() : 문자열의 길이를 구해주는 메소드
		// capacity() : heap 메모리상에 할당된 공간 크기를 구해주는 메소드(기본값:16byte)
		
		StringBuffer sb1 = new StringBuffer("java");	// 생성자에 String 값을 주면 해당 크기만큼 추가로 할당
		System.out.println("sb1.length() : " + sb1.length());
		System.out.println("sb1.capacity() : " + sb1.capacity());	// 20 capacity : 용량(기본16 + 문자열크기4) 
		
		// StringBuffer 클래슨느 메소드에 의해서 값의 변화가 일어나면, heap 메모리 상의 공간을 새로 할당하지 않고
		// 동적으로 공간의 크기가 자동으로 늘어남
		sb1.append("A string buffer implements)"
				+ "a mutable squence of characters");	// append : 기존 sb1에 추가(동적으로 추가)

		System.out.println("sb1.length() : " + sb1.length());
		System.out.println("sb1.capacity() : " + sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer();			// 기본 생성자로 생성하면 16byte 크기의 용량 생성
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		
	}

}
