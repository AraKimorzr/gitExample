package ch14;

import java.util.Scanner;

public class Product2 {
	private String num;//제품번호
	private String name;//제품명
	private String maker;//제조사
	private String date;//제조일자
	private int price;//단가
	private int amount;//수량
	private int money;//금액=단가*수량
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("제품번호 : ");
		num=scan.next();
		System.out.println("제품명 : ");
		name=scan.next();
		System.out.println("제조사 : ");
		maker=scan.next();
		System.out.println("제조일자 : ");
		date=scan.next();
		System.out.println("단가 : ");
		price=scan.nextInt();
		System.out.println("수량 : ");
		amount=scan.nextInt();
		
		money=price*amount;
	}

	//getter, setter
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
