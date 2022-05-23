package ch04;

public class while2 {
	public static void main(String[] args) {
		int i=1;
		int num=10;
		int sum=0;
		while(i<=num) {
			sum=sum+i; //sum += i
			i++; //증감식
			//sum += i++; 이렇게도 표현 가능
		}
		System.out.println("1~"+num+"까지의 합계 : "+sum);
	}

}
