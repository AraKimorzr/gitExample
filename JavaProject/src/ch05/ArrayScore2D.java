package ch05;

public class ArrayScore2D {
	public static void main(String[] args) {
	  //2문제] 2차원배열을 활용해서 아래처럼 등급까지 나오는 성적계산 프로그램을 작성
      //(등급조건 : 90(A), 80(B), 70(C), 60(D), F)
		
		int[][] score = {
				{100,100,100,0,0},
				{90,80,70,0,0},
				{85,70,90,0,0},
				{75,82,95,0,0},
				{80,85,70,0,0}
				};
		char grade=' ';
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		
		for(int i=0; i<score.length; i++) {
			int num = i+1;
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
			score[i][4]=score[i][3]/3;
			
			if(score[i][4] >= 90) {
				grade = 'A';
			}else if(score[i][4]>=80) {
				grade = 'B';
			}else if(score[i][4]>=70) {
				grade = 'C';
			}else if(score[i][4]>=60) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			
			System.out.println(num+"\t"+score[i][0]
					+"\t"+score[i][1]+"\t"+score[i][2]+"\t"+score[i][3]+"\t"+score[i][4]
							+"\t"+grade);
		}
		
	}

}
