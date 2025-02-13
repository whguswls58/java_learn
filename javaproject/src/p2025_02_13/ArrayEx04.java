package p2025_02_13;

public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열에 저장된 데이터 중에서 최대값과 최소값을 구하는 프로그램
		
		double[] data = {9.5, 7.0, 13.6, 7.5, 10.5};
		
		double min, max;
		
		// 초기값 설정
		max = data[0];
		min = data[0];
		
		for(int i=1 ; i<data.length ; i++) {
			if(max < data[i])
				max = data[i];
			if(min > data[i])
				min = data[i];
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		
	}

}
