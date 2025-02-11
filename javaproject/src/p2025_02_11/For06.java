package p2025_02_11;

public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 구구단 (2~9단) 출력하는 프로그램 작성
		
		for(int i=2 ; i<10 ; i++) {									// 단(기준)
			System.out.println("[" + i + "단]");						// 단 title
			for(int j=1 ; j<10 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();									// 각 단의 줄간격
		}
	}
}
