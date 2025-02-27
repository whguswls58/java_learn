package p2025_02_27;

import java.util.*;

class LinkedListTest {
	public static void main(String[] args) {

		//큐(Queue) : FIFO(First in First out)구조
		
		LinkedList myQue = new LinkedList();
		myQue.offer("1-자바");
		myQue.offer("2-C++");
		myQue.offer("3-API");
		myQue.offer("4-MFC");

		while (myQue.peek() != null) 			// peek() : 데이터가 있는지 없는지 판별
			System.out.println(myQue.poll()); 	// 큐에서 데이터를 꺼내온다.
		
//		System.out.println(myQue.poll());
//		System.out.println(myQue.poll());
//		System.out.println(myQue.poll());
//		System.out.println(myQue.poll());
//		System.out.println(myQue.poll());		// 큐가 비어있으면 null값 리턴함
		
	}
}