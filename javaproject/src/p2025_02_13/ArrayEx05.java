package p2025_02_13;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores;						// 배열의 주소값을 가지지않은 상태
		scores = new int[] {83, 90, 87};	// 주소값을 가짐
		
		int sum1 = 0;
		for(int i=0; i<scores.length ; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		int sum2 = add(new int[] {80, 90 ,87});
		System.out.println("총합: " + sum2);
		
		int sum3 = add(scores);
		System.out.println("총합: " + sum3);
	}
	
	// 입력받은 정수형 배열의 합을 구하여 리턴해주는 메소드
	static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<scores.length; i++) 
			sum+=scores[i];
		return sum;
	}

}
