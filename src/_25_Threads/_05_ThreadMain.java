package _25_Threads;  // 13/08/2026

class thread01 extends Thread {
	
	@Override
	public synchronized void run() {
		for (int i = 0; i<=5; i++) {
			System.out.println("i--> "+i);
		}
	}
}

public class _05_ThreadMain {
	public static void main(String[] args) {
		thread01 t3 = new thread01();
		thread01 t4 = new thread01();
		
		t3.start();
		t4.start();
	}

}
