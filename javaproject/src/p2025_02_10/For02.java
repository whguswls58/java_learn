package p2025_02_10;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1~10까지 합을 구하는 프로그램 작성
		
		int sum = 0 ;						// 지역변수(local variable)
		for(int i=1 ; i<=10 ; i++) {		
			sum += i;
		}
		
//		System.out.println(i);				// 오류 발생
		System.out.println("sum= " + sum);
		
	}

}
