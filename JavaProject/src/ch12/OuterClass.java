package ch12;

public class OuterClass {
	private static int x = 10;
	//OuterClass의 static멤버변수
	class Inner {//inner class
		int getX() {
			return x;//outer 클래스의 private변수도 쓸 수 있다.
		}
	}//end inner
	
	public static void main(String[] args) {
		System.out.println(x);
		OuterClass e = new OuterClass();
		OuterClass.Inner in = e.new Inner();
		System.out.println(in.getX());
	}	
}
