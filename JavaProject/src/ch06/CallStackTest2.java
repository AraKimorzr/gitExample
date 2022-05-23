package ch06;

//Method 기본 구조 이해하기(매우중요!!!)

public class CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었습니다.");
		firstMethod();
		System.out.println("main(String[] args)이 끝났습니다.");
	}

	 static void firstMethod() {
		System.out.println("firstMethod()이 시작되었습니다.");
		secondMethod();
		
		System.out.println("firstMethod()이 끝났습니다.");
		
	}

	 static void secondMethod() {
		System.out.println("secondMethod()이 시작되었습니다.");
		System.out.println("secondMethod()이 끝났습니다.");
		
	}

}
