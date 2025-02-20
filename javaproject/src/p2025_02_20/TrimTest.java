package p2025_02_20;

public class TrimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// trim() : 문자열 좌, 우 공백을 없애주는 역할
		// boolean equals() : 문자열 값을 비교
		
		String str1 = new String("자바    ");
		String str2 = new String("    자바");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.trim().equals(str2.trim()));
		
		
	}

}
