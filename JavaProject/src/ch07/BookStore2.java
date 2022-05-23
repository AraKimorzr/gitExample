package ch07;

public class BookStore2 {
	String name;
	String writer;
	String company;
	int year;
	int price;
	int quantity;
	int tot_price;
	
	public void input(String name, String writer, String company,
			int year, int price, int quantity) {
		this.name=name;
		this.writer=writer;
		this.company=company;
		this.year=year;
		this.price=price;
		this.quantity=quantity;
		
		tot_price = price*quantity;
	}
	
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(name+"\t"+writer+"\t"+company+"\t"+year+"\t"
				+price+"\t"+quantity+"\t"+tot_price);
	}

}
