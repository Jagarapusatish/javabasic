package Threads;
public class ThreadEx_7_Join extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}

	public static void main(String args[]) {
		ThreadEx_7_Join t1 = new ThreadEx_7_Join();
		ThreadEx_7_Join t2 = new ThreadEx_7_Join();
		ThreadEx_7_Join t3 = new ThreadEx_7_Join();
		t1.setName("First");
		t2.setName("Second");
		t3.setName("Third");

		
		
		t2.start();
		
		try {
			//t2.join(2000);
			t2.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		t1.start();
		t3.start();
		
		
		//t1.start();
		//System.out.println("t1 run");
		//t2.start();
		//System.out.println("t2 run");
		
		//System.out.println("t3 run");
	}
}