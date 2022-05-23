package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1 = "java";
		str1 += " programming";// str1=str1+" programming", 문자열 연결
		//실제로 새로운 문자열을 만들고 str1은 새로운 문자열의 주소값을 기리키게됨.
		System.out.println(str1);
		System.out.println(str1.length());//문자열의 길이
		
		String str2 = str1.concat(" programming");//concat()으로 문자열을 연결
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2));//chatAt(n)번째 문자 리턴
		System.out.println(str2.indexOf("program"));//"program"의 시작문자열의 인데스값을 리턴
		System.out.println(str2.indexOf("z"));//찾고자 하는 내용이 없으면 -1을 리턴(출력)한다.
		
		System.out.println(str2.substring(0, 4));//substring(start, end-1) =>(0~3)
		System.out.println(str2.substring(5));//substring(n ~ )
		
		System.out.println(str2.replace("java", "jsp"));//문자열.replace(old, new)
		
		String str3 = "3578945698712";
		System.out.println(str3.substring(5, 9));
		System.out.println(str3.replace(str3.substring(5, 9), "****"));
		//replace(old(substring(5,9-1)), new)
	}

}
