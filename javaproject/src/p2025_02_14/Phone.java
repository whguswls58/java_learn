package p2025_02_14;

public class Phone {

	// 휴대폰 정보
	
	String device_type;
	String os;
	String phone_name;
	
	// 생성자 오버로딩
	public Phone() {
		
	}
	
	public Phone(String data) {
		if(data.equals("iphone") || data.equals("galaxy")) {
			this.device_type = data;
			if(data.equals("iphone"))
				this.os = "ios";
			if(data.equals("galaxy"))
				this.os = "android";
		} else {
			this.phone_name = data;
		}
	}
	
	
	public Phone(String dt, String pn) {
		this.device_type = dt;
		if(dt.equals("iphone"))
			this.os = "ios";
		if(dt.equals("galaxy"))
			this.os = "android";
		this.phone_name = pn;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone phone1 = new Phone("iphone", "아이폰7");
		Phone phone2 = new Phone("galaxy", "갤럭시플립6");
		
		Phone phone3 = new Phone("galaxy");
		Phone phone4 = new Phone("아이폰8");
		
		System.out.println("Phone1: " + phone1.device_type + " " + phone1.os + " " + phone1.phone_name);
		System.out.println("Phone1: " + phone2.device_type + " " + phone2.os + " " + phone2.phone_name);
		System.out.println("Phone1: " + phone3.device_type + " " + phone3.os + " " + phone3.phone_name);
		System.out.println("Phone1: " + phone4.device_type + " " + phone4.os + " " + phone4.phone_name);
		
	}

}
