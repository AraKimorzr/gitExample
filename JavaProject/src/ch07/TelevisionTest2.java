package ch07;

public class TelevisionTest2 {
	public static void main(String[] args) {
		Television myTv = new Television();//객체생성
		System.out.println(myTv);//메모리 주소값 출력(헤쉬코드)
		myTv.channel = 9;
		myTv.volume = 20;
		myTv.onoff =  true;
		System.out.println("나의 TV 채널은 " + myTv.channel 
				+ "이고 볼륨은 " + myTv.volume + "입니다.");
		
		//객체는 복제되지만 참조변수를 다르게 해야하며 
		Television yourTv =  new Television(); //객체생성
		System.out.println(yourTv);
		yourTv.channel = 11;
		yourTv.volume = 15;
		yourTv.onoff = false;
		System.out.println("너의 TV 채널은 " + yourTv.channel 
				+ "이고 볼륨은 " + yourTv.volume + "입니다.");
	}

}
