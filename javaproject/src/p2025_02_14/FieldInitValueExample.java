package p2025_02_14;

class FieldInitValue{
	
	// int, double, boolean 세가지가 사용 빈도가 높으니 기억해둘 것
	
	byte byteField;			// 0으로 초기화
	short shortField;
	int intField;
	long longField;
	
	float floatField;		// 0.0f
	double doubleField;		// 0.0 으로 초기화
	
	boolean boolField;		// false로 초기화
	char charField;			// 공백문자로 초기화
	
	int[] arrField;			// null - 참조할 주소가 없음
	String referenceField;	// null
	
}

public class FieldInitValueExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField: " + fiv.byteField);
		System.out.println("shortField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);
		System.out.println("booleanField: " + fiv.boolField);
		System.out.println("charField: " + fiv.charField);
		System.out.println("floatField: " + fiv.floatField);
		System.out.println("doubleField: " + fiv.doubleField);
		System.out.println("arrField: " + fiv.arrField);
		System.out.println("referenceField: " + fiv.referenceField);
		
		
	}

}
