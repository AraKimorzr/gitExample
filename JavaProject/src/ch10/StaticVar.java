package ch10;

public class StaticVar {
	static int a = 10;//static member
	int b = 20;//non-static member
	
	public static void main(String[] args) {
		System.out.println(StaticVar.a);//static멤버는 클래스이름.static멤버로 접근해 사용가능
		
		StaticVar s = new StaticVar();
		System.out.println(s.b);
	}

}
