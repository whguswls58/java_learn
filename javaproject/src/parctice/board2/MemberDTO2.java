package parctice.board2;

// 회원 DTO
public class MemberDTO2 {

	private int no;				// 회원번호
	private String name;		// 회원이름
	private String id;			// 아이디
	private String passwd;		// 비밀번호
	private String email;		// 회원 이메일
	private String address;		// 회원 주소
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
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
