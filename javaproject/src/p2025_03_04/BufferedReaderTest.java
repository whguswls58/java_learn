package p2025_03_04;

import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 */
		System.out.print("Input Data : ");

		try {// 입력한 한줄을 모두읽음.
			String inputString = br.readLine();		// 입력받는 형식, 반드시 예외처리를 시행해야함
			System.out.println();
			System.out.println("Output String = " + inputString);
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}// main() end
}
