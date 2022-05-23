package ch12;

public class OuterEx {
	class InnerEx{
		int num = 2;
		String name = "사임당";
		String email = "saim@gmail.com";
		String add = "서울시 강남구 역삼동";
		public void print() {
			System.out.println("----------------");
			System.out.println("고객번호 : " + num);
			System.out.println("이름 : " + name);
			System.out.println("이메일 : " + email);
			System.out.println("주소 : " + add);
			System.out.println("----------------");
		}
	}
	
	public static void main(String[] args) {
		OuterEx ex = new OuterEx();
		OuterEx.InnerEx in = ex.new InnerEx();
		in.print();
	}

}
