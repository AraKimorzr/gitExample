package ch03;

public class ConditionEx {
	public static void main(String[] args) {
		int num = -5;
		System.out.println( num>0 ? num: -num); // f ? -num=5
		if(num>0) {
			System.out.println(num);
		}else {
			System.out.println(-num);
		}
	}

}
