package p2025_02_11;

public class Break02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 무한루프 : while문		보통 무한루프는 while문으로 대부분 사용
		// break : 반복문 탈출
		
		int i=1;
		while(true) {
			System.out.println(i+"무한출력");
			if(i==100) break;
			i++;
		}
		
	}

}
