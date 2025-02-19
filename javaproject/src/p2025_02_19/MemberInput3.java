﻿package p2025_02_19;


import java.util.Scanner;

public class MemberInput3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 배열: 객체의 주소를 저장하는 배열
		MemberInfo3[] m = new MemberInfo3[5];
		int i = 0;
		String yn;

		do {
			Scanner sc = new Scanner(System.in);			
			System.out.print("성명을 입력하세요? ");
			String name = sc.nextLine();
			System.out.print("나이를 입력하세요? ");
			int age = sc.nextInt();	
			sc.nextLine();
			System.out.print("E-Mail을 입력하세요? ");
			String email = sc.nextLine();
			System.out.print("주소를 입력하세요? ");
			String address = sc.nextLine();

//			m[i] = new MemberInfo3(name, age, email, address);
			// m.name="홍길동";
			
			m[i] = new MemberInfo3();
			m[i].setName(name);
			m[i].setAge(age);
			m[i].setEmail(email);
			m[i].setAddress(address);
			
			i++;

			System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.next();
			if (yn.equals("y") || yn.equals("Y")) {
				continue;
			} else if (yn.equals("n") || yn.equals("N")) {
				break;
			}

		} while (true);

		for (int j = 0; j < i; j++) {
			System.out.println("성명:" + m[j].getName());
			System.out.println("나이:" + m[j].getAge());
			System.out.println("E-Mail:" + m[j].getEmail());
			System.out.println("주소:" + m[j].getAddress());
		}
	}

}

// DTO(Data Transfer Object)
class MemberInfo3 {
	private String name;
	private int age;
	private String email;
	private String address;
	
//	public MemberInfo3(String name, int age, String email, String address) {
//		this.name = name;
//		this.age = age;
//		this.email = email;
//		this.address = address;
//	}	
	
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
