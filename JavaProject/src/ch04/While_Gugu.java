package ch04;

import java.util.Scanner;

//문제1] while문과 스캐너를 활용해서 구구단 출력 프로그램을 만들어 보세요.
public class While_Gugu {
	public static void main(String[] args) {
		int dan=1;
		int i=1;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요 : ");
		dan = scan.nextInt();
		while(i<=9) {
			System.out.println(dan+" x "+i+" = "+(dan*i));
			i++;
		  }
		i=1;
		scan.close();
	}

}
