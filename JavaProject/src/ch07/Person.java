package ch07;

public class Person {
	//멤버변수
	private String name;
	private int age;
	private String email;
	private String add;
//	private double height;
	
	//setter : set+변수명(변수명 첫글자는 대문자) , void와 씀
	public void setName(String name) {//name은 지역변수(로컬변수)
		//this => 멤버변수를 가리킴
		this.name = name;
		//멤버변수와 지역변수의 이름이 같을 때 멤버변수 앞에 this를 붙인다
	}
	
	//getter : get+변수명, return 값 필수
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age < 0 || age >150) {
			System.out.println("입력값이 정확하지 않습니다.");
		}else { 
			this.age = age;
		}
	}
	
	public int getAge() {
		return age;	
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setAdd(String add) { 
		this.add = add;
	}
	
	public String getAdd() {
		return add;
	}
	
	public void print() {
		System.out.println("이름 : " + name );
		System.out.println("나이 : " + age);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + add);
	}
		
//	public void setHeight(double height) {
//		this.height = height;
//	}
//	
//	public double getHeight() {
//		return height;
//	}

}
