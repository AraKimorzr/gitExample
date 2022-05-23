package ch12;

public class InnerExam1 {//외부클래스
	class Cal{//내부클래스
		int value = 0;
		public void plus() {
			value++;
		}
	}//end class Cal
	
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1(); //1.외부클래스를 인스턴스화한다.
		InnerExam1.Cal cal = t.new Cal();
		//2.외부클래스.내부클래스 참조변수 = 외부클래스의참조변수.new 내부클래스생성자;
		cal.plus();
		System.out.println(cal.value);
	}

}
