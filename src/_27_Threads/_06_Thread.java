package _27_Threads;

class Shared extends Thread {
	@Override
	public synchronized void run() {
		System.out.println("Thread is Running..");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread Started Again..");
	}
	
	public synchronized void wakeup() {
		System.out.println("Sending Notification to");
		notify();
	}
}

public class _06_Thread {
	public static void main(String[] args) {
		Shared s = new Shared();
		s.start();
//		s.sleep(2000);
		s.wakeup();
	}

}
