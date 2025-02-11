package p2025_02_11;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break 문
		// 1. switch case 문을 빠져 나가는 경우 사용
		// 2. 반복문을 빠져나가는 경우 사용
		
		// 무한루프 : for 문
		// break : 반복문을 빠져나오는 역할
		
		for(int i=1 ; ; i++) {
			System.out.println(i + "무한출력");
			if(i==100) break;
		}
		
		
	}

}
