package p2025_03_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import oracle.net.aso.e;

public class DeleteBoard {

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
			
			System.out.print("삭제할 글 번호 입력: ");
			int no = Integer.parseInt(br.readLine());
			
			String sql = "DELETE FROM board WHERE no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("글삭제 성공");
			}else {
				System.out.println("글삭제 실패");
			}
		
		} catch (NumberFormatException ne) {
			System.out.println("숫자 값을 입력하세요.");
			ne.printStackTrace();
		} catch (Exception e) {
			System.out.println("데이터베이스 연동 실패");
			e.printStackTrace();
		} finally {
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
