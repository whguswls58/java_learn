package p2025_02_13;

public class Arr04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2차원 배열 생성
		// 값 목록으로 배열 생성 : 저장될 값 정해진 경우(선언과 동시에 초기화 수행)
		
		// 5명 학생의 국어, 영어, 수학 점수를 2차원 배열에 저장
		// 행: 학생번호(1~5번 학생)
		// 열: 과목(국어, 영어, 수학)
		int[][] score = { {85, 60, 70},			// 0행
						  {90, 95, 80},			// 1행
						  {75, 80, 100},		// 2행
						  {80, 70, 95},			// 3행
						  {100, 65, 80}	};		// 4행
		
		int[] subject = new int[3];			// 과목 총점
		int[] student = new int[5];			// 학생 총점
		
		System.out.println("각 과목별 총점 구하기");
		for(int col=0; col<score[0].length; col++) {
			for(int row=0; row<score.length; row++)
				subject[col] += score[row][col];
			switch (col % score[0].length) {
				case 0:
					System.out.println("국어 점수합: " + subject[col]);
					break;
				case 1:
					System.out.println("영어 점수합: " + subject[col]);
					break;
				case 2:
					System.out.println("수학 점수합: " + subject[col]);
					break;
				default:
					System.out.println();
					
			}
		}
		
		System.out.println();
		System.out.println("각 학생별 총점 구하기");
		for(int row=0; row<score.length; row++) {
			for(int col=0; col<score[row].length; col++)
				student[row] += score[row][col];
		}
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println(i+1 + "번째 학생의 점수합: " + student[i]);
		}
		
		
	}

}
