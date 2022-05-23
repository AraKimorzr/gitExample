package ch07;

public class Television {
	//멤버 변수(전역변수)
	int channel; //채널번호 7 , 5 ,11
	int volume; //소리 크기 9 , 12
	boolean onoff; //전원상태 true
	
	//TelevisionTest3에 활용
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
	
	
	//TelevisionTest5에 활용
	int getChannel() {
		return channel;
	}
	void setChannel(int ch) { //ch=11
		channel = ch; //멤버변수=로컬변수 ,ch값이 channel에 들어가서 적용됨
	}
	
	

}
