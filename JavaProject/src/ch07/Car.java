package ch07;

public class Car {
	//멤버 변수
	String color;//색상
	int speed;//속도 0+10
	int gear;//기어 1
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeColor(String c) {
		color = c;
	}
	
	void changeSpeed(int s) {
		speed = s;
	}
	
	void changeGear(int g) {//멤버메소드
		gear = g;
	}
	
	void speedUp() {
		speed =  speed + 10;
	}
	
	void speedDown() {
		speed =  speed - 10;
	}
	

}
