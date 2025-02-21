package p2025_02_21;

import java.util.Scanner;

public class JuminCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// 예외 : 프로그램 상에서 예상치 못한 오류
		// 예외처리 : 프로그램을 안전하게 종료시키기 위해 예외처리
		//			주로 입출력 처리시 예외처리
		
		
		while(true) {
			try {
				System.out.println("주민번호 앞자리를 입력하세요?");
				String jumin1 = sc.nextLine();
				System.out.println("주민번호 뒷자리를 입력하세요?");
				String jumin2 = sc.nextLine();
				
				String g = jumin2.substring(0, 1);		// 예외 발생(스페이스바 or 엔터키(null 값)등을 입력하는 경우 등등
				if(jumin1.equals("")) {					// 입력받지 않은 경우
					System.out.println("주민번호 앞자리를 입력하세요.");		
				}else if(jumin1.length() != 6) {			 	//		
					System.out.println("주민번호 앞자리 6자리를 입력하세요.");
				}else if(jumin2.equals("")) {
					System.out.println("주민번호 뒷자리를 입력하세요.");
				}else if(jumin2.length() != 7) {
					System.out.println("주민번호 뒷자리 7자리를 입력하세요");
				}else if(g.equals("1") || g.equals("3")) {
					System.out.println("남자입니다.");
					break;
				}else if(g.equals("2") || g.equals("4")) {
					System.out.println("여자입니다.");
					break;
				}else {
					System.out.println("똑바로 입력하세요.");
				}		
			}catch(Exception e){
				System.out.println("잘못된 정보입니다.");
				
			}
		}
	}

}
