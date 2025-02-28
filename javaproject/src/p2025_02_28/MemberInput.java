package p2025_02_28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {

		List list = new ArrayList();

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

			MemberInfo m = new MemberInfo();
			// m.name="홍길동";
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

			list.add(m);		// 업캐스팅(자동 형변환)

			System.out.println("계속할려면 y, 멈출려면 n을 입력?");
			String yn = sc.next();
			if (yn.equals("y")) {
				continue;
			} else if (yn.equals("n")) {
				break;
			}

		} while (true);

		for (int i = 0; i < list.size(); i++) {
			// List에서 값을 불러올 때, 제네릭으로 설정된 자료형은 생략할 수 있음.
			MemberInfo m2 = (MemberInfo) list.get(i);		// 다운 캐스팅(강제 형변환)

			System.out.println("성명:" + m2.getName());
			System.out.println("나이:" + m2.getAge());
			System.out.println("E-Mail:" + m2.getEmail());
			System.out.println("주소:" + m2.getAddress());
		}
	}

}

// DTO(Data Transfer Object)
class MemberInfo extends Object {
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
