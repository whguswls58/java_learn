package p2025_02_20;

public class SplitEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-");
		
		for(String name : names)
			System.out.println(name);
		
	}

}
