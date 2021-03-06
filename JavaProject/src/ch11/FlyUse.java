package ch11;

public class FlyUse {
	public static void main(String[] args) {
		//첫번째 객체생성 방법
		Bird bird = new Bird();
		bird.takeOff();
		bird.fly();
		bird.land();
		
		Airplane air = new Airplane();
		air.takeOff();
		air.fly();
		air.land();
		
		System.out.println("=============");
		
		//두번째 다형성 기법
		//좌변-부모, 우변-자식 => 다형성
		Flyer f = new Bird();
		System.out.println(f);
		f.takeOff();//F3을 눌러보면 해당되는 부모 Flyer의 메소드가 나옴
		f.fly();
		f.land();
		
		f = new Airplane();//재정의
		System.out.println(f);
		f.takeOff();
		f.fly();
		f.land();
		
	}

}
