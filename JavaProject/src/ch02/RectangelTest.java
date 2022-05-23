package ch02;

import java.util.Scanner;

public class RectangelTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		int weight =  in.nextInt();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		int hight = in.nextInt();
		System.out.println("직사각형의 넓이는 " + weight*hight + "입니다.");

	}

}
