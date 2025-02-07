package p_250207;

public class Oper03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);				// true
		boolean result2 = (num1 != num2);				// false
		boolean result3 = (num1 <= num2);				// true
		
		System.out.println("result1: " + result1);		
		System.out.println("result2: " + result2);		
		System.out.println("result3: " + result3);
		
		System.out.println(num1 < num2);				// false
		
		char c1 = 'A';		//65
		char c2 = 'B';		//66
		
		boolean result4 = (c1 < c2);					// true
		System.out.println("result4" + result4);
		
	}

}
