package p2025_03_20;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

class CallableStatementTest02 {

	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql;
		CallableStatement cs = null;

		System.out.print("탈퇴할 회원명을 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");

			sql = "{call del_ename(?)}";

			// CallableStatement를 객체를 생성
			cs = con.prepareCall(sql);
			cs.setString(1, name);
			cs.execute();	// 프로시저 실행
			
			System.out.println("프로시저 실행 성공");

			cs.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
