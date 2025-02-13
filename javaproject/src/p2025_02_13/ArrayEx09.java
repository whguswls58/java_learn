package p2025_02_13;

import java.util.Arrays;

public class ArrayEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정렬(sort)
		// 		오름차순 정렬				내림차순 정렬
		// 숫자	1,2,3,....				10,9,8,...
		// 문자  가,나,다,.../a,b,c,...		하,파,타,..../ z,y,x,....
		//		사전순					역사전순
		
		int[] s = {30, 20, 80, 55, 29, 10};
		
		// 정렬전 배열
		System.out.print("정렬 전 배열:\t");
		for(int i : s)
			System.out.print(i + "\t");
		System.out.println();
		
		// 부분 정렬
		Arrays.sort(s, 2, 4);		// 2번째~4번째 정렬
		// 부분 정렬후 배열
		System.out.print("부분 정렬 후 배열:   ");
		for(int i : s)
			System.out.print(i + "\t");
		System.out.println();
		
		Arrays.sort(s);
		
		// 정렬후 배열
		System.out.print("정렬 후 배열: \t");
		for(int i : s)
			System.out.print(i + "\t");
		System.out.println();
		
	}

}
