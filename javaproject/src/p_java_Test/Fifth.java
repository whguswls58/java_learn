package p_java_Test;

public class Fifth {

	public static void main(String[] args) {
		// 60과 24의 최대 공약수 구하기
		int n1 = 60, n2 = 24;
		int gcd = 0;
		for(int i = 1; i<=n1 ; i++) {
			if(n1%i == 0) {
				for(int j=1 ; j<=n2 ; j++) {
					if(i==j && n2%j == 0) {
						if(gcd <= j)
							gcd = j;
					}
				}
			}
		}
		System.out.println(n1+"과 " + n2 + "의 최대 공약수: " + gcd);
	}
}
