package ch13;

public class ToStr {
	public static void main(String[] args) {
		Object obj=new Object();
		//좌:부모(첫조상), 우:자식 =>다형성
		obj=new Integer(20);
		//참조변수에는 원래 주소값이 들어가지만 jdk1.5부터는 value가 들어갈 수 있도록
		//내부처리(inValue())등 호출)하도록 했다. (Auto Boxing처리)
		
		System.out.println(obj);//오토 언박싱(auto unboxing)
		obj=new Double(20.5);
		System.out.println(obj);
		obj="hello";
		System.out.println(obj);
	}

}
