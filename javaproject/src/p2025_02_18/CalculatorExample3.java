package p2025_02_18;

class Calculator3{
	
	// 정사각형 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}

public class CalculatorExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator3 myCalc = new Calculator3();
		
		double result1 = myCalc.areaRectangle(10);
		double result2 = myCalc.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이: " + result1);
		System.out.println("직사각형 넓이: " + result2);
				
	}

}
