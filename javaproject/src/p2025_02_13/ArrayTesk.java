package p2025_02_13;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTesk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 키보드를 이용해서 정수 5개를 입력받은후 int형 배열에 저장
		// 배열에 저장된 값중 최대값과 최소값을 구하는 프로그램
		
		int[] num = new int[5];
		
		System.out.println("정수 값 5개 입력 :");
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<num.length ; i++ )
			num[i] = sc.nextInt();
				
		int max = num[0];			// 최대값 초기값
		int min = num[0];			// 최소값 초기값
		
		// 배열 내의 값을 모두 비교하여 구하기
		for(int i=1; i<num.length ; i++) {
			if(num[i] > max)
				max = num[i];
			if(num[i] < min)
				min = num[i];			
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		System.out.println();
		
		// 정렬 이용해서 구하기
		Arrays.sort(num);

		System.out.println("최대값 : " + num[num.length-1]);
		System.out.println("최소값 : " + num[0]);
	}

}
