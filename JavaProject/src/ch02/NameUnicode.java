package ch02;

public class NameUnicode {

	public static void main(String[] args) {
		String name = "김아라";
		char kim = '\uAE40';
		char a = '\uC544';
		char ra = '\uB77C';
		
		System.out.println("===================");
		System.out.println(name);
	    System.out.println("--------------------------------");
		System.out.println("char형('\\uAE40'):" + kim);
		System.out.println("char형('\\uC544'):" + a);
		System.out.println("char형('\\uB77C'):" + ra);
		System.out.println("==================");

	}

}
