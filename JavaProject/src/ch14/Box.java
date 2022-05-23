package ch14;

public class Box {
	//멤버변수
	private Object data;
	
	public Object get() {//리턴타입이 Object
		return data;
	}
	
	public static void main(String[] args) {
		Box b = new Box();
		b.set("Hello World");//문자열 처리가능 ~ 모든 타입 가능
		String s = (String)b.get();//    String=Object
		
		Box c=new Box();
		c.set(30);
		Integer i = (Integer)c.get();// Class객체 =Object(조상객체)
	

		
	}
}
