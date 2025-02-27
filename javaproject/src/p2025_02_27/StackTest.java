package p2025_02_27;

import java.util.*;

public class StackTest {
	public static void main(String[] args) {
		
//		Stack : LIFO(Last in First out)
		
		// Stack 객체 생성
		Stack s = new Stack();
		System.out.println(s.empty());		// empty() : stack이 비어있으면 true / item이 있으면 false

		// Stack에 값을 넣음
		//push(Object e)
		s.push("gemini");
		Date d = new Date();
		s.push(d);
		s.push(new Integer(10));
		s.push("johnharu");

		// Stack의 값을 출력
		System.out.println(s.empty());
		System.out.println(s.peek());		// peek(): 가장 마지막에 입력된 값 구해옴(stack에서 사라지진 않음)
		System.out.println(s.pop());		// pop() : 가장 마지막에 입력한 값을 추출(stack에서 삭제)
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.empty());
	}
}
