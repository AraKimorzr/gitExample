package ch13;


import java.util.Scanner;

public class MyGame {
	public static void main(String[] args) {
		//가위바위보 게임 만들기. exit를 입력하면 game exit...
		
		String[] str = {"가위","바위","보"};
		Scanner scan = new Scanner(System.in);
		System.out.println("가위, 바위, 보 중 하나를 입력하세요(exit 입력 시 종료) : ");
		String game=scan.next();
		System.out.println("==============[결과]==============");
		System.out.println("가위, 바위, 보 중 하나를 입력하세요 : "+game);
				
		int com=(int)(Math.random()*3);
		if(game.equals("가위")) {
			if(com==0) {
				System.out.println("비겼습니다. 컴퓨터는 가위입니다.");
			}else if(com==1) {
				System.out.println("지셨습니다. 컴퓨터는 바위입니다.");
			}else if(com==2) {
				System.out.println("이겼습니다. 컴퓨터는 보입니다.");
			}
		}else if(game.equals("바위")) {
			if(com==0) {
				System.out.println("이겼습니다. 컴퓨터는 가위입니다.");
			}else if(com==1) {
				System.out.println("비겼습니다. 컴퓨터는 바위입니다.");
			}else if(com==2){
				System.out.println("지셨습니다. 컴퓨터는 보입니다.");
			}
		}else if(game.equals("가위")) {
			if(com==0) {
				System.out.println("지셨습니다. 컴퓨터는 가위입니다.");
			}else if(com==1) {
				System.out.println("이겼습니다. 컴퓨터는 바위입니다.");
			}else if(com==2) {
				System.out.println("비겼습니다. 컴퓨터는 보입니다.");
			}
		}else if(game.equals("exit")) {
			System.out.println("Game Exit...");
		}

	}

}
