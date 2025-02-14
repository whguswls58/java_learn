package p2025_02_14;

import java.util.Scanner;

public class SugarDelivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
//		설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
//		상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.
//		예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만,
//		5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
//		상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
		
//		첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
//		상근이가 배달하는 봉지의 최소 개수를 출력한다.
//		만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
				
//		배달할 설탕량을 입력받을 부분
		int n;							// 배달할 설탕량 : n kg
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("배달할 설탕량을 입력하시오.(단, 3kg이상 5000이하만 가능)");
			n = sc.nextInt();
			
			if(n<3 || n>5000) {
				System.out.println("다시 입력하세요.");
			}else
				break;	
		}
		sc.close();
		
//		설탕봉지 계산할 부분
//		sugar3 * 3 + sugar5 * 5 >= n;
		int total=-1;							// 설탕 봉지가 정확하게 떨어지지 않으면 -1 출력
		int sugar3 =0, sugar5=0;				// 설탕봉지 3kg, 5kg


		for(int i=0 ; i*3 <= n ; i++) {
			for(int j=0 ; j*5 <= n ; j++) {
				if(i*3 + j*5 == n) {
					sugar5 = j;					// 5kg 설탕봉지의 수가 최대로 많아야 total 값이 최소가 됨
					break;
				}								
			}
			if(i*3 + sugar5*5 == n) {
				sugar3 = i;
				total = sugar3 + sugar5;
				break;
			}
		}
		
//		출력 부분
		System.out.println("3kg 설탕 " + sugar3 + "봉지, 5kg 설탕" + sugar5 + "봉지");
		System.out.println("총 설탕 봉지 : " + total);
		
		
	}

}
