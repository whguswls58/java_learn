package p_250207;

public class LongOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 서로 다른 자료형의 변수를 산술연산을 수행하면 가장 큰 자료형으로 자동 형변환
		
		byte value1 = 10;		//1byte
		int value2 = 100;		//4byte
		long value3 = 1000L;	//8byte
		double value4 = 3.14;	//8byte
		
		//결과를 받는 변수의 자료형은 연산을 수행하는 변수들 중 가장 큰 자료형으로 선언해야함
		double result = value1 + value2 + value3 + value4;		
		System.out.println(result);
		
	}

}
