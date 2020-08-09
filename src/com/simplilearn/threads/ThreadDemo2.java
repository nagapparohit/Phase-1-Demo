package com.simplilearn.threads;


class Ram extends Thread{

	@Override
	public void run() {

		for(int i=0;i<5;i++) {

			System.out.println("Ram say Hi!!"+(i+1));
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

class Sham extends Thread{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {

			System.out.println("Sham say Hello!!"+(i+1));
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}


public class ThreadDemo2 {

	public static void main(String[] args) {
		
		Ram t1 = new Ram();
		Sham t2 = new Sham();
		
		t1.start();
		t2.start();
	}

}
