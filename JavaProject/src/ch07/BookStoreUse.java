package ch07;

public class BookStoreUse {
	public static void main(String[] args) {
		BookStore b1 = new BookStore();
		b1.setName("Java");
		b1.setWriter("김선생");
		b1.setCompany("영진");
		b1.setYear(2022);
		b1.setPrice(30000);
		b1.setQuantity(10);
		
		b1.print();
	}

}
