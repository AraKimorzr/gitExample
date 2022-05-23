package ch07;

public class TelevisionTest4 {
	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel = 24;
		myTv.volume = 30;
		myTv.onoff = true;
		int ch = myTv.getChannel();
		String onoff = myTv.onoff == true ? "켜져" : "꺼져";
		System.out.println("현재 채널은 " + ch + "이고 볼륨은 " + myTv.volume 
				+ "이고 Tv는 " + onoff + "있습니다.");
		
	}
 
}
