package ch07;

public class PersonUse2 {
	public static void main(String[] args) {
		Person p1 = new Person(); //객체생성(인스턴스화)
		//객체참조변수.멤버
		p1.setName("홍길동");  //private은 같은 클래스 내에서만 접근 가능
		p1.setAge(30);
		p1.setEmail("hong@naver.com");
		p1.setAdd("서울 강남구 역삼동");
		
		Person p2 = new Person();
		p2.setName("사임당"); 
		p2.setAge(23);
		p2.setEmail("saimdang@daum.net");
		p2.setAdd("서울 강남구 개포동");
		
		p1.print();
		System.out.println();
		p2.print();

	}
}
