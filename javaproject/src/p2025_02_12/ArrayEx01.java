package p2025_02_12;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 : 동일한 자료형의 데이터를 저장하기 위한 정적인 자료구조(정적임 = 선언 이후 확장이 어려움)
		// 변수 -> 배열 -> 자료구조(list)
		
//		1차원 배열 선언 첫번째 형식 : 배열에 저장될 값이 정해져 있지 않은 경우 주로 사용
//		자료형 변수명 = 연산자 자료형[변수의 크기];		
		int[] score = new int[3];			// int 초기값 : 0
		
		System.out.println(score[0]);		// 초기값 0
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		score[0]=80;
		score[1]=90;
		score[2]=100;

		System.out.println(score[0]);		//
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		double[] d = new double[3];			// double 초기값 : 0.0
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		
		char[] c = new char[3];				// char 배열은 공백문자로 초기화
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		boolean[] b = new boolean[3];		// boolean 초기값 : false 자동 초기화
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);

		String[] str = new String[3];
		System.out.println(str[0]);			// 참조형 자료형의 초기값은 NULL
		System.out.println(str[1]);
		System.out.println(str[2]);
		
		str[0] = "자바";
		str[1] = "오라클";
		str[2] = "스프링";
		System.out.println(str[0]);				// 
		System.out.println(str[1]);
		System.out.println(str[2]);
		
//		1차원 배열 두번째 형식 : 배열 선언과 동시에 초기화를 할때 주로 사용
//						(배열에 할당될 값이 정해져 있는 경우 주로 사용)
		
		int[] s = {80, 90, 100};
		int[] s1 = new int[] {80, 90, 100};
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		System.out.println("배열의 크기:" + s.length);
		
		for(int i=0 ; i<s.length ; i++) {
			System.out.print(s[i] + "\t");
		}
		System.out.println();
		
		double[] dd = {3.14, 10.5, 42.195, 50};
		
		for(int i=0 ; i<dd.length ; i++) {
			System.out.print(dd[i] + "\t");
		}
		System.out.println();
		
		char[] cc = {'j', 'a', 'v', 'a', '자', '바'};
		
		for(int i=0 ; i<cc.length ; i++) {
			System.out.print(cc[i] + "\t");
		}
		System.out.println();
		

		boolean[] bb = {true, false, true};
		for(int i=0 ; i<bb.length ; i++) {
			System.out.print(bb[i] + "\t");
		}
		System.out.println();
		
		String[] str1 = {"자바", "오라클", "스프링", "파이썬", "텐서플로우"};
		String[] str2 = new String[] {"자바", "오라클", "스프링", "파이썬", "텐서플로우"};
		for(int i=0 ; i<str1.length ; i++) {
			System.out.print(str1[i] + "\t");
		}
		
	}

}
