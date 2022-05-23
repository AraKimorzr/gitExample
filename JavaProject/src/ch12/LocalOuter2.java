package ch12;

public class LocalOuter2 {
	private int data = 20;
	void display() {
		//int value = 50;//지역변수를 inner class 아래 위치하면 에러남(jdk1.7)
		
		class LocalInner2 {//메소드 안에 있는 지역내부클래스 
			int value = 50;
			void msg() {
				System.out.println(value);
			}
		}//inner class
		LocalInner2 li = new LocalInner2();
		li.msg();
		
	}//end display()
	
	public static void main(String[] args) {
		LocalOuter2 lo = new LocalOuter2();
		lo.display();
	}

}
