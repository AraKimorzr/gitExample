package ch08;

public class Person {
	//멤버변수
	private String name;//p1;김철호 p2;김상범 p3;박찬호 p4;박지성
	private int height;//p1;170 p2;190 p3;185 p4;175
	private int weight;//p1;60 p2;100 p3;70 p4;72
	
	public Person() {//기본생성자
		this("김철호", 170,60);//this() 생성자 호출, 첫줄에 써야함.
	}
	
	public Person(String name) {//name=김상범
		this(name,190,100);
	}
	
	public Person(String name, int height) {//name=박찬호, height=185
		this(name,height,70);//생성자 호출
	}
	
	public Person(String name, int height, int weight) {
		this.name=name;//p1;김철호 p2;김상범 p3;박찬호 p4;박지성
		this.height=height;//p1;170 p2;190 p3;185 p4;175
		this.weight=weight;//p1;60 p2;100 p3;70 p4;72
	}
	
	public void showInfo() {
		System.out.println("===신상 정보===");
		System.out.println("이름 : " + name);
		System.out.println("신장 : " + height);
		System.out.println("체중 : " + weight);
	}

}
