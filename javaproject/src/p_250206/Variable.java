package p_250206;

import java.util.ArrayList;
import java.util.List;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 : 메모리 상에 데이터를 저장하기 위한 기억 공간의 이름
		// 변수 만드는 법 : 자료형 변수명 = 데이터(값);
		
		// 기본 자료형 변수
		// 1. 정수형 변수
		byte b1 = 10;				// -128~127
//		byte b2 = 130;			// 오버플로우 발생(오류)
		short s = 100;				// -32768~ 32767
		int i = 1000;				// -21억~21억
		long l = 10000L;			// long형은 끝에 L을 붙임(없으면 int형으로 인식)
		
		System.out.println("b1= " + b1);
		System.out.println("s= " + s);
		System.out.println("i= " + i);
		System.out.println("l= " + l);
		
		// 2. 실수형 변수
		float ft1 = 3.14f;			// float형은 끝에 f, F를 붙임(없으면 double형으로 인식)
		float ft2 = 3.14F;			
		float ft3 = (float)3.14;	// double(8Byte)을 float(4Byte)형으로 강제 형변환
		double db1 = 42.195;
		
		System.out.println();
		System.out.println("ft1="+ ft1);
		System.out.println("ft2="+ ft2);
		System.out.println("db1="+ db1);
		System.out.printf("%.1f\n", db1);			//소수 첫째자리까지 반올림하여 출력 : 42.2 
		System.out.printf("%.2f\n", db1);			//소수 둘째자리까지 반올림하여 출력 : 42.20 
		
		// 3. 문자형 변수
		char c1 = 'A';				// char형은 문자 한글자만 저장 가능(2byte여도 한글자만 저장가능)
		char c2 = '안';
		
		System.out.println();
		System.out.println("c1= " + c1);
		System.out.println("c2= " + c2);
		
		// 4. 논리형 변수
		boolean bn1 = true;
		boolean bn2 = false;
		
		System.out.println();
		System.out.println("bn1:"+bn1);		
		System.out.println("bn2:"+bn2);		
		
		// 현재 변수의 자료형을 나타냄
		// 객체.getClass().getSimpleName() 이용
		// 문자열 String 의 경우 참조 타입 Class에 포함되므로, 객체로서 인정 받기에 바로 사용 가능하다.
		// 하지만, 기본 타입 자료형은 객체로서 인정 받지 못한다.
		// 그리하여 정수 타입 int를 Object로 먼저 변환하고, Wrapper Class로써 포장 객체화하여 사용해야 한다.
		String str = "123";
		System.out.println();
		System.out.println(str.getClass().getSimpleName());
		System.out.println(((Object)i).getClass().getSimpleName());
		System.out.println(((Object)ft3).getClass().getSimpleName());
		
		// 참조형 변수 : 클래스
		String s1 = "자바";
		String s2 = new String("자바");
		String s3 = "자바";
		
		System.out.println();
		
		// 메모리 주소를 보기 위해서는 System.identityHashCode([변수명]) 함수를 이용
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		if(s1 == s2) {			//주소 비교(위의 주소값을 비교한다)
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
			
		}
		
		if(s1.equals(s2)) {		//데이터(값) 비교
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		System.out.println();
		
		// 참조형 변수 : 배열 - 동일한 자료형의 데이터를 저장하는 정적 자료구조
		int[] score = {80, 90, 100};
		
		for(int j=0; j<score.length ; j++) {
			System.out.print(score[j]+"\t");	// '\t'는 수평간격
		}
		System.out.println("\n");
		
		// 참조형 변수 : 인터페이스(List, Map 등등등)
		// 1. 순차적인 자료구조
		// 2. 여러가지 자료형의 데이터를 모두 저장 가능
		// 3. 동적으로 공간 할당이 가능
		
//		List list = new List();			// 오류 발생
		List list = new ArrayList();
		list.add(30);
		list.add(3.14);
		list.add('j');
		list.add(true);
		list.add("자바");
		
		for( int k=0 ; k<list.size(); k++) {
			System.out.print(list.get(k) + "\t");
		}
		
		
		
	}

}
