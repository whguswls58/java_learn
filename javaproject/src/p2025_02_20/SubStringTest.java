package p2025_02_20;

public class SubStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// substring() : 전체 문자열에서 특정범위의 문자를 추출
		
		// substring(int beginIndex) : beginIndex번호부터 끝까지 문자 추출
		// substring(int beginIndex, int endIndex)
		//  : beginIndex부터 endIndex-1번까지 문자 추출
		
		String message = "Java program creates many objects.";
		
		// 인덱스 번호 13번부터 끝까지 문자 추출
		String str1 = message.substring(13);
		System.out.println(str1);
		
		// 인덱스 번호 13번부터 15번까지 문자추출
		String str2 = message.substring(13, 16);
		System.out.println(str2);
		
	}

}
