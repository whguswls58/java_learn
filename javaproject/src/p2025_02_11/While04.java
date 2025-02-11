package p2025_02_11;

public class While04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while문을 이용해서 구구단(2~9단) 작성
		
		int dan = 2;
		
		while(dan<10) {
			int i = 1;
			
			System.out.println("[" + dan + "단]");
			while(i<10){
				System.out.println(dan + " * " + i + " = " + dan*i);
				i++;
			}
			System.out.println();
			dan++;
			
		}
		
	}

}
