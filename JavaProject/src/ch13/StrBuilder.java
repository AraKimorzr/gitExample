package ch13;

public class StrBuilder {
	public static void main(String[] args) {
		//String 불변(immutable)
		//StringBuilder 가변(mutable)
		//StringBuffer는 초기버전, StringBuilder는 최신버전
		
		StringBuilder str1 = new StringBuilder();
		str1.append("java");//append()는 문자열 내용 추가, 메모리 절약
		System.out.println(str1.toString());
		str1.append(" programming");
		System.out.println(str1);
		
		str1.replace(0, 4, "jsp");//0~3까지의 인덱스 내용을 변경(java->jsp)
		System.out.println(str1);
		//참고로 replace()메소드는 주로 String객체의 replace()를 많이 쓰는 편이다.
		
		String str2 = str1.substring(3);//인덱스 3부터 끝까지
		System.out.println(str1);
		System.out.println(str2);
		
		//StringBuilder를 String으로 바꿀 때는 toString()을 사용
		String str3 = str1.toString();//String str3=str1; =>여기까지만 하면 에러남.
		System.out.println("StringBuilder(str1)->String(str3)에 저장 : "+str3);
		
		//String을 StringBuilder 타입으로 저장(초기화)할 때
		str1 = new StringBuilder(str3);
		System.out.println("String(str3)->StringBuilder(str1)에 저장 : "+str1);
		
		
	}

}
