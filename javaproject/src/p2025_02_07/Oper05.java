package p2025_02_07;

import java.util.Scanner;

public class Oper05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 조건 연산자(삼항 연산자)
		// 변수 = (조건식) ? 값1 : 값2;
		// 조건식이 참이면 값1을 거짓이면 값2를 변수에 할당
		
		// 키보드로 입력한 정수 2개 중에서 최대값과 최소값을 출력하는 프로그램을 작성하세요?
		
		int n1, n2, max, min;
		System.out.println("정수 2개를 입력하세요?");
		
		// 키보드로 값을 입력받기
		Scanner sc = new Scanner(System.in);
		
		//Scanner 메서드
//		close() 	void	- Scanner의 사용 종료 
//		next() 		String 	- 다음 토큰을 String 타입으로 반환 ( 띄어쓰기 뒷 부분은 읽지 않는다.)
//		nextLine() 	String 	- 한 줄("\n (Enter)"를 치기 전까지)을 읽고, "\n (Enter)"값이 제외된 부분만을 출력한다.(Ex: "My name is H"를 입력하고 엔터를 누르면 엔터를 누르기전까지인 "My name is H"가 출력")
//		nextByte() 	Byte	- 다음 토큰을 byte 타입으로 반환
//		nextShort()	Short	- 다음 토큰을 short 타입으로 반환
//		nextInt() 	Int		- 다음 토큰을 int 타입으로 반환
//		nextLong()	Long	- 다음 토큰을 long 타입으로 반환
//		nextFloat() Float	- 다음 토큰을 float 타입으로 반환
//		nextDouble() Double - 다음 토큰을 double 타입으로 반환
//		hasNext() Boolean	- 현재 입력된 토큰이 있으면 true, 아니면 새로운 입력이 들어올 때까지 무한정 기다려서, 새로운 입력이 들어오면 그 때 true 반환. ctrl + z 키가 입력되면 입력 끝이므로 false 반환
//		hasNextLine() Boolean - 다음에 읽을 값(Line 줄)이 있는지 확인.
		
		n1 = sc.nextInt();						// 스페이스바 or 엔터키로 구분
		n2 = sc.nextInt();
		
		max = (n1 > n2) ? n1 : n2;				//최대값
		min = (n1 < n2) ? n1 : n2;				//최소값
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		
		
	}

}
