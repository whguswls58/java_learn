package p2025_03_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

class JDBC_Select02 {
	public static void main(String[] args) {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";
		Connection con = null;
		PreparedStatement pstmt = null;
		// ---JDBC_Select 추가된 내용 -------
		ResultSet rs = null;
		int no = 0;
		String name = "", email = "", tel = "", address = "", ts = ""; // 데이터베이스에서 얻어온 필드값 저장할 변수 선언
		String sql; // SQL문을 저장할 변수 선언

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");

			// ---JDBC_Select 추가된 내용 -------
			// 1. 최근에 가입한 고객순 정렬(내림차순)
			sql = "SELECT * FROM customer ORDER BY no desc";	
			
			// 2. 최근에 가입한 고객 3명만 검색
			// limit 추출할 인덱스번호(시작 번호), 추출할 데이터 갯수
//			sql = "SELECT * FROM customer ORDER BY no desc limit 0, 3";	
			
			System.out.printf("번호 \t 이름 \t\t 이메일 \t\t 전화번호 \t\t 주소\t\t 날짜\n");
			System.out.printf("------------------------------------------------------------------------------\n");
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // 얻어진 레코드를 가져옴

			// 회원들의 가입 날짜를 연, 월, 일, 시:분:초 형식으로 출력
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			while (rs.next()) {
				no = rs.getInt("no");
				name = rs.getString("name");
				email = rs.getString("email");
				tel = rs.getString("tel");
				address = rs.getString("address");
				ts = sd.format(rs.getTimestamp("reg_date")).toString();
				System.out.printf(" %d \t %s \t %s \t %s\t %s\t %s\t  \n", no, name, email, tel, address, ts);
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
