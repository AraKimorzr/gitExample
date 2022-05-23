package ch09;

public class Employee2 {
	protected String num;//사원번호
	public String name;//이름
	String address;//주소(default)
	protected String email;//이메일
	protected int salary;//연봉
	private String rrn;//주민번호
	
	public String getRrn() {
		return rrn;
	}
	
	public Employee2() {
		
	}
	
	public Employee2(String num, String name, String address, String email, int salary, String rrn) {
		this.num=num;
		this.name=name;
		this.address=address;
		this.email=email;
		this.salary=salary;
		this.rrn=rrn;
	}

}
