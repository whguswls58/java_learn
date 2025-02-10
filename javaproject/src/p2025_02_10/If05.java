package p2025_02_10;

public class If05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("E = " + Math.E);			// E값
		System.out.println("PI = " + Math.PI);			// PI값
		System.out.println("난수 = " + Math.random());	// 난수발생 : 0.0 <= Math.random() < 1.0
		
		// 난수 발생 공식
		// 난수 = ((int) (Math.random) * (상한값-하한값+1)) + 하한값;	// 난수 : 하한값 ~ 상한값
		// 주사위 번호 뽑기 : 1 ~ 6
		int num = (int) (Math.random() * 6) + 1;
		System.out.println("num = " + num);
		
		if(num == 1){
			System.out.println("1번");
		}else if(num == 2) {
			System.out.println("2번");
		}else if(num == 3) {
			System.out.println("3번");
		}else if(num == 4) {
			System.out.println("4번");
		}else if(num == 5) {
			System.out.println("5번");
		}else {
			System.out.println("6번");
		}
		
		System.out.println("1~45사이의 난수 발생");
		int r = (int) (Math.random() * 45) + 1;
		System.out.println("난수 : " + r);
	}

}
