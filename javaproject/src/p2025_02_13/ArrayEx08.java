package p2025_02_13;

public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 복사 : for문으로 배열 복사
		
		int[] oldArray = {10,20,30};		// 원본 배열
		int[] newArray = new int[5];		// 새로운 배열
		
		for(int i=0 ; i<oldArray.length ; i++ ) 	
			newArray[i] = oldArray[i];
		
		
		for(int i : newArray) 
			System.out.print(i + "\t");
		
	}

}
