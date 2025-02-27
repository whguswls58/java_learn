package p2025_02_27;

/*  예외처리
 * 1. try ~ catch 구문으로 예외처리
 * 		
 * 		try{
 * 			예외가 발생할 가능성이 있는 문장;
 * 		}catch(예외 클래스명 매개변수){
 * 			예외 메세지;
 * 		}
 * 2. 예외가 발생하지 않으면 try 구문 안의 내용만 실행
 * 3. 예외가 발생하면 예외가 발생한 지점부터 catch 구문에서 예외를 받아서 처리
 */

public class DivideZeroExceptionHandling {
	public static void main(String[] args) {

		// int type의 변수 선언
		int b = 20;
		int a = 0;
		int c = 0;

		// 두 수의 나눗셈 결과를 구한다

		try {
			c = b / a;
			int total = a + b;
			int sub = b - a;

		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
			a = 2;
			c = b / a;
		}
		System.out.println(c);
	}
}
