package p2025_03_04;

import java.io.*;

public class FileInputStreamTest {
	public static void main(String[] args) {

		// 입력을 받아들이는 변수 선언
		int inputValue = 0;

		// FileInputStream 객체 선언
		FileInputStream file = null;

		try {
			// "read.txt"와 InputStream 형성
			// 파일이 없을 경우 FileNotFoundException 예외 발생
			// 파일 위치는 javaproject(현재 프로젝트 디렉토리)에 있어야 파일을 읽어올 수 있음
			file = new FileInputStream("read.txt");

			// file의 끝을 만날 때까지 데이터를 읽어 들임
			// read() 메소드는 File에서 한 byte씩(한글자씩) 데이터를 읽어옴.
			// 읽어온 데이터를 int로 변환해서 리턴,파일의 끝을 만나면 -1을 반환함.
			while ((inputValue = file.read()) != -1) {
				System.out.print((char) inputValue);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// stream을 형성한 file을 닫음
		try {
			file.close();
		} catch (IOException io) {
			System.out.println(io.toString());
		}
	}// main() end
}
