package ch13;

public class AutoBox {
	public static void main(String[] args) {
		//기본자료형
		int num1=10;
		int num2;
		
		//객체자료형
		Integer i1;//객체참조변수(주소값 저장),아직은 선언만 했기 때문에 i1의 실제 값은 null상태
		Integer i2 = new Integer(20);//auto boxing(기본자료형을 객체로 박스 처리)
		
		i1=num1;
		num2=i2;//auto unboxing(객체 안에 들어있는 값을 풀어서 저장)
		System.out.println(num1+","+i1);
		System.out.println(num2+","+i2);
	}

}
