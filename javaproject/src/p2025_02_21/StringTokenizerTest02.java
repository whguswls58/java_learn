package p2025_02_21;

import java.util.StringTokenizer;

public class StringTokenizerTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String source1 = "한국 미국 태국 중국 이란";
		StringTokenizer st1 = new StringTokenizer(source1, " ");	// 공백( )으로 파싱 수행
		while(st1.hasMoreTokens()) {
			System.out.println("st1.token:"+ st1.nextToken());
		}
		System.out.println();

		String source2 = "푸들,삽살개,풍산개,진도개";
		StringTokenizer st2 = new StringTokenizer(source2, ",");	// 콤마(,)로 파싱 수행
		while(st2.hasMoreTokens()) {
			System.out.println("st2.token:"+ st2.nextToken());
		}
		System.out.println();
		
		// true : 구분기호(,)도 토큰에 포함을 해서 처리하라는 의미
		StringTokenizer st3 = new StringTokenizer(source2, ",", true);
		while(st3.hasMoreTokens()) {
			System.out.println("st3.token:"+ st3.nextToken());
		}
		
	}

}


