package p2025_02_10;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반목문 : for문
		// 조건식이 참인 경우에 실행
		//
		// for( 초기값 ; 조건식 ; 증감식 ) {
		//		반복실행할 문장;
		// }
		
		// 사랑해요 메세지를 10번 출력
		
		for(int i=0 ; i<10 ; i++) {						// ++i, i=i+1, i+=1
			System.out.println("사랑해요" + (i+1));
		}												//실행될 문장이 한줄일 경우 중괄호{} 생략 가능
		System.out.println("종료");
		
	}

}
