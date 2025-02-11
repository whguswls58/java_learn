package p2025_02_11;

public class Continue02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue 문을 이용해서 1~100까지 정수중 짝수만 출력
		
		for(int i=1 ; i<=100 ; i++) {
			if(i%2==1) continue;
			System.out.println("짝수: " + i);
		}
		
	}

}
