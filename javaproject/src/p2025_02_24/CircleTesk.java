package p2025_02_24;

import java.text.DecimalFormat;

public class CircleTesk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반지름(r) : 5
		// 소숫점 2째자리까지 표기
		// 원주 = 2 * PI * r
		// 원 면적 = PI * r^2
		// 구 표면적 = 4 * PI * r^2
		// 구 부피 = 4/3 * PI * r^3
		
		double r = 5;										// 반지름
		
		double circumference = 2 * Math.PI * r;				// 원주
		double circleArea = Math.PI * Math.pow(r, 2);		// 원면적
		double surface = 4 * Math.PI * Math.pow(r, 2);		// 표면적
		double volume = 4/3 * Math.PI * Math.pow(r, 3);		// 부피
		
		//printf 포맷을 사용하여 소숫점 둘째자리까지 출력
		System.out.printf("원둘레: %.2f\n", circumference);
		System.out.printf("원면적: %.2f\n", circleArea);
		System.out.printf("원표면적: %.2f\n", surface);
		System.out.printf("원부피: %.2f\n", volume);
		System.out.println("=======================");
		
		// DecimalFormat 사용하여 소숫점 둘째자리까지 출력
		// 0 패턴 : 빈자리는 0으로 채움
		// # 패턴 : 빈자리는 채우지 않는다
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("원둘레: " + df.format(circumference));
		System.out.println("원면적: " + df.format(circleArea));
		System.out.println("원표면적: " + df.format(surface));
		System.out.println("원부피: " + df.format(volume));
		System.out.println();
		
		// DecimalFormat 리턴한 값의 type
		System.out.println("DecimalFormat 리턴 type : " + df.format(volume).getClass().getName());
		
	}

}
