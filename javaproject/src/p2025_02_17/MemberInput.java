package p2025_02_17;

import java.util.Scanner;

class MemberInfo{
	private String name;
	private int age;
	private String email;
	private String address;
	
	public MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

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
	
	public void print() {
		System.out.println("회원 이름: " + name);
		System.out.println("회원 나이: " + age);
		System.out.println("회원 이메일: " + email);
		System.out.println("회원 주소: " + address);
	}
	
}


public class MemberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 키보드를 통해 각 회원들의 정보를 입력
		// 회원 정보 : 성명, 나이, 이메일, 주소 순서로 입력
		// 키보드로 입력한 회원의 정보는 새로운 회원정보를 저장하는 클래스(MemberInfo) 멤버변수에 저장 및 출력

		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("회원 정보를 입력버튼 : 1");
			System.out.println("종료 : 2");
			
			num = sc.nextInt();				// nextInt는 enter를 받을수 없어서 그냥 입력할 경우 다음 scan 구문에 enter값이 입력됨
			sc.nextLine();					// 값을 연속해서 받기 위해 엔터값을 받아줄 nextLine 추가
			
			if(num == 1) {					// 회원정보 입력
				// 회원정보 입력받을 공간
				String[] member = new String[4];		
				
				// 회원정보 입력 함수
				member = member_info(member, sc);		
				
				// 회원정보 객체 생성
				MemberInfo memberInfo = new MemberInfo(member[0], Integer.parseInt(member[1]), member[2], member[3]);
				// 회원정보 출력
				memberInfo.print();
				System.out.println();
			} else if(num==2){				// 종료
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("잘못된 값을 입력하였습니다.");
			}
		}
		sc.close();
	}
	
	static String[] member_info(String[] member, Scanner sc) {		
		
		System.out.print("이름을 입력하세요: ");
		member[0] = sc.nextLine();
		System.out.print("나이를 입력하세요: ");
		member[1] = sc.nextLine();
		System.out.print("이메일을 입력하세요: ");
		member[2] = sc.nextLine();
		System.out.print("주소를 입력하세요: ");
		member[3] = sc.nextLine();
		System.out.println();		

		return member;
	}

}
