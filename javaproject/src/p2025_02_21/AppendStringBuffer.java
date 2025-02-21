package p2025_02_21;

public class AppendStringBuffer {
	public static void main(String[] args) {

		// StringBuffer 객체 생성
		StringBuffer sb1 = new StringBuffer("gemini");
		System.out.println("sb1 = " + sb1);

		// StringBuffer sb1에 문자열을 추가해 새로운 객체 생성
		StringBuffer sb2 = sb1.append(" is beautiful");
		System.out.println("sb2 = " + sb2);
		System.out.println("sb1 = " + sb1);
		
		// sb2와 sb1의 주소값이 같다
		System.out.println(sb1 == sb2);
		if(sb1 == sb2) {			// 주소비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}

		// 정수형 데이터 형을 추가
		System.out.println(sb1.append(1004));
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);

		// sb1에 저장된 문자를 대문자로 변환
		// StringBuffer 클래스를 String 클래스의 생성자를 이용해서 String 클래스로 형변환
		String str = new String(sb1); // StringBuffer를 String 으로 형변환
		System.out.println(str.toUpperCase());
	}
}
