package ch09;

public class Ball extends Circle {
	//Ball클래스의 멤버변수
	private String color;
	
	public Ball(String color) {//매개변수가 있는 생성자
		this.color=color;
	}
	
	//기본생성자 : 기본생성자도 코딩해주는 습관을 기르자.
	//Ball클래스의 멤버 생성자
	public Ball() {
		
	}
	
	public void findColor() {
		System.out.println(color + "공이다.");
	}
	
	public void findVolum() {
		System.out.println("부피 구하기");
	}

}
