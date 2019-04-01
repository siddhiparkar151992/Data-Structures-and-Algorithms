package goldmansach;

public class PrintSeriesByThreads {
	
	public static void main(String[] arg){
		
		PrintSeriesByThreads p= new PrintSeriesByThreads();
		p.run();
	}
	
	public void run(){
		Printer p = new Printer();
		Thread t1 = new Thread(new Print(p));
		Thread t2 = new Thread(new Print(p));
		t1.start();
		t2.start();
	}
	public class Printer {
		int count = 0;
		boolean incrementer = false;

		public synchronized void generateZero() {
			try {
				while (incrementer) {
					wait();
				}
				System.out.println(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			incrementer = true;
			notifyAll();

		}

		public synchronized void generateCount() {

			try {
				while (!incrementer) {
					wait();
				}
				count++;
				System.out.println(count);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			incrementer = false;
			
			notifyAll();

		}
	}

	public class Print extends Thread {
		Printer p = null;
		Print(Printer p ) {
			this.p = p;
		}
		@Override
		public void run() {
			for (int i = 0; i < 3; i++) {
				p.generateZero();
				p.generateCount();
			}
		}
	}

}
