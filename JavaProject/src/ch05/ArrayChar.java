package ch05;

public class ArrayChar {
	public static void main(String[] args) {
		//char[] ch= {'j','a','v','a'};
		//정식으로 new를 통해 배열 생성, 값을 할당
		
	    char[] ch;
	    ch=new char[4];
	    ch[0]='j';
	    ch[1]='a';
	    ch[2]='v';
	    ch[3]='a';
		
		for (int i=0; i<ch.length; i++) {
			System.out.println(i+"번째 문자 : "+ch[i]);
				
		}
	}

}
