package p2025_02_12;

import java.util.Scanner;

public class FatorialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, f=1;
		System.out.print("정수를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		// f의 자료형이 int형이기 때문에 17!부터는 오버플로우가 발생한다
		
		for(int i=n; i>=1; i--){	// 3 * 2 * 1
			f = f * i;      // f *= i;
			
			if(i > 1) {
				System.out.print(i + " * " );
			}
			else {
				System.out.println(i + " = " + f);
			}
			
		}
		System.out.println(n+"!="+f);	
	}

}
