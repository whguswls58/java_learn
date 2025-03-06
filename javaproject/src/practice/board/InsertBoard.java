package practice.board;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBoard {

	// DB_Insert into data
	public void boardInsert() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		BoardDTO dto = new BoardDTO();

		Connection con = null;
		PreparedStatement pstmt = null;

		String sql;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			// ---JDBC_Insert 추가된 내용-------
			// 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println(" 게시판 입력하기 .....");

			System.out.print(" 작성자 입력: ");
			dto.setWriter(br.readLine().trim());
			System.out.print(" 비밀번호 입력: ");
			dto.setPasswd(br.readLine().trim()); // 테이블에 추가할 email 필드 값을 입력 받음
			System.out.print(" 제목 입력: ");
			dto.setSubject(br.readLine().trim()); // 테이블에 추가할 tel 필드 값을 입력 받음
			System.out.print(" 내용 입력: ");
			dto.setContent(br.readLine().trim());

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
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
		} finally {
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
}