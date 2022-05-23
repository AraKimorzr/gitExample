package ch09;

public class Circle {
	//멤버 메소드
	private void secret() {//private은 상속 불가능
		System.out.println("비밀이다.");
	}
	protected void findRadius() {
		System.out.println("반지름 구하기");
	}
	public void findArea() {
		System.out.println("넓이 구하기");
	}

}
