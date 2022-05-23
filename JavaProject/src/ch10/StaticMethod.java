package ch10;

public class StaticMethod {
	static int a = 10;//static member
	int b = 20;//non-static member
	
	public static void printA() {//static member method
		System.out.println(a);
		//System.out.println(b); //static 멤버메소드 안에서는 non-static 멤버변수를 쓸 수 없다
		
		StaticMethod s = new StaticMethod();
		System.out.println(s.b);//non-static 멤버는 반드시 new를 통해 인스턴스화한 후 접근가능
	}
	
	public void printB() {//non-static member method, static도 쓸 수 있다.
		System.out.println(a);//static
		System.out.println(b);//non-static
	}
	
	public static void main(String[] args) {//static멤버
		printA();
		//printB();//static멤버 안에서는 non-static멤버를 그냥 쓸 수 없다.
		
		StaticMethod a = new StaticMethod();
		a.printB();//non-static멤버는 반드시 new를 통해 객체화한 후 사용 가능
	}

}
