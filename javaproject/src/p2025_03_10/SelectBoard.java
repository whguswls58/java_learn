package p2025_03_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class SelectBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs01 = null;
		ResultSet rs02 = null;
		int count = 0;				// 총데이터 갯수
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			
			String sql = "select count(*) as 총데이터 from board";		// 총데이터 갯수
			pstmt = con.prepareStatement(sql);
			rs01 = pstmt.executeQuery();
			
			if(rs01.next()) 
				count = rs01.getInt("총데이터");
			
			System.out.println("총 데이터 갯수 : " + count);
			System.out.println("-------------------------------------------------------");
			
			// 데이터 목록(order by 컬럼명 asc: 오름차순, desc: 내림차순)
			// 슬라이싱 - limit : 추출할 인덱스 시작번호, 추출할 데이터 개수
			sql = "select * from board order by no desc limit 0,3";		
			pstmt = con.prepareStatement(sql);
			rs02 = pstmt.executeQuery();
			
			SimpleDateFormat sd = new SimpleDateFormat("yyyy년MM월dd일 HH:mm:ss EEE요일");
			
			System.out.println("번호\t작성자\t비밀번호\t제목\t\t내용\t\t날짜");
			System.out.println("-------------------------------------------------------");
			while(rs02.next()) {
				int no = rs02.getInt("no");
				String writer = rs02.getString("writer");
				String passwd = rs02.getString("passwd");
				String subject = rs02.getString("subject");
				String content = rs02.getString("content");
				Timestamp ts = rs02.getTimestamp("reg_date");
				
				System.out.println(no + "\t" + writer + "\t" +  passwd + "\t" + 
								   subject + "\t" + content + "\t\t" + sd.format(ts));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs02 != null) 
					rs02.close();
				if(rs01 != null) 
					rs01.close();
				if(pstmt != null) 
					pstmt.close();
				if(con != null) 
					con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
