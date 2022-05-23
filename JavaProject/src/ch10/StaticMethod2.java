package ch10;

public class StaticMethod2 {
	//멤버변수
	static int num=10;//사번
	static String name="홍길동";//이름
	String email="hong@gmail.com";//이메일
	String hp="010-1234-5678";//전화
	String addr="서울 강남구 역삼동";//주소
	
	public static void printA() {
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
		StaticMethod2 s = new StaticMethod2();
		System.out.println("이메일 : "+s.email);
		System.out.println("전화 : "+s.hp);
		System.out.println("주소 : " + s.addr);	
	}
	
	public void printB() {
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
		System.out.println("이메일 : "+email);
		System.out.println("전화 : "+hp);
		System.out.println("주소 : " +addr);
	}
	
	public static void main(String[] args) {
		System.out.println("===printA()===");
		printA();
		
		StaticMethod2 a = new StaticMethod2();
		System.out.println("===printB()===");
		a.printB();
	}
	
	

}
