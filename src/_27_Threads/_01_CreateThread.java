package _27_Threads;

// Creating Threads by extending Thread Class.

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread is Running..");
	}
}

public class _01_CreateThread {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.start();  // starts a new thread.
		System.out.println(t1.getName());
	}
}
