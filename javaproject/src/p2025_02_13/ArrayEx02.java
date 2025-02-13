package p2025_02_13;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score = {83, 90, 87};
		for(int i=0 ; i<score.length ; i++)
			System.out.println("score[" + i + "] : " + score[i] );
		
		int sum = 0;
		for(int i=0; i<score.length ; i++)
			sum += score[i];
		
		double avg = sum / 3.0;
		System.out.println("평균: " + avg);
		System.out.printf("평균: %.2f\n", avg);
	}

}
