package p2025_02_18;

class Car{
	
	int gas;					// 필드 : gas=0
	
	void setGas(int gas) {
		this.gas = gas;			// gas = 5
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas--;
			}else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return;						// void로 선언된 메소드에서 return문 사용 : 해당 메소드 실행 강제 종료
			}
		}
	}
}


public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
		
	}

}
