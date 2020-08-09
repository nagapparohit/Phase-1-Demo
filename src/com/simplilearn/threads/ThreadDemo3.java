package com.simplilearn.threads;


class Krishna{
	
	public void show() {
		System.out.println("I am krishan!!!");
	}
}

class Ramu extends Krishna implements Runnable{
	
	
	private Thread referenceThread;

	@Override
	public void run() {
		
			if(referenceThread!=null) {
				try {
					referenceThread.join();
				} catch (InterruptedException e) {
					
				}
			}
			
			for(int i=0;i<5;i++) {
				
				System.out.println("Ramu says Hi!!!");
				
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
	}
	
	public void setReferenceThread(Thread referenceThread) {
		this.referenceThread = referenceThread;
	}
	
}

class Shamu implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Shamu says Hello!!");
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadDemo3 {

	public static void main(String[] args) {
		
		Ramu obj1 = new Ramu();
		Runnable obj2 = new Shamu();
		
		Thread t1= new Thread(obj1);
		
		Thread t2 = new Thread(obj2);
		

		t2.start();
		t1.start();
		

		//to join t2 with t1
		obj1.setReferenceThread(t2);

		
		
		try {
			//t1 joins the  main thread.
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hello from main thread!!");
		
		
	}
}
