package ch16;

//데몬스레드는 보통 유닉스나 리눅스 운영체제에서 백그라운드로 동작하는 프로그램을 말한다.
//데몬스레드는 스레드에 데몬설정을 해서 쓴다. 윈도우에서는 서비스라고도 한다.
//데몬스레드는 일반스레드가 모두 종료되면 강제적으로 종료되는 특징을 가졌다.

public class DaemonThread implements Runnable {
	
	@Override
	public void run() {
		while(true) {//무한반복이지만 main thread가 종료되면 자동종료가 됨
			System.out.println("데몬 스레드가 실행중입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break; //Exception 발생 시 while문 빠져나가도록
			}
		}//end while
		
	}//end run
	
	public static void main(String[] args) {
		Thread th = new Thread(new DaemonThread());
		//데몬스레드로 설정
		th.setDaemon(true);
		th.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 스레드가 종료됩니다.");
		
	}

}
