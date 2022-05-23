package ch13;

public class Change {//값을 교환하는 예제
	public static void main(String[] args) {
		int a=10;//콜라 컵
		int b=20;//사이다 컵
		int temp;//b의 값을 a에 바로 넣기 전에 미리 백업해서 거쳐가는 임시변수(ex.주스옮기기)
		
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
	}

}
