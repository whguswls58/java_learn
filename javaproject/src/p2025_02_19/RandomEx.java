package p2025_02_19;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//java.lang 패키지는 import 생략가능
		String str = new String("자바");
		
		// import 하지 않고 Date 객체 생성
		java.util.Date d1 = new java.util.Date();
		Date d = new Date();
		
		Scanner sc = new Scanner(System.in);
		
		// 난수 발생 : 1. Math.random()
		//			2. Random 클래스

		Random r = new Random();
		
		System.out.println(r.nextInt(10));		// 난수 범위 0~9
		
		// 주사위 번호 : 1 ~ 6
		int num = r.nextInt(6)+1;				// 난수 범위 1~6
		System.out.println("주사위 번호: " + num);
		
		// 로또 번호 : 1 ~ 45
		int lotto = r. nextInt(45)+1;
		System.out.println("로또 번호: " + lotto);
		
	}

}
