package ch16;

public class BankPlayer extends Thread {
	int type;
	MyBank mybank;
	
	public BankPlayer(int type, MyBank mybank) {
		this.type = type;
		this.mybank = mybank;
	}
	
	public void BankPlayer() {
		
	}
	
	@Override
	public void run() {
		switch(type) {
		case 1 : mybank.BankPlayer1();
		 System.out.println(); break;
		case 2 : mybank.BankPlayer2();
		 System.out.println(); break;
		case 3 : mybank.BankPlayer3();
		 System.out.println(); break;
		}
	}
	

}
