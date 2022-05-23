package ch13;

//Wrapper class : 기본자료형을 포장하는 클래스
//기본자료형에 대한 다양한 method를 지원
//byte Byte
//short Short
//int Integer
//long Long
//float Float
//double Double
//char Character
//boolean Boolean

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1=10;
		Integer i2=new Integer(20);//auto boxing
		int num1=i1.intValue();
		int num2=i2;//auto unboxing(객체로 포장된 value를 꺼내는 작업)
		int sum=num1+num2;
		System.out.println(sum);
		
		//2진수로 문자열 변환
		System.out.println(Integer.toBinaryString(sum));
		
		//8진수로 문자열 변환
		System.out.println(Integer.toOctalString(sum));
		
		//16진수로 문자열 변환
		System.out.println(Integer.toHexString(sum));
		
		//정수의 최대값
		System.out.println(Integer.MAX_VALUE);
		
		//정수의 최소값
		System.out.println(Integer.MIN_VALUE);
		
		//문자열을 정수로 변환
		System.out.println(Integer.parseInt("100"));
		
		//정수를 문자열로 변환( 100=>"100")
		System.out.println(Integer.toString(100));
		
		//문자열 100으로 변환시키는 법(""+숫자)
		System.out.println(100+"");
	}

}
