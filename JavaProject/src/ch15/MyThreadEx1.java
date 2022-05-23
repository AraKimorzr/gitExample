package ch15;

public class MyThreadEx1 extends Thread {
	public static void main(String[] args) {
		MyThreadEx1 e1 = new MyThreadEx1();
		MyThreadEx1 e2 = new MyThreadEx1();
		MyThreadEx1 e3 = new MyThreadEx1();
		
		e1.setName("스레드1");
		e2.setName("스레드2");
		e3.setName("스레드3");
		System.out.println("스레드1"+e1.getPriority());
		System.out.println("스레드2"+e2.getPriority());
		System.out.println("스레드3"+e3.getPriority());
		
		e1.setPriority(Thread.MAX_PRIORITY);
		e3.setPriority(Thread.MIN_PRIORITY);
		e1.start();
		e2.start();
		e3.start();
		
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
		}
	}

}
