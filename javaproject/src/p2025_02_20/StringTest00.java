package p2025_02_20;

public class StringTest00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("Java Programming");
		String str2 = new String("Java Programming");
		
		// 주소값 비교
		if(str1 == str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		String str3 = "Java Programming";
		String str4 = "Java Programming";
		
		// 주소값 비교
		if(str3 == str4) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		// 주소값 비교
		if(str1 == str3) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		// 문자열 값 비교
		if(str1.equals(str3)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
	}

}
