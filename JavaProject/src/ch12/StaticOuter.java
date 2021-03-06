package ch12;

//정적중첩클래스(static 내부클래스)

public class StaticOuter {
	static int data = 30;
	int data2 = 50;
	static class StaticInner { 
		void msg() {
			System.out.println("data is " + data);//static멤버
			//System.out.println("data is " + data2); //non-static멤버라 오류남
		}
	}
	
	public static void main(String[] args) {
		StaticOuter.StaticInner in = new StaticOuter.StaticInner();
		//static 내부클래스는 생성시 참조변수 = new 외부클래스.내부클래스생성자
		in.msg();
	}
}
