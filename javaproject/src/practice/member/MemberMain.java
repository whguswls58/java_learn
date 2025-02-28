package practice.member;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		MemberCRUD m = new MemberCRUD();
		
		do {
			System.out.println("메뉴를 입력 하세요?");
			System.out.println("1.회원정보 입력");
			System.out.println("2.회원목록 조회");
			System.out.println("3.회원정보 조회");
			System.out.println("4.회원정보 수정");
			System.out.println("5.회원정보 삭제");
			System.out.println("6.종료");

			String menu = sc.nextLine();
			String name, pw;
			switch (menu) {
			case "1":		// 입력
				m.memberCreate(sc);
				System.out.println();
				break;
			case "2":		// 회원목록 출력
				m.memberList();
				break;
			case "3":		// 회원정보 조회
				System.out.println("조회할 회원 이름 입력: ");
				name = sc.nextLine();
				System.out.println("조회할 회원 비밀번호 입력: ");
				pw = sc.nextLine();
				m.memberPrint(name, pw);
				System.out.println();
				break;
			case "4":		// 수정
				System.out.println("정보를 수정할 회원 이름 입력: ");
				name = sc.nextLine();
				System.out.println("수정할 회원 비밀번호 입력: ");
				pw = sc.nextLine();
				m.memberModify(name, pw, sc);
				System.out.println();	
				break;
			case "5":		// 삭제
				System.out.println("삭제할 회원 이름 입력: ");
				name = sc.nextLine();
				System.out.println("삭제할 회원 비밀번호 입력: ");
				pw = sc.nextLine();
				m.memberDel(name, pw);
				break;
			case "6":
				isStop = true;
				System.out.println("프로그램을 종료합니다.");
				break;
			default : 
				System.out.println("잘못된 값을 입력하셨습니다.");
				System.out.println();
			}
			
		}while(!isStop);
		
		sc.close();
	}

}
