package p2025_02_11;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 프로그램을 종료를 하려고 하여도 최소 1번은 메세지 입력을 수행해야함
		// -> 이런 경우 do ~ while 문 활용
		
		System.out.println("메세지를 입력하세요:");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String input;										// 입력값을 저장할 변수 선언
		
		do {
			System.out.print("> ");
			input = sc.nextLine();							// 문자열 저장
			System.out.println("입력문자: " + input);
		} while(!input.equals("q") || !input.equals("Q"));	// True : 입력한 값 != q   False = q
		
		System.out.println("프로그램 종료");
		sc.close();
		
	}

}
