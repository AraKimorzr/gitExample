package ch02;

import java.util.Scanner;
//ctrl+shift+영문 'O'키를 누르면 위처럼 import...

public class ScannerEx {
	//키보드로부터 사용자 입력 프로그램

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    //스캐너객체 : 키보드로부터 값을 입력받게 해주는 객체
		System.out.println("첫번째 정수값?"); //안내문구
		int x = in.nextInt(); //정수값을 입력받도록 하는 메소드인 nextInt()
		System.out.println("두번째 정수값?");
		int y = in.nextInt();
		System.out.printf("%d * %d은 %d입니다.\n", x, y, x*y);

	}

}
