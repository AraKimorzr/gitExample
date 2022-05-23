package ch11;

public class AutoCarUse {
	public static void main(String[] args) {
		OperateCar obj = new AutoCar(); //다형성, 좌-부모/우-자식
		obj.start();
		obj.setSpeed(90);
		obj.turn(15);
		obj.stop();
	}

}
