package p2025_02_18;

import java.util.Scanner;

class MemberInfo2{
	private String name;
	private int age;
	private String email;
	private String address;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}


public class MemberInput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberInfo2[] member = new MemberInfo2[5];
		int i=0;				// 입력 받은 회원 수
		String yn;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("회원 정보입력 : 'y', 입력 종료 : 'n'");
			yn = sc.nextLine();
			
			if(yn.equals("y") || yn.equals("Y")) {
				member[i] = new MemberInfo2();
				
				System.out.print("회원 이름을 입력하세요: ");
				member[i].setName(sc.nextLine());
				System.out.print("회원 나이를 입력하세요: ");
				member[i].setAge(sc.nextInt());
				sc.nextLine();
				System.out.print("회원 이메일을 입력하세요: ");
				member[i].setEmail(sc.nextLine());
				System.out.print("회원 주소를 입력하세요: ");
				member[i].setAddress(sc.nextLine());
				i++;
				System.out.println();
				
			} else if(yn.equals("n") || yn.equals("N")) {
				System.out.println("입력이 종료되었습니다.");
				break;
			} else {
				System.out.println("잘못된 값이 입력되었습니다.");
				continue;
			}
			
			if(i==5) {
				System.out.println("저장공간 부족");
				break;
			}
		}
		sc.close();
		
		System.out.println();
		
		for(int j = 0; j < i; j++) {
			System.out.println(j + "번째 회원 정보");
			System.out.println("회원 이름: " + member[j].getName());
			System.out.println("회원 나이: " + member[j].getAge());
			System.out.println("회원 이메일: " + member[j].getEmail());
			System.out.println("회원 주소: " + member[j].getAddress());
		}
		
	}

}
