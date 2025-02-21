package p2025_02_21;

import java.util.Scanner;

public class JuminCheckTesk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 키보드를 통해서 주민번호를 입력했을때 유효한 주민번호인지 아닌지 판별하는 프로그램
		// 유효하지 않은 주민번호의 경우 메세지 출력

		// 1. 주민번호 앞자리 6자리 아니면 메세지 출력
		// 2. 주민번호 뒷자리 7자리가 아니면 메세지 출력
		// 3. 유효한 주민번호 아니면 메세지 출력

		Scanner sc = new Scanner(System.in);
		String input_jumin;
		
		while(true) {
			try {
				System.out.print("주민번호를 입력하세요(yymmdd-n******): ");
				System.out.println();
				input_jumin = sc.nextLine();				
				String[] split = input_jumin.split("-");
				
				// 입력받은 주민번호 타당성 검사
				boolean result = validity(split);
				// 남자 여자 판단
				String g = split[1].substring(0, 1);
				if(result) {					// 유효한 주민번호일 경우 남자인지 여자인지 판단
					if(g.equals("1") || g.equals("3")) {
						System.out.println("타당한 주민번호입니다.");
						System.out.println("남자입니다.");
						break;
					}else if(g.equals("2") || g.equals("4")) {
						System.out.println("타당한 주민번호입니다.");
						System.out.println("여자입니다.");
						break;
					}	
				}else {
					System.out.println("타당하지 않은 번호입니다. 번호를 똑바로 입력하세요.");
					System.out.println("=========================================");
				}		
			}catch(Exception e){
				System.out.println("양식에 맞게 입력하세요.(yymmdd-n******)");
				System.out.println("=========================================");
			}
		}
		sc.close();	
			
	}

	// 주민번호 타당성 검사 메소드(클라우드 자료참조)
	static boolean validity(String[] jumin) {
		
		String jumin1 = jumin[0]+jumin[1];			// 주민번호 앞자리 문자열 + 뒷자리 문자열

		// digits[] = 주민번호 앞자리 int 배열		
		int[] digits = new int[jumin1.length()];
		for (int i = 0; i < jumin1.length(); i++) {
			digits[i] = jumin1.charAt(i) - '0';		// charAt() - char형 리턴하므로 '0'을 빼줘야 int 정수형값으로 됨
		}
		
		// 주민번호 타당성 검사
		int sum=0;
		int[] check = {2,3,4,5,6,7,8,9,2,3,4,5};
	
		for(int i=0; i<jumin1.length()-1; i++) 
			sum += digits[i] * check[i];
		

		int checkNum = digits[12];
		
		sum = sum % 11;
		sum = 11 - sum;
		
		// 타당하면 true 반환, 타당하지 않으면 false 반환
		if(11 - sum >= 10) {
			sum = sum % 10;
			if(checkNum != sum)
				return false;
			else 
				return true;
		}else {
			if(checkNum != sum)
				return false;
			else 
				return true;
		}		
	}
}
