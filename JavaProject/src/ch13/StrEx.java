package ch13;

public class StrEx {
	public static void main(String[] args) {
		String str = "Java Programming";
		System.out.println(str);
		//대문자로 변경
		System.out.println(str.toUpperCase());
		//소문자로 변경
		System.out.println(str.toLowerCase());
		//처음으로 환원
		System.out.println(str);//불변성(원본은 바뀌지 않음)
		
		str=str.toLowerCase();//기존 str 주소값은 끊어지고 소문자처리된 문자열로 새로 연결됨
		System.out.println(str);
		
		str="";//널(빈)문자열('\0')을 가리킴
		System.out.println("내용 : "+str);
		str=null; //위랑 다름, 주소값 자체가 없음(참조하는 내용이 없다)
		System.out.println("내용 : "+str);
		
		char ch='\0';//널문자
		System.out.println("내용 : "+ch+", code : "+(int)ch);
		ch=' ';
		System.out.println("내용 : "+ch+", code : "+(int)ch);
	}

}
