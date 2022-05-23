package ch06;

import java.util.Scanner;

//[문제1]구구단을 메소드를 활용해서 작성해보세요.
public class GuguEx {
	
	static void gugu(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
		System.out.println();
	}
	
	static void guguAll() {
		for(int i=2;i<=9; i++) {
			for(int j=1; j<=9; j++) {
			System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력하세요 : ");
		int dan;
		dan = scan.nextInt();
		System.out.println("==첫번째 gugu메소드 활용==");
		gugu(dan);
		System.out.println("==두번째 guguAll메소드 활용==");
		guguAll();
		
		scan.close();
	}

}
