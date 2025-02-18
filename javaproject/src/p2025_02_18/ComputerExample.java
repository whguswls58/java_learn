package p2025_02_18;

// 매개변수의 갯수를 모르는 경우
class Computer{
	
	// 주소값 전달에 의한 메소드 호출방식(Call by Reference)
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++)
			sum+=values[i];
		return sum;
	}
	
	// ... : 전달된 값을 배열로 받는다
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++)
			sum+=values[i];
		return sum;
	}
}


public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2: " + result2);
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4: " + result4);
		
	}

}
