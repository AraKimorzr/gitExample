package ch10;

public class StaticVar2 {
	static int total; //static 메모리(클래스)에 올라감(공유) : 1+1+1
	String model;//객체타입은 heap영역에 생성(new, non-static)
	public StaticVar2(String model) {//매개변수가 있는 생성자
		this.model=model;
		total++;//1+1+1
	}
	public StaticVar2() { 
		//기본생성자를 사용하지 않더라도 만들만 좋다
	}

}
