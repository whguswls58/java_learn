package p2025_02_20;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// toUpperCase() : 대문자로 변환
		// toLowerCase() : 소문자로 변환
		
		String str1 = "Java Programming";
		
		// 1. String 객체를 생성한 후에 메소드에 의해서 값 변화가 일어나면
		//	변경된 값이 힙메모리 영역에 새로 저장
		// 2. Garbage Collection 기능(쓰레기 수집 기능)
		//	재사용할 수 없는 힙메모리 영역의 데이터를 모아서 삭제
		str1.toUpperCase();						// 메소드 호출 후에도 str1 내용은 수정되지 않는다(새로운 문자열을 생성)
												// 가비지컬렉션(재사용을 하지않음 -> 메모리에서 삭제)
		System.out.println(str1);				// Java Programming 
		System.out.println(str1.toUpperCase());	// JAVA PROGRAMMING

		String str2 = str1.toUpperCase();		// 메소드 처리결과를 str2에 저장
		System.out.println(str2);				// JAVA PROGRAMMING
		
		
	}

}
