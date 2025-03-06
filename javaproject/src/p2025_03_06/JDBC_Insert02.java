package p2025_03_06;

import java.io.BufferedReader; // 도스 콘솔 창에서 사용자 입력을 받아들이기 위해 BufferedReader 
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

class JDBC_Insert02 {
	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;
		PreparedStatement pstmt = null;

		// ResultSet rs = null;
		String sql;

		String name, email, tel, no, address;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			// ---JDBC_Insert 추가된 내용-------
			// 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println(" customer 테이블에 값 입력하기 .....");
//			System.out.print(" 번호 입력: ");
//			no = br.readLine().trim();
			System.out.print(" 이름 입력: ");
			name = br.readLine().trim(); // 테이블에 추가할 name 필드 값을 입력 받음
			System.out.print(" 이메일 입력: ");
			email = br.readLine().trim(); // 테이블에 추가할 email 필드 값을 입력 받음
			System.out.print(" 전화번호 입력: ");
			tel = br.readLine().trim(); // 테이블에 추가할 tel 필드 값을 입력 받음
			System.out.print(" 주소를 입력: ");
			address = br.readLine().trim();
//			int ino = Integer.parseInt(no);

//			Timestamp ts = new Timestamp(System.currentTimeMillis());

			// INSERT 쿼리문을 작성
			// no 값은 시퀀스를 활용하여 자동으로 1씩 증가하며 자동으로 생성
			// sysdate 함수 - 시스템의 날짜, 시간을 구해주는 오라클 함수
			sql = "INSERT into customer (no, name, email, tel, address, reg_date) "
					+ "values (customer_no_seq.nextval, ?, ?, ?,?,sysdate)";

			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, ino);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, tel);
			pstmt.setString(4, address);
//			pstmt.setTimestamp(5, ts);
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
//			if( rs != null )   rs.close();        
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
