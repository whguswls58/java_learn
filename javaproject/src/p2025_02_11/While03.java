package p2025_02_11;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 키보드로 입력한 구구단 1개단을 while문으로 출력
		
		int dan;
		System.out.println("정수를 입력하세요: ");
		
		Scanner sc = new Scanner(System.in);
		dan = sc.nextInt();
		
		System.out.println("[" + dan + "단]");
		
		int i = 1;
		while(i < 10) {
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}
				
		
	}

}
