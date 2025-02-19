package p2025_02_19;


import java.util.Scanner;

// DTO(Data Transfer Object)
class MemberInfo2{
	private String name;		// 필드
	private int age;
	private String email;
	private String address;
	
//	public MemberInfo2(String name, int age, String email, String address) {
//		this.name = name;
//		this.age = age;
//		this.email = email;
//		this.address = address;
//	}
	
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

	public void print() {
		System.out.println("name:"+ name);
		System.out.println("age:"+ age);
		System.out.println("email:"+ email);
		System.out.println("address:"+ address);
	}
	
}

public class MemberInput2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성명을 입력 하세요?");
		String name = sc.nextLine();
		System.out.println("나이를 입력 하세요?");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("이메일주소를 입력 하세요?");
		String email = sc.nextLine();
		System.out.println("주소를 입력 하세요?");
		String address = sc.nextLine();
		
//		MemberInfo2 m = new MemberInfo2(name, age, email, address);	
		MemberInfo2 m = new MemberInfo2();	
		m.setName(name);
		m.setAge(age);
		m.setEmail(email);
		m.setAddress(address);
		
//		m.name = "홍길동";		
//		System.out.println(m.name);
		

		m.print();
	}

}
