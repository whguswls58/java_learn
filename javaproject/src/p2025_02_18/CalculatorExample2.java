package p2025_02_18;

// 클래스 내부에서 메소드 호출 : 메소드 안에서 다른 메소드 호출
class Calculator2{
	
	int plus(int x, int y) {
		return x+y;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		println("실행결과: " + result);
	}
	void println(String message) {
		System.out.println(message);
	}
}


public class CalculatorExample2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator2 myCalc = new Calculator2();
		myCalc.execute();
	}

}
