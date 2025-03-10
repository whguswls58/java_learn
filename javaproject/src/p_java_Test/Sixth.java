package p_java_Test;

import java.util.TreeSet;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~45 정수 중 6개 숫자 추출
		// 추출된 6개의 숫자 오름차순 정렬

		TreeSet lotto = new TreeSet();

		for (int i = 0; i < 6;) {
			boolean check = lotto.add((int) (Math.random() * 45 + 1));
			if (check)
				i++;
		}

		System.out.println(lotto);

	}

}
