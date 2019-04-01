package goldmansach;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintThreadSeries {

	public static class Counter {
		int count = 1;
		boolean even = false;

		public void increment() {
			try {
				wait();

				System.out.println(count);
				count++;

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			even = true;
			notifyAll();
		}
	}

	Counter counter = new Counter();
	
	static int count = 1;
	static Lock lock = new ReentrantLock();
	public static class MyThread extends Thread {
		String name = "one";
		public boolean zero = true;
		public boolean even = false;

	

		@Override
		public void run() {
			while (count < 7) {
				lock.lock();
				if (this.name.equals("one") && zero ) {
					System.out.println(0);
					zero = false;
					
					this.name= !even ? "two" : "three";
				} else if (this.name.equals("two")) {
					System.out.println(count);
					count++;
					zero = true;
					even = true;
					this.name ="one";
				} else if(this.name.equals("three")){
					System.out.println(count);
					count++;
					even = false;
					zero = true;
					this.name ="one";
				}
				lock.unlock();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThreadSeries.Counter c = new PrintThreadSeries.Counter();
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}

}
