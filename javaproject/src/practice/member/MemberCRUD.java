package practice.member;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class MemberCRUD {

	// 저장할 데이터
	List<MemberDTO> member;

	// 생성자
	public MemberCRUD() {
		member = new ArrayList<MemberDTO>();
	}

	// 회원정보 입력
	public void memberCreate(Scanner sc) {
		do {
			try {
				MemberDTO info = new MemberDTO();

				System.out.println("이름을 입력하세요.");
				info.setName(sc.nextLine());				
				System.out.println("나이를 입력하세요.");
				info.setAge(sc.nextInt());
				sc.nextLine();
				System.out.println("이메일을 입력하세요.");
				info.setEmail(sc.nextLine());
				System.out.println("주소를 입력하세요.");
				info.setAddress(sc.nextLine());

				member.add(info);

				System.out.println("추가 입력 하시겠습니까? Y/N");
				String s = sc.nextLine();

				if (s.equals("N") || s.equals("n")) {
					System.out.println("회원 입력을 종료하였습니다.");
					break;
				} else if (s.equals("Y") || s.equals("y")) {
					continue;
				} else {
					System.out.println("잘못된 값을 입력하셨습니다.");
					throw new Exception();
				}

			} catch (InputMismatchException e) {
				System.out.println("나이는 정수 값만 입력해주세요.");
				sc.nextLine();
			} catch (Exception e) {
				while (true) {
					System.out.println("추가 입력 하시겠습니까? Y/N");
					String s = sc.nextLine();

					if (s.equals("N") || s.equals("n")) {
						System.out.println("회원 입력을 종료하였습니다.");
						return;
					} else if (s.equals("Y") || s.equals("y")) {
						break;
					} else {
						System.out.println("잘못된 값을 입력하셨습니다. 다시 입력하세요.");
					}
				}

			}
		} while (true);
	}

	//	회원목록 출력
	public void memberList() {
		
		List<String> memberList = new ArrayList<String>();
		
		for (int i = 0; i < member.size(); i++) {
			MemberDTO m = new MemberDTO();
			m = member.get(i);		
			memberList.add(m.getName());
		}
		if(memberList.size()!=0) {
			System.out.println(memberList);
		}else {
			System.out.println("입력된 회원이 없습니다.");
		}
	}	
	
	// 회원정보 출력
	public void memberPrint(String s, String pw) {
		System.out.println("===============================");
		System.out.println("회원정보 출력");

		for (int i = 0; i < member.size(); i++) {
			MemberDTO m = new MemberDTO();
			m = member.get(i);

			if(m.getName().equals(s) && m.getPassward().equals(pw)) {
				System.out.println(s + "회원의 정보");
				System.out.println("이름: " + m.getName());
				System.out.println("나이: " + m.getAge());
				System.out.println("이메일: " + m.getEmail());
				System.out.println("주소: " + m.getAddress());
				break;
			}else {
				System.out.println(s + "회원의 정보가 존재하지 않습니다.");
			}

		}
	}
		
	// 회원정보 수정
	public void memberModify(String s, String pw, Scanner sc) {
		
		for (int i = 0; i < member.size(); i++) {
			boolean isStop = false;
			MemberDTO m = new MemberDTO();
			m = member.get(i);

			if(m.getName().equals(s) && m.getPassward().equals(pw)) {
				do {
					System.out.println("수정 항목을 선택해주세요.(단, 이름은 수정할 수 없습니다.)");
					System.out.println("1. 회원 비밀번호 수정");
					System.out.println("2. 회원 나이 수정");
					System.out.println("3. 회원 이메일 수정");
					System.out.println("4. 회원 주소 수정");
					System.out.println("5. 종료");
					
					String menu = sc.nextLine();
					
					switch (menu) {
					case "1":
						System.out.println("변경할 나이 입력");
						String passward = sc.nextLine();
						m.setPassward(passward);
						break;
					case "2":
						System.out.println("변경할 나이 입력");
						int age = sc.nextInt();
						sc.nextLine();
						m.setAge(age);
						break;
					case "3":
						System.out.println("변경할 이메일 입력");
						String email = sc.nextLine();
						m.setEmail(email);
						break;
					case "4":
						System.out.println("변경할 이메일 입력");
						String address = sc.nextLine();
						m.setEmail(address);
						break;
					case "5":
						isStop = true;
						break;
					default:
						System.out.println("잘못된 값 입력하였습니다. 다시 입력하세요.");
					}
				}while(!isStop);
				System.out.println(s + "회원의 정보가 수정되었습니다.");
			}else {
				System.out.println(s + "회원의 정보가 존재하지 않습니다.");
			}
		}
	}
	
	// 회원정보 삭제
	public void memberDel(String s, String pw) {
		for (int i = 0; i < member.size(); i++) {
			MemberDTO m = new MemberDTO();
			m = member.get(i);

			if(m.getName().equals(s) && m.getPassward().equals(pw)) {
				member.remove(i);
				System.out.println(s + "회원의 정보가 삭제되었습니다.");
			}else {
				System.out.println(s + "회원의 정보가 존재하지 않습니다.");
			}

		}
	}
	
	
}
