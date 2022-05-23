package ch06;

public class EchoEx {
	public static void echo(String s, int n) { 
		//매개변수이 개수, 데이터타입 반드시 맞추어줘야 한다.
		for(int i=0; i<n; i++) {
			System.out.println(s);
		}
		
	}
	
	public static void main(String[] args) {
		echo("안녕!", 3); //매개변수이 개수, 데이터타입 반드시 맞추어줘야 한다.
	}

}
