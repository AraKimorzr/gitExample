package ch06;

// MothodEx1파일을 응용해서 좀 더 간결하게 만들기

//메소드를 사용하면 얻을 수 있는 장점 : 
//1)중복 코드를 줄이고 재사용할 수 있다. 
//2)모듈화해 가독성을 높이고 길이를 줄일 수 있다? (제대로 못씀)
public class MethodEx2 {//메소드를 사용
	//메소드의 위치는 main아래나 위나 상관 없음
	public static void main(String[] args) {
		System.out.println("합(1~10) : "+sum(1,10));
		System.out.println("합(10~100) : "+sum(10,100));
		System.out.println("합(100~1000) : "+sum(100,1000));
	}

	public static int sum(int a, int b) {
		int sum=0;
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		return sum;
	}//end sum()

}
