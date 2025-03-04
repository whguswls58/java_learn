package p2025_03_04;

public class RunnableTest implements Runnable {

	// 1부터 20까지 화면에 출력시키는 메소드
	public void printNumber() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("number = " + i);
		}
	}
	
	// 추상메소드는 반드시 메소드 오버라이딩을 해야함
	@Override
	public void run() {		// 실행상태
		printNumber();
	}

	public static void main(String[] args) {
		// 객체 생성
		RunnableTest tt = new RunnableTest();
		// Thread 클래스 객체 생성
		Thread t = new Thread(tt);
		// Thread를 시작시킴
		t.start();				// 실행 가능한 상태(Runnable) : run() 메소드 호출
		System.out.println("--------> main thread end");
	}
}
