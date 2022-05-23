package ch07;

public class PersonUse {
	public static void main(String[] args) {
		Person p1 = new Person(); //객체생성(인스턴스화)
		//객체참조변수.멤버
		p1.setName("홍길동");  //private은 같은 클래스 내에서만 접근 가능
		p1.setAge(30);
		//p1.setHeight(180);
		

		System.out.println("이름 : " + p1.getName());
		System.out.println("나이 : " + p1.getAge());
		//System.out.println("키 : " + p1.getHeight);
		
		
	}

}
