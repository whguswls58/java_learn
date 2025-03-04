package p2025_03_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 키보드로 구구단 1개 단을 입력받아서, 구구단 1개 단을 출력
		// 단, 구구단을 입력받을때는 BufferedReader 클래스 이용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("원하는 단을 입력하세요 : ");
			int num = Integer.parseInt(br.readLine());
			
			System.out.println("[" + num + "단]");
			for(int i=1 ; i<10 ; i++) {
				System.out.println(num + " * " + i + " = " + (num*i));
			}
		}catch(IOException io){
			System.out.print(io.getMessage());
		}catch(Exception e) {
			System.out.println("숫자를 입력하세요2.");
			System.out.print(e.getMessage());
		}
		
		
	}



}
