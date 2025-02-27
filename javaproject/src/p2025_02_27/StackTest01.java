package p2025_02_27;

import java.util.*;

public class StackTest01 {
	public static void main(String[] args) {
		
//		Stack : LIFO(Last in First out)
		
		Stack myStack = new Stack();
		
		myStack.push("1-자바");
		myStack.push("2-C++");
		myStack.push("3-API");
		myStack.push("4-MFC");

//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());		
		// stack이 비어있으면 EnptyStackException 발생
		
		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
	}
}
