package p2025_02_20;

public class FindBlankIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message = "Java program creates many objects.";
		
		// length() : 문자열 길이 구함
		// charAt(int index) : 특정 인덱스 번호에 있는 문자를 리턴
		
		int len = message.length();
		
		System.out.println(len);
		
		// message 중에서 공백 ' '을 찾음
		for(int i=0; i<len ; i++) {
			char c = message.charAt(i);
			if(c == ' ') {
				System.out.println("index = " + i);
			}
		}
		
	}

}
