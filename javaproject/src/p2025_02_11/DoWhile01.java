package p2025_02_11;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 조건식이 뒤에 오기때문에 조건식이 거짓이더라도 최소 1번은 실행됨
		
		// do{
		// 		반복 실행할 문장
		// }while(조건식);
		
		// do~while 문으로 '뚱인데요' 10회 출력
		
		int i=1;					// 초기값
		
		do {
			System.out.println(i+"뚱인데요");
			i++;					// 증감식
		}while(i<=10);				// 조건식
		
		
	}

}
