package p2025_02_28;

// try ~ catch ~ finally 형식
// 1. finally 안에 들어있는 내용은 예외가 발생하든, 발생하지않든 무조건 실행
// 2. finally 안에 ㄴ용은 주로 파일을 닫거나, 데이터베이스 연결을 끊는 내용이 주로 사용


public class MultiExceptionHandling1 {
	public static void main(String[] args) {

		int value = 20;
		int div = 10;

		int[] intArray = { 1, 2, 3 };

		try {
			// 두수의 나눗셈을 구함
			int result = value / div;			// 예외 발생
			System.out.println(result);

			// 배열의 특정 값을 저장
			int arrayValue = intArray[4];		// 예외 발생
			System.out.println(arrayValue);

		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());

		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();

		} finally {
			// 주로 파일을 닫을 때나 데이터베이스 연결을 끊을때 사용됨
			// 예외가 발생하든 하지않든 반드시 실행
			System.out.println("예외가 발생했음!");

		}
	}
}
