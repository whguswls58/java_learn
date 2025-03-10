package p2025_03_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			
			System.out.print("수정할 글 번호 입력: ");
			int no = Integer.parseInt(br.readLine());
			System.out.print("수정할 작성자명 : ");
			String writer = br.readLine();
			System.out.print("수정할 비밀번호 : ");
			String passwd = br.readLine();
			System.out.print("수정할 제목 : ");
			String subject = br.readLine();
			System.out.print("수정할 내용 : ");
			String content = br.readLine();
			
			String sql = "UPDATE board SET writer=?, passwd=?, subject=?, content=?, reg_date=now() "
						+ "where no = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setInt(5, no);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("수정 성공");
			}else {
				System.out.println("수정 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
