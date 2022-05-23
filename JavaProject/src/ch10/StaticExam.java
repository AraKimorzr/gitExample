package ch10;

//개별적인 값을 사용할 때 => non-static을 사용 ex.)학생들...
//공통적인 값(정해진)을 사용할 때 => static을 사용 ex.)학점 4.0이상, 3.5이상...

public class StaticExam {
	public static void main(String[] args) {//main메소드는 개발자가 직접 메모리에 올릴 수 없기 때문에
		//자동으로 메모리에 올라가기 위해 필연적으로 static을 사용해야 한다.
		int a = 40, b = 30, result;
		result = Math.max(a, b);//둘 중 큰 값
		System.out.println(result);
		result = Math.min(a, b);//둘 중 작은 값
		System.out.println(result);
		System.out.println(Math.sqrt(100));
		double r = 15.3;
		System.out.println("원의 둘레 : "+2*Math.PI*r);
		System.out.println("원의 넓이 : "+Math.PI*r*r);
		
	}

}
