package p_250207;

public class Oper11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 10;
		
		System.out.println("a= " + a++);		// 후행연산
		System.out.println("a= " + a);
		
		System.out.println("b= " + (++b));		// 선행연산
		System.out.println("b= " + b);
		
	}

}
