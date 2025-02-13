package p2025_02_13;

public class ArrayEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Run -> Run Configuration -> Arguments 탭에서 매개값 입력
		// args[0] = "-10", args[1] = "-20"
		System.out.println("args[0]: " + args[0]);
		System.out.println("args[1]: " + args[1]);
		
		// Wrapper 클래스를 이용한 자료형의 형변환 : int - Integer
		// 문자를 숫자로 형변환 : "-10" ---> -10
		int num = Integer.parseInt(args[0]);
		int num1 = Integer.parseInt(args[1]);
		System.out.println("절대값: " + abs(num));		// abs() 메소드 호출
		System.out.println("절대값: " + abs(num1));		// abs() 메소드 호출
	}
	
	// 절대값을 구해주는 메소드
	static int abs(int data) {
		return data<0 ? -data : data;
	}

}
