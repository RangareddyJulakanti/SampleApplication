package com.multithreading;

public class ThreadEvenOddNumberExample {
	public static void main(String[] args) {
		int maxNumber = 50;

		NumberPrinter printer = new NumberPrinter();
		new Thread(new EvenNumGenerator(printer, maxNumber)).start();
		new Thread(new OddNumGenerator(printer, maxNumber)).start();
	}

}
class NumberPrinter {

	// To check if even number is printed or not.
	private boolean isEvenNumPrinted = true;

	public void printOdd(int number) throws InterruptedException {
		// Get a lock on NumberPrinter
		synchronized (this) 
		{
			// Wait until even is not printed.
			if (!isEvenNumPrinted)
				this.wait();//immediately relase the lock of the printer object and goes to waiting state and waits for next notification

			System.out.println(number);
			isEvenNumPrinted = false;

			// Notify the other waiting thread which is waiting on
			// NumberPrinter
			// Other thread will get out of waiting state
			notify();
		}
	}

	public void printEven(int number) throws InterruptedException {
		synchronized (this) {
			if (isEvenNumPrinted)
				this.wait();//current running thread Immediately realse the lock and goto waiting state

			System.out.println(number);
			isEvenNumPrinted = true;
			this.notify();
		}
	}
}

class OddNumGenerator implements Runnable {
	private NumberPrinter q;
	private int max;

	public OddNumGenerator(NumberPrinter q, int max) {
		this.q = q;
		this.max = max;
	}

	@Override
	public void run() {
		for (int i = 1; i < max; i = i + 2) {
			try {
				q.printOdd(i);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}

class EvenNumGenerator implements Runnable {
	private NumberPrinter printer;
	private int max;

	public EvenNumGenerator(NumberPrinter printer, int max) {
		this.printer = printer;
		this.max = max;
	}

	@Override
	public void run() {
		for (int i = 2; i <= max; i = i + 2) {
			try {
				printer.printEven(i);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}