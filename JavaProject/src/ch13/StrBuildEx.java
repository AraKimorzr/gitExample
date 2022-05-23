package ch13;

public class StrBuildEx {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
		str1.append("I am a ");
		str1.append("Java Programmer");
		System.out.println("-----------------------------------------");
		System.out.println("append()메소드를 활용 : "+ str1.toString());
		
		str1.replace(7, 11, "JSP");
		System.out.println("replace()를 활용 : "+str1.toString());
		
		String str2 = str1.substring(7);
		System.out.println("substring()을 활용 : "+str2);
		System.out.println("-----------------------------------------");

	}
	
}
