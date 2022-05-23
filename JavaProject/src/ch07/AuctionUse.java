package ch07;

public class AuctionUse {
	public static void main(String[] args) {
	Auction a = new Auction();//클래스 내의 기본 생성자 호출
	a.setName("사임당");
	a.setUserid("saimdang");
	a.setMoney(150000);
	a.print();
	
	}

}
