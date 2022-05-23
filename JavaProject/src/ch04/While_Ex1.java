package ch04;

public class While_Ex1 {
	public static void main(String[] args) {
		int i=1;
		do {//먼저실행
			System.out.print(i);
			i++;
		}while(i<=10); //나중에 검사, ';'세미콜론 반드시 찍어야함
	}

}
