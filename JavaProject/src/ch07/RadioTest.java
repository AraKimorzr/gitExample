package ch07;

public class RadioTest {
	public static void main(String[] args) {
		Radio a = new Radio();
		a.model = "브리츠";
		a.onoff = true;
		a.channel = 89.1;
		a.volum = 12;
		a.print();
		
		Radio b = new Radio();
		b.model = "아이리버";
		b.onoff = false;
		b.channel = 95.1;
		b.volum = 9;
		b.print();
		
	}

}
