package p2025_03_06;

import java.sql.*;
import java.io.*; // 도스 콘솔 창에서 사용자 입력을 받아들이기 위해 BufferedReader 

class JDBC_Insert {
	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;		// DB 접속을 위한 객체
		Statement stmt = null;		// SQL문을 실행을 위한 객체
		ResultSet rs = null;		
		String sql;

		String name, email, tel, no;

		try {
			Class.forName(driver);		// JDBC Driver Loading
			con = DriverManager.getConnection(url, "scott", "tiger");
			stmt = con.createStatement();	// Statement 객체 생성

			// ---JDBC_Insert 추가된 내용-------
			// 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println(" customer 테이블에 값 입력하기 .....");
			System.out.print(" 번호 입력: ");
			no = br.readLine();
			System.out.print(" 이름 입력: ");
			name = br.readLine(); // 테이블에 추가할 name 필드 값을 입력 받음
			System.out.print(" 이메일 입력: ");
			email = br.readLine(); // 테이블에 추가할 email 필드 값을 입력 받음
			System.out.print(" 전화번호 입력: ");
			tel = br.readLine(); // 테이블에 추가할 tel 필드 값을 입력 받음

			// INSERT 쿼리문을 작성
			// 문자 데이터(name, email, tel)는 좌우에 ' '를 붙여야 함.
			sql = "INSERT into customer(no, name, email, tel) values ";
			sql += "(" + no + ",'" + name + "','" + email + "','" + tel + "')";

			// Statement 객체의 executeUpdate(sql) 메서드를 이용해
			int res = stmt.executeUpdate(sql); 	// insert SQL문 실행
			if (res == 1) {
				System.out.println(" Data insert success!! ");
			} else {		// no 중복값 발생할 경우 기본키 제약조건 위배 - 오류 발생
				System.out.println(" Data insert failed ");
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
		} finally {
			try {
				if( rs != null )
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
