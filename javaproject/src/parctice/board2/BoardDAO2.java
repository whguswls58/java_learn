package parctice.board2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import practice.board.BoardDTO;

public class BoardDAO2 {

	
	
	
	// 글목록 검색 (select) 
	// 페이지 별로 10개씩 출력
	
	
	
	
//	select no, writer, subject, content, req_date
//	from (select rownum rn, no, writer, subject, content, req_date
//	      from (select no, writer, subject, content, req_date
//	            from board
//	            order by no desc)
//	      where rownum <= 10*i
//	where rn > 10*(i-1);
	
	
	// 글작성 (insert)
	public void boardInsert(BoardDTO2 dto) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;
		PreparedStatement pstmt = null;

		String sql;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			// INSERT 쿼리문을 작성
			// no 값은 시퀀스를 활용하여 자동으로 1씩 증가하며 자동으로 생성
			// sysdate 함수 - 시스템의 날짜, 시간을 구해주는 오라클 함수
			sql = "INSERT into board (no, writer, passwd, subject, content, reg_date) "
					+ "values (board_seq.nextval, ?, ?, ?, ?, sysdate)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getPasswd());
			pstmt.setString(3, dto.getSubject());
			pstmt.setString(4, dto.getContent());

			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println(" Data insert success!! ");
			} else {
				System.out.println(" Data insert failed ");
			}
		}catch(Exception e){		
			System.out.println("데이터베이스 연결 실패!");			
		}finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	// 글수정(update)
	
	public void boardUpdate(BoardDTO2 dto) {		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;
		PreparedStatement pstmt = null;

		String sql;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			
			
			
		}catch(Exception e) {
			
			
		}finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}
	
	
	
	// 글삭제(delete)
	
	
	
}
