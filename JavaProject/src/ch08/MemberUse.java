package ch08;

public class MemberUse {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.print();
		
		Member m2 = new Member("홍길동", "hong", 120000);
		m2.print();
	}

}
