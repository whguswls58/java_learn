package p2025_02_20;

public class ReplaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// replace("자바", "JAVA") : 자바를 JAVA로 치환
		// replaceAll(String regex, String replacement) : 정규표현식과 일치하는 문자열을 대체문자열로 치환
		
		String oldStr = "자바는 객체지향 언어입니다. 자바자바";
		String oldStr2 = "가가가가나나나나다다다다";
		
		String newStr = oldStr.replace("자바", "JAVA");
		String newStr2 = oldStr2.replaceAll("[가-나]", "라");
		System.out.println(oldStr);
		System.out.println(newStr);
		System.out.println(oldStr2);
		System.out.println(newStr2);
		
	}

}
