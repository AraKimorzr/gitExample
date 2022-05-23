package ch09;

public class Area {
	//멤버변수
	private int width;//int는 기본으로 0으로 초기화됨  10
	private int length;// 20
	
	//기본생성자
	public Area() {
		
	}
	
	//매개변수가 있는 생성자
	public Area(int width, int length) {//10,20
		this.width=width;
		this.length=length;
	}
	
	public int getArea() {
		return width*length;//10*20
	}

}
