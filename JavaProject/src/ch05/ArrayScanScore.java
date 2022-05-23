package ch05;

import java.util.Scanner;

public class ArrayScanScore {
	//[문제1] 학생들의 성적을 입력받아서 합계와 평균을 구하는 프로그램을 작성
	// 배열, 스캐너, for-each문 활용
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성적처리할 학생수를 입력하세요 : ");
		int[] stu = new int[scan.nextInt()];
		int tot=0;
		double avg;
		
		for(int i : stu) { 
			System.out.print("성적을 입력하시오 : ");
			stu[i] = scan.nextInt();
			
			for(int j : stu) {
				tot+=j;
			}
		}
		avg = tot/stu.length;
		scan.close();
		
		System.out.println("총점은 "+tot+"입니다.");
		System.out.println("평균 성적은 "+String.format("%.1f", avg)+"입니다.");
		
	}

}
