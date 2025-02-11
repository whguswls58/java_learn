package p2025_02_11;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue 문
		// 1. 다시 반복문으로 돌아가라는 의미
		// 2. continue 문이 실행되면, continue 문 아래의 내용들은 실행x, 반복수행
		// 3. continue 문은 반복문 안에서만 사용가능
		
		for(int i=1; i<=10 ; i++) {
			if(i==5) continue;
			System.out.println("출력: " + i);
		}
		
		
	}

}
