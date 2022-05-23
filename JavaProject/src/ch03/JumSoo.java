package ch03;

import java.util.Scanner;

public class JumSoo {
	public static void main(String[] args) {
		String name;
		int Java, HTML, JSP, DB, tot;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("Java : ");
		Java =  scan.nextInt();
		System.out.print("HTML : ");
		HTML =  scan.nextInt();
		System.out.print("JSP : ");
		JSP =  scan.nextInt();
		System.out.print("DB : ");
		DB =  scan.nextInt();
		scan.close();
		
		tot = Java + HTML + JSP + DB;
		avg = tot / 4.0;
		
		System.out.println("==============================");
		System.out.println("이름\tJava\tHTML\tJSP\tDB\t총점\t평균");
		System.out.println("---------------------------------------------------");
		System.out.println(name+"\t"+Java+"\t"+HTML+"\t"+JSP+"\t"+DB+"\t"+tot+"\t"+avg);
		System.out.println("==============================");
		
		
		
	}

}
