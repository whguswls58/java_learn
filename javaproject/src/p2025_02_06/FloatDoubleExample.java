package p2025_02_06;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//실수값 저장
//		float var1 = 3.14;			//타입 = float, 값 = double 형이라 컴파일오류
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도 테스트(double 타입이 float 타입보다 2배이상 정밀한 값으로 출력)
		float var4 = 0.123456789123456789f;		//float: 소숫점 7자리까지 정밀도(8번째자리까지 표현 9번째 반올림)
		double var5 = 0.123456789012345678;		//double: 소숫점 16자리까지 정밀도(17번째자리까지 표현 18번째 반올림)
		
		
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		
		//e 사용하기
		//ex) 3e6 = 3 * 10^6
		double var6 = 3e6;				
		float var7 = 3e6F;
		double var8 = 2e-3;
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
				
		//대부분의 실수값을 저장하는 경우엔 double 형을 씀
	}

}
