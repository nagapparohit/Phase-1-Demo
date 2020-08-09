package com.simplilearn.threads;

public class ThreadDemo extends Thread{


	@Override
	public void run() {
		System.out.println("ThreadDemo is running!!!!");
	}

	public static void main(String[] args) {

		ThreadDemo t1 = new ThreadDemo();
		t1.start();

	}
}
