package practice.board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			while (true) {
				int check;
				System.out.println("게시판 작성");
				System.out.println("글작성 : 1");
				System.out.println("글목록 : 2");
				System.out.println("글수정 : 3");
				System.out.println("글삭제 : 4");
				System.out.println("프로그램 종료 : 5");

				System.out.print("값을 입력하세요: ");
				check = Integer.parseInt(br.readLine());

				switch (check) {
				case 1:
					InsertBoard ib = new InsertBoard();
					ib.boardInsert();
					break;
				case 2:
					SelectBoard sb = new SelectBoard();
					sb.boardSelect();
					break;
				case 3:
					UpdateBoard ub = new UpdateBoard();
					ub.boardUpdate();
					break;
				case 4:
					DeleteBoard db = new DeleteBoard();
					db.boardDelete();
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("값을 잘못 입력하셨습니다.");

				}

			}
		} catch (Exception e) {

		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
