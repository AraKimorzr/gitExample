package ch04;

import java.util.Scanner;

//휴가일수 계산
//근속연수 1~3년 ==> 3일, 4~9년 ==> 5일
//10년 이상 10일, 20년 이상 ==> 20일

public class Holiday {
	public static void main(String[] args) {
		//변수선언
		int year; //근속연수
		int day; //휴가일수
		//데이터 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("근속연수를 입력하세요 : ");
		year = scan.nextInt();
		scan.close();
		
		//계산
		if(year <=3) {
			day = 3;
		}else if(year<10) {
			day=5;
		}else if(year<20) {
			day=10;
		}else {//그외의 모든 경우
			day=20;
		}
		
		//출력
		System.out.println("당신의 근속연수는 "+year+"년이고 ");
		System.out.println("휴가일수는 "+day+"일입니다.");
		
	}

}
