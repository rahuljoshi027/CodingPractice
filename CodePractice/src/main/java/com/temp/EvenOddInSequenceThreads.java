package com.temp;

import java.util.concurrent.Semaphore;

public class EvenOddInSequenceThreads {

	public static void main(String[] args) {
		
		Boolean flag = true;
		Semaphore s = new Semaphore(1);
		String num = new String("even");
		
		PrintEvenOdd t = new PrintEvenOdd();
		Thread t1 = new Thread(t,"even");
		Thread t2 = new Thread(t,"odd");
		t1.start();
		t2.start();
	}

}

class PrintEvenOdd implements Runnable{

	Boolean flag;
	Semaphore s;
	String num = "even";
	int i =0;
	
	
	public synchronized void run() {
		
		switch(num){
		case "even":
			while(i<=10) {
			while(num.equals("odd"))
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(" "+i);
			i=i++;
			num="odd";
			notify();
			}	
			
		case "odd":
			while(i<10) {
				while(num.equals("even"))
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println(" "+i);
				i++;
				num="even";
				notify();
				
			}
		}
	}
}


class PrintOdd implements Runnable {
	Boolean flag;
	Semaphore s;
	String odd;
	PrintOdd(){}
	PrintOdd(String o){
		odd = o;
	}
	
	public void run() {
		int i =1;
		while(i<10) {
		synchronized (this) {
		
			while(odd.equals("even"))
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(" "+i);
			i=i+2;
			odd="even";
			notifyAll();
		}
		
		}
	}
}