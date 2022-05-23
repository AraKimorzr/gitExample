package ch16;

//메소드 앞에 synchronized를 붙이면 해당 메소드는 객체의 사용권(Monitoring  Lock)을 얻는다
//해당 메소드가 완전히 끝난 이후 다른 메소드가 실행될 수 있다.
//단, wait()메소드를 만나면 대기상태로 들어간다.

public class MusicBox {
	public void playMusicA() {
		for(int i=0; i<10; i++) {
			//메소드의 코드가 길어지면, 마지막에 대기하는 스레드가 너무 오래 기다리는 것을 
			//방치하기 위해서 해당 부분만 synchronized블럭을 사용하기도 한다.
			synchronized(this) {//this:MusicBox객체 자신을 가리킴
				System.out.println("신나는 음악!!!");
			}
			try {
				//1초 이하 쉬면서 반복
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicA()
	
	public synchronized void playMusicB() {
		for(int i=0; i<10; i++) {
			System.out.println("슬픈 음악ㅠㅠㅠ");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicB()
	
	//만약 synchronized를 붙히지 않는 메소드가 있다면 다른 스레드들이 모리터링 락을 
	//획득했다 하더라도, 그것과 상관없이 실행된다.
	public synchronized void playMusicC() {
		for(int i=0; i<10; i++) {
			System.out.println("카페 음악~~~");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicC()

}
