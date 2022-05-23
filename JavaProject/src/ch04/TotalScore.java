package ch04;

import java.util.Scanner;

public class TotalScore {
	public static void main(String[] args) {
		//for, if, switch제어문, scanner 활용
		//국어, 영어, 수학, 총점, 평균, 등급
		int kor;
		int eng;
		int mat;
		int tot;
		double avg;
		String grade="";
		String str="";
		
		Scanner scan = new Scanner(System.in);
		 for(int i=1; i<=3; i++) {
			 System.out.print("국어 : ");
			 kor = scan.nextInt();
			 System.out.print("영어 : ");
			 eng = scan.nextInt();
			 System.out.print("수학 : ");
			 mat = scan.nextInt();
			 System.out.println();
			 
			 tot=kor+eng+mat;
			 avg=tot/3.0;
			 
			 switch((int)(avg/10)) { //double을 int로 변환
				case 10:
				case 9:
					grade = "수";
					break;
				case 8:
					grade = "우";
					break;
				case 7:
					grade = "미";
					break;
				case 6:
					grade = "양";
					break;
				default:
					grade = "가";
				}//end switch 
			 str= str+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade+"\n";
		 } scan.close();
		 
		
		 System.out.println("=============================================");
		 System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		 System.out.println("---------------------------------------------");
		 System.out.println(str);
		 System.out.println("=============================================");
		 
	}

}
