package ch02;

public class Box {
	//사각형의 넓이, 둘레를 구하는 프로그램
	//가로=10.0, 세로=5.0
	//넓이 : 가로x세로
	
	public static void main(String[] args) {
		double widch; //가로
		double hight; //세로
		double area;  //넓이
		double perimeter; //둘레값용
		widch = 10.0; //값을 초기화(할당하다)
		hight = 5.0;
		area = widch*hight; //넓이 계산
		
		System.out.println("사각형의 넓이 : " + area);
		//여기서의 "+"기호는 연결연산자로서 좌, 우의 문자 또는 값을 연결만 해준다.
		perimeter = 2.0*(widch+hight);
		System.out.println("사각형의 둘레 : "+perimeter);
		
		
		
	}

	
}
