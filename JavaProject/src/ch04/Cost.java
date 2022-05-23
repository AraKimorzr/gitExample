package ch04;

import java.util.Scanner;

public class Cost {
	public static void main(String[] args) {
		//변수선언
		String name = ""; //이름
		int price = 0; //구매금액
		int point = 0; //포인트
		int point_use = 0; //포인트 사용액
		int fee = 0; //배송료(구매금액이 2만원 미만 2000원 ...)
		int pay = 0; //실제 결제금액
		//자료입력
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next(); //문자를 받는 함수
		System.out.print("구매금액 : ");
		price = scan.nextInt(); //정수값을 받는 함수
		System.out.print("보유 포인트 : ");
		point = scan.nextInt();
		//계산
		if(price<20000) {
			fee=2000;
		}
		if(point >= 10000) {
			point_use = point;
			pay = price + fee - point;
		}else {
			pay = price + fee;
		}
		
		//출력
		System.out.println("이름\t구매금액\t배송료\t포인트사용\t결제금액");
		System.out.println(name+"\t"+price+"\t"+fee+"\t"+point_use+"\t"+pay);
	 
		
	}
}
