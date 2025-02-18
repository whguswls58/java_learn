package p2025_02_18;

class Calculator{
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		return x+y;
	}
	
	int mynus(int x, int y) {
		return x-y;
	}
	
	int multiple(int x, int y) {
		return x*y;
	}
	
	double divide(int x, int y) {
		return (double)x/y;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}


public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
	}

}
