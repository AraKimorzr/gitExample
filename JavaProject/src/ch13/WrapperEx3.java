package ch13;

public class WrapperEx3 {
	public static void main(String[] args) {
		char[] data= {'H','e','l','l','o',' ','1','2','3','4'};
		for(int i=0; i<data.length; i++) {
			if(Character.isUpperCase(data[i])) {//대문자
				System.out.println(data[i]+"는 대문자입니다.");
			}else if(Character.isLowerCase(data[i])) {//소문자
				System.out.println(data[i]+"는 소문자입니다.");
			}else if(Character.isDigit(data[i])) {//숫자
				System.out.println(data[i]+"는 숫자입니다.");
			}else {
				System.out.println(data[i]+"는 공백입니다.");
			}
		}
		System.out.println("===============");
		
		System.out.println("문자 "+Integer.toString(1234)+"입니다.");
		System.out.println("숫자 "+Integer.parseInt("1234")+"입니다.");
		System.out.println("숫자 1234 + 2 = "+Integer.sum(1234, 2)+"입니다.");
	}

}
