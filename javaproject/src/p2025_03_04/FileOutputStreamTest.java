package p2025_03_04;

import java.io.*;

public class FileOutputStreamTest {
	public static void main(String[] args) {

		try {
			
			// "read.txt" File에서 데이터를 읽어오는 FileInputStream 객체 생성
			FileInputStream fis = new FileInputStream("read.txt");

			// "read1.txt" File로 데이터를 전송하기 위한 FileOutputStream 객체 생성
			FileOutputStream fos = new FileOutputStream("read1.txt");

			int input = 0;

			// File에 저장된 모든 데이터를 스트림을 통해
			// 읽어 들여 File에 저장
			// 파일의 내용을 끝까지 다 읽으면 -1이 반환됨.
			while ((input = fis.read()) != -1) {
				System.out.print((char) input); // 화면에 출력 부분
				fos.write(input); // 다른 파일에 쓰는 부분
			}

			// FileInputStream, FileOutputStream을 해제
			// 파일로 저장할때는 반드시 close() 메소드로 닫아야함
			// 저장이 되지않는 경우가 발생할 수 있음
			fos.close();
			fis.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}// main() end
}
