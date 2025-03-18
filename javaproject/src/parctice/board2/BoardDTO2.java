package parctice.board2;

import java.sql.Timestamp;

// 게시판 글 작성 DTO
public class BoardDTO2 {

	private int no;					// 글 번호
	private String writer;			// 작성자
	private String passwd;			// 비밀번호
	private String subject;			// 글 제목
	private String content;			// 글 내용
	private Timestamp ts;			// 작성 시간
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getTs() {
		return ts;
	}
	public void setTs(Timestamp ts) {
		this.ts = ts;
	}
	
	
	
	
}
