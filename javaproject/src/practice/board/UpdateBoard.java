package practice.board;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateBoard {

	public void boardUpdate() {

		// db 연결
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;

		String sql, sql2;
		String checkWriter = "";
		String checkPasswd = "";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			// ---JDBC_Insert 추가된 내용-------
			// 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(" 글제목과 글내용 수정하기 .....");
			System.out.println("작성자를 입력 하세요?");
			checkWriter = br.readLine();
			System.out.println("비밀번호를 입력 하세요?");
			checkPasswd = br.readLine();

			sql = "Select * from board where (writer = ? and passwd = ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, checkWriter);
			pstmt.setString(2, checkPasswd);
			rs = pstmt.executeQuery();

			do {
				BoardDTO dto = new BoardDTO();
				dto.setNo(rs.getInt("no"));
				dto.setWriter(rs.getString("writer"));
				dto.setPasswd(rs.getString("passwd"));
				dto.setTs(rs.getTimestamp("reg_date"));

				System.out.print("변경할 제목을 입력하세요: ");
				dto.setSubject(br.readLine());
				System.out.print("변경할 내용을 입력하세요: ");
				dto.setContent(br.readLine());

				sql2 = "UPDATE board SET subject = ?, content = ?, reg_date=sysdate " + "where no = ?";
				pstmt2 = con.prepareStatement(sql2);
				pstmt2.setString(1, dto.getSubject());
				pstmt2.setString(2, dto.getContent());
				pstmt2.setInt(3, dto.getNo());

				int result = pstmt2.executeUpdate();
				if (result == 1) {
					System.out.println(" 데이터 수정 성공!! ");
				} else {
					System.out.println(" 데이터 수정 실패 ");
				}
			} while (rs.next());
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt2 != null)
					pstmt2.close();
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
