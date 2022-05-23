package ch05;

public class ArrayTest2 {
	public static void main(String[] args) {
		int sum=0;
		float average=0f; //평균, float은 처리할때 f붙이기
		int[] score = {100,88,100,100,90};
		for(int i=0; i<score.length; i++) { //score.length:문자개수
			sum += score[i]; //sum=sum+score[i]
		}
		average = (float)sum / score.length;
		System.out.println("총점 : "+sum );
		System.out.println("평균 : "+average);
	}

}
