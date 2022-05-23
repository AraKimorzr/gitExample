package ch05;

import java.util.Scanner;

public class Ara연습 {

	public static void main(String[] args) {
		int menu = 0;
		int food = 0;
		Scanner scanner = new Scanner(System.in);
		
		outer: //Label처리
		while(true) {
			System.out.println("1) 한식");
			System.out.println("2) 양식");
			System.out.println("3) 중식");
			System.out.println("원하는 메뉴[1,2,3]를을 선택하세요.");
			System.out.print("(종료를 원하시면 0을 누르세요.) 메뉴>>");
			menu = scanner.nextInt();
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				continue;
			}else if(menu < 1 || menu > 3) {
				System.out.println();
				System.out.println("잘못된 번호입니다. \n");
				continue;
			}
			inner:
			for(;;) {
			  switch(menu) {
			  case 1:
				System.out.println();
				System.out.println(" 한식메뉴를 선택하세요.");
				System.out.println(" (뒤로가기:0 | 주문완료:99)");
				System.out.println("\t 1-김치찌개");
				System.out.println("\t 2-된장찌개");
				System.out.println("\t 3-삼겹살");
				System.out.println("\t 4-비빔밥");
				System.out.print(">>");
			    food = scanner.nextInt();
			    if(food==0) {
			    	System.out.println();
					break inner;
			    }
				if(food==99)
					break outer; //전체 종료
				if(food==1) {
					System.out.println("\t >>고객님은 김치찌개를 선택하셨습니다.");
				}else if(food==2) {
					System.out.println("\t >>고객님은 된장찌개를 선택하셨습니다.");
				}else if(food==3) {
					System.out.println("\t >>고객님은 삼겹살을 선택하셨습니다.");
				}else if(food==4) {
					System.out.println("\t >>고객님은 비빔밥을 선택하셨습니다.");
				}
			    break;
			  case 2:
				System.out.println();
				System.out.println(" 양식메뉴를 선택하세요.");
				System.out.println(" (뒤로가기:0 | 주문완료:99)");
				System.out.println("\t 1-돈까스");
				System.out.println("\t 2-비프스테이크");
				System.out.println("\t 3-카레라이스");
				System.out.print(">>");
			    food = scanner.nextInt();
			    if(food==0) {
			    	System.out.println();
					break inner;
			    }
				if(food==99)
					break outer; //전체 종료
				if(food==1) {
					System.out.println("\t >>고객님은 돈까스를 선택하셨습니다.");
				}else if(food==2) {
					System.out.println("\t >>고객님은 비프스테이크를 선택하셨습니다.");
				}else if(food==3) {
					System.out.println("\t >>고객님은 카레라이스를 선택하셨습니다.");
				}
				break;
			  case 3:
				System.out.println();
				System.out.println(" 중식메뉴를 선택하세요.");
				System.out.println(" (뒤로가기:0 | 주문완료:99)");
				System.out.println("\t 1-짜장면스");
				System.out.println("\t 2-짬뽕");
				System.out.println("\t 3-탕수육");
				System.out.print(">>");
			    food = scanner.nextInt();
			    if(food==0) {
			    	System.out.println();
					break inner;
			    }
				if(food==99)
					break outer; //전체 종료
				if(food==1) {
					System.out.println("\t >>고객님은 짜장면을 선택하셨습니다.");
				}else if(food==2) {
					System.out.println("\t >>고객님은 짬뽕을 선택하셨습니다.");
				}else if(food==3) {
					System.out.println("\t >>고객님은 탕수육 선택하셨습니다.");
				}
				break;
			  } //swith문
			} //for문
		}//while문
		System.out.println();
        System.out.println("주문이 완료되었습니다.");
		
		
	}

}

