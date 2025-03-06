package practice.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class SelectBoard {
	// DB_Select Data from Board -> 메소드 오버로딩 활용(작성자만 출력, 작성자+글제목만 출력 등등등)
	public void boardSelect() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;
		PreparedStatement pstmt = null;
		// ---JDBC_Select 추가된 내용 -------
		ResultSet rs = null;

		BoardDTO dto = new BoardDTO(); // 데이터베이스에서 얻어온 필드값 저장할 변수 선언
		String sql; // SQL문을 저장할 변수 선언

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			// ---JDBC_Select 추가된 내용 -------
			// 글목록, 작성자, 글내용, 작성시간
			sql = "SELECT no, subject, writer, content, reg_date FROM board";

			System.out.printf("번호 \t 작성자 \t 제목 \t\t 내용\t\t 날짜\n");
			System.out.printf("------------------------------------------------------------------------------\n");
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // 얻어진 레코드를 가져옴

			// 회원들의 가입 날짜를 연, 월, 일, 시:분:초 형식으로 출력
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			while (rs.next()) {
				dto.setNo(rs.getInt("no"));
				dto.setWriter(rs.getString("writer"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setTs(rs.getTimestamp("reg_date"));
				System.out.printf(" %d \t %s \t %s\t\t %s\t\t %s\t \n", dto.getNo(), dto.getWriter(),
						 dto.getSubject(), dto.getContent(), sd.format(dto.getTs()));
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
		} finally {
			try {// rs, stmt, con 객체를 close() 메서드를 호출해 해제
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
