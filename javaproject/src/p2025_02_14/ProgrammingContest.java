package p2025_02_14;

import java.util.Random;
import java.util.Scanner;


public class ProgrammingContest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		백준이는 작년 전국 대학생 프로그래밍 대회 동아리 연합(이하 전대프연) 회의에 불참했기 때문에, 올해 회장으로 선출되었다.
//		전대프연 회장은 오프라인 대회를 가을에 1회 개최해야 한다.
//		백준이는 대회를 개최할 주말을 마음대로 고를 수 있고, 회원들이 머무를 호텔을 찾아야 한다.
//		전대프연의 자금 사정은 넉넉하지 않기 때문에, 되도록 싼 호텔을 찾아야 한다.

//		여행의 총 비용은 예산을 초과하면 안 된다. 모든 회원은 같은 호텔에서 머물러야 한다.
//		작년에 모든 회원이 같은 호텔에 머무르지 않았고, 이로인해 대재앙이 일어났다.
//		일부 회원은 길을 잃어버렸고, 아직까지 그들을 다시 본 사람은 없다. 

		// 입력값
//		첫째 줄에 참가자의 수 1 ≤ N ≤ 200, 예산 1 ≤ B ≤ 500000, 호텔의 수 1 ≤ H ≤ 18,
//		고를 수 있는 주의 개수 1 ≤ W ≤ 13이 주어진다.
//		다음 줄부터 각 호텔의 정보가 주어지며, 호텔의 정보는 두 줄로 이루어져 있다.
//		첫 번째 줄에는 그 호텔의 일인당 숙박비용 1 ≤ p ≤ 10000이 주어지고,			----> 임의로 5000~10000으로 조정
//		둘째 줄에는 i번째 주에 투숙 가능한 인원 0 ≤ a ≤ 1000이 주어진다.

		// 출력값
//		첫째 줄에 대회를 개최할 수 있으면 최소 비용을 출력하고, 없으면 "stay home"을 출력한다.
		
		int[] data = new int[4];

		data = inputData(data);				// 입력받을 함수
		
		Contest con = new Contest(data[0], data[1], data[2], data[3]);

		System.out.println("======================================");

		con.hotelInfo();
	
		System.out.println("======================================");

		con.contestBudget();
		
		System.out.println("대회 필요 예산: " + con.getMin());
		System.out.println("대회 예산 : " + con.getBudget());

		System.out.println("======================================");

		con.contestJudge();

	}

	static int[] inputData(int[] data) {		
		Scanner sc = new Scanner(System.in);		
		while (true) {
			System.out.print("대회 참가인원(1~200) : ");
			data[0] = sc.nextInt();
			if (data[0] < 1 || data[0] > 200) {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			System.out.print("대회 예산(최대 500만) : ");
			data[1] = sc.nextInt();
			if (data[1] < 1 || data[1] > 5000000) {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			System.out.print("호텔 개수(1~18) : ");
			data[2] = sc.nextInt();
			if (data[2] < 1 || data[2] > 18) {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			System.out.print("대회 시행 주(1~13) : ");
			data[3] = sc.nextInt();
			if (data[3] < 1 || data[3] > 13) {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			break;
		}
		sc.close();
		
		return data;
	}

}

class Contest{
	
	private int n; 				// 참가자수 1~200
	private int budget; 		// 예산 1~ 5000000
	private int hotel; 			// 호텔 수 1~18
	private int week; 			// 고를 수 있는 주의 개수 1~13
	
	private int[] hotel_price;	// 호텔 숙박금액
	private int[] guest_num;	// 호텔 숙박가능 인원
	
	private int min;			// 숙박가능한 가장 싼 호텔의 숙박금액
	private int hotel_num;		// 숙박가능한 가장 싼 호텔
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getHotel() {
		return hotel;
	}

	public void setHotel(int hotel) {
		this.hotel = hotel;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public int[] getHotel_price() {
		return hotel_price;
	}

	public void setHotel_price(int[] hotel_price) {
		this.hotel_price = hotel_price;
	}

	public int[] getGuest_num() {
		return guest_num;
	}

	public void setGuest_num(int[] guest_num) {
		this.guest_num = guest_num;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getHotel_num() {
		return hotel_num;
	}

	public void setHotel_num(int hotel_num) {
		this.hotel_num = hotel_num;
	}

	public Contest(int n, int budget, int hotel, int week) {
		this.n = n;
		this.budget = budget;
		this.hotel = hotel;
		this.week = week;
	}
	
	void hotelInfo() {
		hotel_price = new int[this.hotel]; // 숙박비용 1~10000
		guest_num = new int[this.hotel]; // 투숙 가능 인원 1~1000
		Random random = new Random();
	

		for (int i = 0; i < guest_num.length; i++) {
			guest_num[i] = random.nextInt(1001); // 투숙 가능인원 랜덤으로 추출
			hotel_price[i] = (random.nextInt(5000) + 1) / 100 * 100 + 5000; // 숙박비용 랜덤으로 선정(임의로 5000~10000으로 조정)
			System.out.println((i + 1) + "번째 호텔 투숙가능 인원: " + guest_num[i] + "\t 투숙비용: " + hotel_price[i]);
		}
	}
	
	void contestBudget() {
	// 인원수(n) * 투숙비용(hotel_price[i]) <= 대회예산 (budget)
	// 인원수(n) <= 투숙 가능 인원(guest_num[i])
		min = this.hotel_price[0] * n;
		hotel_num = 1;
		for (int i = 0; i < hotel_price.length; i++) {
			if (budget >= n * hotel_price[i] && n <= guest_num[i]) {
				if (min >= n * hotel_price[i]) {
					min = n * hotel_price[i];
					hotel_num = i;
				}
			}
		}
	}
	void contestJudge() {
		if (min <= budget) {
			System.out.println("대회 참가인원: " + n);
			System.out.println("1인당 숙박 비용 : " + hotel_price[hotel_num]); // 투숙가능 할 경우 투숙비용 최소값 일때를 골라야함.
			System.out.println("대회 개최금액: " + min);
			System.out.println("대회 개최호텔: " + (hotel_num + 1) + "번째 호텔");
			System.out.println("대회 시행 주: " + week + "째 주");
		} else {
			System.out.println("예산 부족.. stay home...");
		}
	}
	
}
