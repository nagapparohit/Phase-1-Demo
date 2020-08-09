package com.simplilearn.threads;

class Counter{
	
	int count;
	
	public synchronized void increaseCount() {
		count++;
	}
}

public class ThreadSafetyDemo {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		Thread t1 = new Thread(()->{
			
			for(int i=1;i<=10;i++) {
				System.out.println("Thread 1 working on counter.");
				counter.increaseCount();
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=1;i<=10;i++) {
				System.out.println("Thread 2 working on counter.");
				counter.increaseCount();
			}
		});
		
		Thread t3 = new Thread(()->{
			for(int i=1;i<=10;i++) {
				System.out.println("Thread 3 working on counter.");
				counter.increaseCount();
			}
		});
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("The count is : "+counter.count);
		
		
		
		
	}
}
