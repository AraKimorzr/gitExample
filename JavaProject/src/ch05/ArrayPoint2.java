package ch05;

import java.util.Scanner;

//문제4] 스캐너와 배열을 활용해서 2명의 학생의 국,영,수 점수를 각각 입력해서 
//아래와 같은 결과가 출력되도록 해보세요.
public class ArrayPoint2 {
	public static void main(String[] args) {
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] mat = new int[2];
		int[] tot = {0,0};
		double[] avg = new double[2];
		double tot_avg=0;
		double class_avg=0;
		
		Scanner scan =  new Scanner(System.in);
		
		for(int a=0; a<2; a++) {
			System.out.print("이름을 입력하세요 : ");
			name[a]=scan.next();
			System.out.print("국어점수를 입력하세요 : ");
			kor[a] = scan.nextInt();
			System.out.print("영어점수를 입력하세요 : ");
			eng[a] = scan.nextInt();
			System.out.print("수학점수를 입력하세요 : ");
			mat[a] = scan.nextInt();
			System.out.println();
		}
		
		for(int a=0; a<2; a++) {
		    tot[a] = kor[a] + eng[a] + mat[a];
			avg[a] = tot[a] / 3.0;
			tot_avg =tot_avg + avg[a];
		}
		
		for(int a=0; a<2; a++) {
			System.out.println();
			System.out.println("이름 : "+name[a]);
			System.out.println("국어 : "+kor[a]);
			System.out.println("영어 : "+eng[a]);
			System.out.println("수학 : "+mat[a]);
			System.out.println("총점 : "+tot[a]);
			System.out.println("평균 : "+avg[a]);
			System.out.println();
		} 
		scan.close();
		class_avg = tot_avg/2.0;
		
		System.out.println("==================");
		System.out.println("학급평균 : "+class_avg);
	}

}
