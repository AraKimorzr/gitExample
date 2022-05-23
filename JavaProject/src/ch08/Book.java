package ch08;


//도서판매정보 프로그램
public class Book {
	//멤버변수
	String bookname;//책제목
	String author;//저자
	String press;//출판사
	int year;//출판연도
	int price;//단가
	int amount;//판매수량
	int money;//판매금액(단가x판매수량)
	
	//기본생성자
	public Book() {
		this("자바","김선생","한빛",2020,20000,10);//다른생성자 호출 시 첫째줄에서 호출
		System.out.println("기본 생성자 호출");
	}

	public Book(String bookname, String author, String press, int year, int price, int amount) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.bookname = bookname;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price * amount;
	}
	
	public void input(String bookname, String author, String press, int year, int price, int amount) {
		this.bookname = bookname;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price * amount;
	}
	
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookname+"\t"+author+"\t"+press+"\t"+year+"\t"
		+price+"\t"+amount+"\t"+money);
		
	}
	

}
