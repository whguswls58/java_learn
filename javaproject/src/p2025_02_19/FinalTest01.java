package p2025_02_19;

class FinalMember {
  final int a=10;		// 상수
  public void setA(int a){
//    this.a=a;			// 상수는 값을 수정할 수 없음 -> 오류 발생
  }
}

public class FinalTest01{
  public static void main(String[] args) {
    FinalMember ft= new FinalMember();
	final int a=1000;
    ft.setA(100);
    System.out.println(a);
  }
}                                                    
