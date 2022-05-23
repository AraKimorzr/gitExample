package ch08;

//하나의 소스에 여러 클래스를 만들 때는 public 클래스가 저장될 파일이 된다.
//또한 public 클래스는 하나만 써야하며 주로 main메소드가 있는 클래스가 된다.
class Circle{
	private double radius;
	private String color;
	
	public Circle(double r, String c) {
		radius = r;
		color = c;	
	}
	
	public Circle(double r) {
		radius = r;
		color = "파랑";	
	}
	
	public Circle(String c) {
		radius = 10.0;
		color = c;	
	}
	
	public Circle() {
		radius = 10.0;
		color = "빨강";	
	}
	public void print() {
		System.out.println("반지름 : " + radius);
		System.out.println("색 깔 : " + color);
	}
}



public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0, "빨강");//객체생성과 동시에 생성자 호출
		c1.print();
		
		Circle c2 = new Circle(5.0);
		c2.print();
		
		Circle c3 = new Circle("노랑");
		c3.print();
		
		Circle c4 = new Circle();
		c4.print();
		
	}

}
