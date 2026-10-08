package _27_Threads;

// Creating Threads by implementing Runnable interface. (Recommended)

class MyTask implements Runnable{
	@Override
	public void run() {
		System.out.println("Runnable Thread is Running..");
	}
}

public class _02_RunnableThread {
	public static void main(String[] args) {
		
		Thread t2 = new Thread(new MyTask());
		t2.start();
		System.out.println(t2.getName());
	}
}
