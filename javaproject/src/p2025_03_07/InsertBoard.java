package p2025_03_07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String sql;
		String writer, passwd, subject, content;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			// 게시판 작성
			// 데이터 입력(no, writer, passwd, subject, content, reg_date)
			System.out.print("작성자 이름을 입력하세요: ");
			writer = br.readLine();
			System.out.print("작성자 비밀번호를 입력하세요: ");
			passwd = br.readLine();
			System.out.print("제목을 입력하세요: ");
			subject = br.readLine();
			System.out.print("내용을 입력하세요: ");
			content = br.readLine();
			
//			sql = "INSERT into board (no, writer, passwd, subject, content, reg_date) "
//					+ "values (board_seq.nextval, ?, ?, ?, ?, sysdate)";
			sql = "INSERT into board "
					+ "values (board_seq.nextval, ?, ?, ?, ?, sysdate)";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			
			int result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("글작성 성공!!");
			}else {
				System.out.println("글작성 실패ㅠㅠ");
			}			
			
		}catch(Exception e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}finally {
			try {
				if(br != null)
					br.close();
				if(pstmt != null)
					pstmt.close();
				if(con != null)
					con.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
