package p2025_03_04;

import java.io.*;

public class InputStreamReaderTest {
	public static void main(String[] args) {

		// byte Stream인 is 선언
		InputStream is = System.in;

		// InputStreamReader 객체 선언
		// 2Byte 입력 스트림 생성
		InputStreamReader isr = new InputStreamReader(is);
//							InputStreamReader(System.in);
		int inputValue = 0;
		System.out.print("Input Value : ");
		try {
			// 키보드로 부터 데이터를 입력
			// 2바이트씩 읽어들이기 때문에 한글은 1자 밖에 입력이 안됨.
			inputValue = isr.read();		// 키보드로 입력한 문자(2Byte)는 유니코드로 변환
			isr.close();
		} catch (IOException io) {
			System.out.print(io.getMessage());
		}
		// 입력받은 데이타를 출력
		System.out.println("Input Result : " + inputValue);
		System.out.println("Input Result : " + (char) inputValue);
	}
}
