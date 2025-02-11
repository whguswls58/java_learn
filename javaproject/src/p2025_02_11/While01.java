package p2025_02_11;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반복문 (while)문
		// 조건식이 참인 경우 실행 while문 위에 초기값 선언, 증감식은 while문 마지막단
		// while(조건식){
		// 		반복 실행할 문장;
		// }
		
		
		// while 문을 이용해서 '뚱인데요' 메세지 10번 출력
		
		int i=1;								// 초기값
		while(i<=10) {							// 조건식
			System.out.println(i+"뚱인데요.");
			i++;								// 증감식
		}
		
		while(true) {
			System.out.println(i+"뚱인데요.");
			
			if(i == 100) {
				break;
			}
			i++;
		}
	}

}
