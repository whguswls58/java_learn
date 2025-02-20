package p2025_02_20;

public class SubStringEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 아래와 같은 주민번호가 있을때, 남자인지 여자인지 판별
		
		String ssn = "950101-22344567";
		
		String gender = ssn.substring(7,8);
		
		// substring()의 결과는 문자열(참조형) -> equals 메소드로 값 비교
		if(gender.equals("1") || gender.equals("3")) {
			System.out.println("남자");
		}else if(gender.equals("2") || gender.equals("4")){
			System.out.println("여자");
		}else {
			System.out.println("잘못된 정보입니다.");
		}
		
		System.out.println("=====================");
		
		// charAt()의 결과는 기본자료형 -> == (비교연산자)로 값 비교
		if(ssn.charAt(7) == '1' || ssn.charAt(7) == '3') {
			System.out.println("남자");
		}else if(ssn.charAt(7) == '2' || ssn.charAt(7) == '4') {
			System.out.println("여자");
		}else {
			System.out.println("잘못된 정보입니다.");
		}
	}

}
