package p2025_02_11;

public class Continue03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue 문을 이용해서 1~100까지 정수 중에서 5의 배수만 출력
		
		for(int i=1 ; i<=100 ; i++) {
			if(i%5 != 0) continue;
			
			System.out.println("5의 배수: " + i);
		}
		
	}

}
