package ch09;

class Animal {//부모클래스
	
	public Animal(String s) {//매개변수가 있는 생성자
		System.out.println("동물 : " + s);
	}
	
}

class Mammal extends Animal {
	public Mammal() {
		//**super()를 쓸때에는 반드시 첫째줄에 써야만 한다.**
		super("원숭이");//부모클래스 생성자 호출, super()는 부모클래스의 생성자 호출
		System.out.println("포유류 : 원숭이");
	}

	public Mammal(String s) {//s=사자
		super(s);//부모클래스 생성자 호출
		//this() => 생성자 호출
		System.out.println("포유류 : " + s);
	}
	
}


public class AnimalDemo {
	public static void main(String[] args) {
		Mammal ape = new Mammal();//객체생성 및 기본생성자 호출
		System.out.println(ape);
		Mammal lion = new Mammal("사자");//객체생성 및 매개변수가 있는 생성자 호출
		System.out.println(lion);
	}

}
