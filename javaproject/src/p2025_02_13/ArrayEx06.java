package p2025_02_13;

public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 향상된 for문, 확장 for문
		// for ( 변수 : 순차적인 자료구조(배열, 컬렉션)){
		//		반복 실행할 문장;
		// }
		
		int[] score = {95, 71, 84, 93, 87};
		
		// 1. 기본 for문
		int sum = 0;
		for( int i=0; i<score.length; i++)
			sum+=score[i];
		System.out.println("총합: " + sum);
		
		// 2. 향상된 for문
		int sum1 = 0;
		for(int s : score) {	// 변수 s에 score 배열 0번부터 차례로 값 대입(원소값이 없을때까지)
			sum1 += s;
		}
		System.out.println("총합: " + sum1);
	}

}
