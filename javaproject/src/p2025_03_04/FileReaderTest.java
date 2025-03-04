package p2025_03_04;

import java.io.*;

public class FileReaderTest {
	public static void main(String[] args) {

		// FileReader 객체 선언
		FileReader file = null;
		int inputValue = 0;

		try {
			// "data.txt" File과 stream 형성
			// 2 byte짜리 입력 스트림 생성(한글도 입력가능)
			file = new FileReader("data.txt");

			// file의 끝을 만날 때까지 데이터를 읽어 들임
			// 한글자씩 파일을 유니코드로 읽음
			while ((inputValue = file.read()) != -1) {
				// 유니코드를 char 형으로 강제 형변환하여 원본 글자 출력
				System.out.print((char) inputValue);
			}

			// stream을 닫음
			file.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}// main() end
}
