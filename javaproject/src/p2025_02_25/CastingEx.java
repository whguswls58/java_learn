package p2025_02_25;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 레퍼런스 형변환
		// 2개의 클래스 사이에 상속관계가 있어야 가능
		
		//	업캐스팅(자동 형변환)
		//	1. 자식클래스에서 부모클래스로 형변환 하는 것이다.
		//	2. 참조 가능한 영역이 축소가 된다.
		//	3. 컴파일러에 의해서 자동 형변환이 된다.
		
// ex1.
		// Calendar 클래스는 추상 클래스이기 때문에 자체적으로 객체 생성 불가능
//		Calendar c = new Calendar();	
		Calendar c1 = Calendar.getInstance();	// Calendar 클래스의 정적 메소드 이용해서 객체 생성
		
		Calendar c2 = new GregorianCalendar();	// 업캐스팅(Calendar - 부모, GregorianCalendar - 자식)
		
//	ex2.
		// List 인터페이스는 자체 객체 생성이 불가능
//		List li = new List();				// 에러 발생
		List list = new ArrayList();		// 업캐스팅 (List - 부모, ArrayList - 자식)
		ArrayList al = new ArrayList();		// list와 al의 참조가능한 메소드가 다름
		
//	ex3. 
		// add(Object e) - 메소드의 매개변수가 최상위인 Object 인 경우 자식 객체를 넣는식의 업캐스팅
		
		list.add(10);		// Object e = new Integer(10);		: 박싱 + 업캐스팅
		list.add(3.14);		// Object e = new Double(3.14);
		list.add('j');		// Object e = new Character('j');
		list.add(true);		// Object e = new Boolean(true);
		list.add("자바");		// Object e = new String("자바");
		
//	 ex4.
		// boolean equals(Object an)	
		
//		Object an = new String("자바");
		if("java".equals(new String("java"))) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
//		Object an = new Integer(30);		// 박싱 + 업캐스팅
//		Object an = 30;						// 자동박싱 + 업캐스팅
		if(new Integer(30).equals(new Integer(30))) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
//		Object an = new Double(3.14);		// 박싱 + 업캐스팅
//		Object an = 3.14;					// 자동박싱 + 업캐스팅
		if(new Double(3.14).equals(new Double(3.14))) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
//==================================================================//
		
		//	▪ 다운 캐스팅(강제 형변환)
		//	1. 부모클래스에서 자식클래스로 형변환 하는 것이다.
		//	2. 참조 가능한 영역이 확대가 된다.
		//	3. 컴파일러에 의해서 자동 형변환이 되지 않기 때문에 프로그래머가 직접 강제 형변환을
		//	   해야 하며, 강제 형변환시 자료형을 생략할 수 없다.
		
//	ex1.
		List lt = new ArrayList();		// 업캐스팅
		
		lt.add(new String("자바"));		// 업캐스팅
		lt.add("오라클");
		lt.add("JSP");
		lt.add("Spring");
		lt.add("파이썬");
		lt.add("텐서플로우");
		
//		Object get(int index);  ->  Object 자료형으로 값 리턴
		Object obj = lt.get(0);
//		String s = lt.get(0);				// 오류 발생
		
		String s = (String)lt.get(0);		// 다운 캐스팅(강제 형변환) : 왼쪽의 자료형과 같은 자료형으로 형변환 시켜줘야함
		
		for(int i=0 ; i<lt.size(); i++) {
//			Object ob = lt.get(i);
			
			String str = (String) lt.get(i);			
			System.out.println(str);
		}
		
//	ex2.
		List ls = new ArrayList();
		
		ls.add(10);							// 오토박싱 + 업캐스팅
		ls.add(200);
		ls.add(3000);
		ls.add(40000);
		ls.add(500000);
		
		for(int i=0 ; i<ls.size(); i++) {
			
//			Integer it = (Integer) ls.get(i);	// 다운캐스팅
//			int n = it.intValue();				// 언박싱
			
			int it = (Integer) ls.get(i);		// 자동 언박싱 + 다운캐스팅
			
			System.out.printf("%d\n",it);
		}
		
		
	}

}
