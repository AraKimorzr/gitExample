package ch10;

//final 변수
//1)값을 변경할 수 없다.
//2)초기값이 반드시 필요하다.
//3)대문자로 작성, 2단어 이상일 경우 _로 연결한다.

public class FinalVar {
	//전역변수(멤버변수)
	final static int MAX_NUM = 500;//변수에 final을 붙이면 값을 변경할 수 없다.
	//final static int MAX_NUM; //final변수는 전역변수화 해도 선언만 하면 에러. 값을 지정해야함(값초기화)
	
	public static void main(String[] args) {
		int max = 100;
		System.out.println(max);
		
		System.out.println(MAX_NUM);
		//MAX_NUM=200; //final 변수(상수)는 값을 수정할 수 없음.
	}

}
