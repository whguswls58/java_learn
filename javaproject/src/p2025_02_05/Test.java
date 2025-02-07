package p2025_02_05;

//java.lang 패키지 안에 들어있는 클래스는 import를 생략할 수 있다.(ex - String, System)

import java.util.*;
//import java.util.Date;

public class Test {
//접근제어자	사용자 정의 클래스(파일명과 클래스명은 반드시 일치되어야함)
//			관례상 클래스의 첫글자는 대문자로 작성	

//main() 메소드는 자바가상머신(JVM)이 가장 먼저 호출하는 메소드
//1개의 클래스가 독립적으로 실행이 되기 위해선 반드시 main 메소드가 필요
// 메인 메소드가 없을 경우 컴파일까지만 수행 가능
	public static void main(String[] args) {
	//접근제어자 			메인 메소드
		int i = 3;
		int n = 0;

		System.out.println("자바 출력 성공" + i + "?");

		// 자동완성 : Syso + Ctrl + space
		System.out.println("자바출력");

		// println() 자동 줄바꿈 print()메소드에는 자동 줄바꿈 기능 x
		System.out.print("자바");
		System.out.print("오라클");
		System.out.print("자바");
		System.out.print("오라클\n");

		Date date = new Date();
		System.out.println(date);
		
		Random r = new Random(); 
		
		for (i = 0; i < 10; i++) {
			n = n + i;
			System.out.print(i+1 + "번째: " + n + " ");
			System.out.println(i+1 +"번째 난수 출력 : " + r.nextInt(10));	//0~9 사이 난수 발생
		}

	}

}
