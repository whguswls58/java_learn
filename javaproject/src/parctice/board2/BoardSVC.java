package parctice.board2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BoardSVC {

	
	// 데이터 입력
	public void insert() {
		
		BoardDTO2 dto = new BoardDTO2();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(" 게시판 글 작성하기 .....");
	
			System.out.print(" 작성자 입력: ");
			dto.setWriter(br.readLine().trim());
			System.out.print(" 비밀번호 입력: ");
			dto.setPasswd(br.readLine().trim()); 
			System.out.print(" 제목 입력: ");
			dto.setSubject(br.readLine().trim()); 
			System.out.print(" 내용 입력: ");
			dto.setContent(br.readLine().trim());
			
			BoardDAO2 dao = new BoardDAO2();
			dao.boardInsert(dto);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
	
	
	
}
