package ch14;

public class Product {
	private String name;//제품명
	private String maker;//제조사
	private String date;//제조일자
	private int price;//단가(만원)
	private int amount;//수량
	private int money;//금액=단가*수량
	
	public Product() {
		
	}

	public Product(String name, String maker, String date, int price, int amount, int money) {
		super();
		this.name = name;
		this.maker = maker;
		this.date = date;
		this.price = price;
		this.amount = amount;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", maker=" + maker + ", date=" + date + ", price=" + price + ", amount="
				+ amount + ", money=" + money + "]";
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
