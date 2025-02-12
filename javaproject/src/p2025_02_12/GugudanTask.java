package p2025_02_12;

public class GugudanTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 구구단(2~9단)을 열방향(세로방향)으로 출력하는 프로그램 작성
					
		for(int i = 0; i<10 ; i++) {
			if (i == 0) {			//첫줄 단 출력
				for(int dan =2 ; dan<10 ; dan++) {
					System.out.print("[" + dan + "단]\t\t");
				}
				System.out.println();
			} else {				//구구단 출력
				for(int j = 2; j<10 ; j++) {
					System.out.print(j + " * " + i + " = " + j*i + "\t");
				}
				System.out.println();
			}
		}
		
		
	}

}
