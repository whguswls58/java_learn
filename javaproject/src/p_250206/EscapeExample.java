package p_250206;

public class EscapeExample {

	public static void main(String[] args) {
		
		// JAVA print, printf, println 차이점
		// print : 괄호안 내용을 단순히 출력. 개행문자(=줄바꿈문자=\n) 포함안됨.
		// printf : C에서의 printf와 동일. %d, %s 등을 쓰기위해 사용. 개행문자 포함X
		// println : 괄호안 내용을 출력한 후 마지막에 개행문자가 포함되어 있어 출력후 한 줄 띄워짐.
		
		
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력 \n");
		System.out.print("행 단위 출력 \n");
		System.out.println("우리는 \" 개발자 \" 입니다");
		System.out.print("봄\\여름\\가을\\겨울");
		
		
		
	}

}
