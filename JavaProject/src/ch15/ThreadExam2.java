package ch15;

public class ThreadExam2 {
	public static void main(String[] args) {
		MyThread2 r1 = new MyThread2("*");
		MyThread2 r2 = new MyThread2("-");
		
		//Runnable 사용했기 때문에 스레드 별도로 생성해줘야 함
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		System.out.print("!!!!!");
		
	}

}
