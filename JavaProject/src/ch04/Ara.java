package ch04;

import java.util.Scanner;

public class Ara {
//For, If, Switch 제어문, Scanner를 활용해서 아래처럼 출력하는 성적계산 프로그램을 만들어보세요.
	public static void main(String[] args) {
		int kor = 0;
		int eng = 0;
		int mat = 0;
		int tot = kor+mat+eng; //총점
		double avg = tot/3.0 ;
		String grade = ""; //빈문자 초기화 (등급:수,우,미,양,가)
		String str = "";
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=3; i++) {
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				mat = sc.nextInt();
				System.out.println();
				tot = kor+mat+eng;
				avg = tot/3.0;
				
				if(avg >= 90) {
					grade = "수";
				} else if(avg >= 80) {
					grade = "우";
				} else if(avg >= 70) {
					grade = "미"; 
				} else if(avg >= 60) {
					grade = "양";
				} else {
					grade = "가";
				}
				
				str = str + String.format("%d\t%d\t%d\t%d\t%.1f\t%s%n",kor,eng,mat,tot,avg,grade);

		}
		sc.close();
		
		System.out.println("==================================================");		
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("--------------------------------------------------");	
		System.out.print(str);
		System.out.println("==================================================");	
		System.out.println();



}
}
