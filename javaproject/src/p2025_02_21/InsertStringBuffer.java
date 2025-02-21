package p2025_02_21;

public class InsertStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("gemini is beautiful");
		System.out.println(sb1);

		sb1.insert(10, "very ");		// 지정된 인덱스 번호에 데이터 삽입
		System.out.println(sb1);

		sb1.insert(0, 1004);
		System.out.println(sb1);
	}
}
