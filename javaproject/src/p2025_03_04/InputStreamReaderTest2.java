package p2025_03_04;

import java.io.*;

public class InputStreamReaderTest2 {
	public static void main(String[] args) {

		// byte Stream인 is 선언
		InputStream is = System.in;

		// InputStreamReader 객체 선언
		// 2Byte 데이터를 입력받을 수 있는 입력 스트림 객체 생성
		InputStreamReader isr = new InputStreamReader(is);

		int inputValue = 0;
		// 배열의 크기:10, char형 2byte
		char[] temp = new char[10];

		System.out.print("Input Value : ");

		try {
			// 키보드로부터 데이터를 입력
			inputValue = isr.read(temp);
		} catch (IOException io) {
		}

		System.out.println("InputValue : " + inputValue);

		// char[]의 값을 출력
		for (int i = 0; i < inputValue; i++) {
			System.out.print(temp[i]);
		}

		System.out.print(temp[4]);
		// char[]을 String type으로 변환
		System.out.println("char[] -> String : " + new String(temp));
	}
}
