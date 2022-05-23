package ch08;

public class Member {
	private String name;
	private String userid;
	private int price;
	private String grade;
	
	public Member(String n, String u, int p) {
		name = n;
		userid = u;
		price = p;
		if(price>=100000) {
			grade="gold";
		}else if(price>=50000) {
			grade="silver";
		}else {
			grade="bronze";
		}
	}
	public Member() {
		this("홍길동", "hong", 120000);
	}
	
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userid+"\t"+price+"\t"+grade);
	}

}
