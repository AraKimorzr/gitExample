package ch05;

public class ArrayEx {
	public static void main(String[] args) {
		int[] score; //배열참조변수 선언
		score = new int[5]; //new를 통해서 5개의 int형 배열참조변수 생성
		System.out.println(score);
		score[0]=100;
		score[1]=90;
		score[2]=80;
		score[3]=70;
		score[4]=60;
		//score[5] =  50; //범위초과>error
		
		for(int i=0; i<5; i++) {
			System.out.println(score[i]);
		}
		
		//int[] score= {100,90,80,70,60}; //간결하게 정리한 식
	}

}
