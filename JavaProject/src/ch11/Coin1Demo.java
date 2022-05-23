package ch11;

public class Coin1Demo implements Coin {
	//>>implements Coin<<을 쓸 수도 있고 안 쓸 수도 있다.
	public static void main(String[] args) {
		//인터페이스의 상수는 Static 영역에 있기 때문에 >>클래스이름.상수이름<<으로 접근 가능하다.
		System.out.println("Dime은 " + Coin.DIME + "센트입니다.");
	}

}
