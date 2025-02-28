package p2025_02_27;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
	키보드를 통해 회원들의 정보 입력받는 클래스(MemberInput)
	성명, 나이, 이메일, 주소 입력
	
	회원정보를 저장한느 클래스(MemberInfo) 멤버변수로 저장
	2명이상의 정보를 처리시 List 자료구조 이용 저장
	
*/
public class MemberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		List<MemberInfo> member = new ArrayList<MemberInfo>();

		do {

			try {
				MemberInfo info = new MemberInfo();

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
			} catch(Exception e) {
				while(true) {
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

		System.out.println("===============================");
		System.out.println("회원정보 출력");

		for (int i = 0; i < member.size(); i++) {
			MemberInfo m = new MemberInfo();
			m = member.get(i);

			System.out.println((i + 1) + "번째 회원의 정보");
			System.out.println("이름: " + m.getName());
			System.out.println("나이: " + m.getAge());
			System.out.println("이메일: " + m.getEmail());
			System.out.println("주소: " + m.getAddress());
			System.out.println();

		}

	}

}

class MemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
