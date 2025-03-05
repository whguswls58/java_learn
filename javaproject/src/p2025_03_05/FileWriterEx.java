package p2025_03_05;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// 키보드로 입력한 문장을 파일(result.txt)로 저장하는 프로그램 작성

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 키보드로 문장 입력 (BufferedReader)
		// 입력 버퍼 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			while(true) {
			
				System.out.println("문장 입력: 1");
				System.out.println("프로그램 종료: 2");
				
				System.out.print("실행할 번호를 입력하세요: ");
				int n = Integer.parseInt(br.readLine());
				switch(n) {
					case 1:
						// 키보드로 값 입력
						System.out.print("문장을 입력하세요: ");
						String s = br.readLine() + "\n";
						
						// 2. 파일에 저장(FileWriter)
						// 두번째 인자값 default(false) - 덮어쓰기, true - 이어쓰기
						FileWriter fw = new FileWriter("result.txt", true);
						
						fw.write(s);
						System.out.println("문장 저장 완료.");
						
						fw.close();		// close로 반드시 닫아줘야 함.
						break;
					case 2:
						System.out.println("프로그램을 종료합니다.");
						return;
					default:
						System.out.println("잘못된 값을 입력하셨습니다.");
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
