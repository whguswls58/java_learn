package p2025_02_28;

public class ThrowsEx1 {

	// setData()에서 예외가 발생하면, 메소드를 호출한 main()메소드로 예외 양도
	public void setData(String n) throws NumberFormatException {
		if (n.length() >= 1) {						// String n = "5"
			String str = n.substring(0, 1);			// String str = "5"
			printData(str);
		}
	}

	//printDate() 에서 예외가 발생하면, 메소드를 호출한 setData() 메소드로 예외 양도
	private void printData(String n) throws NumberFormatException {
		int dan = Integer.parseInt(n);			// String n = "5"
		System.out.println(dan + "단");
		System.out.println("-----------");
		for (int i = 1; i < 10; i++)
			System.out.println(dan + "*" + i + "=" + (dan * i));
	}

	public static void main(String[] args) {
		ThrowsEx1 t1 = new ThrowsEx1();
									// args[0] = "a"	예외발생
									// args[0] = "5"	예외발생 X
		

		try {
			t1.setData(args[0]);
		} catch (Exception e) {
			System.out.println("첫문자가 숫자가 아닙니다.");
		}
	}// main() end

}
