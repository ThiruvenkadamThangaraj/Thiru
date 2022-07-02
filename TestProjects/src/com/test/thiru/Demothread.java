package com.test.thiru;

public class Demothread extends Thread {
	
	@Override
	public void run() {
		for (int i =0;i<=100;i++) {
			System.out.println("I am a child thread "+i);
			System.out.println("I am a demon thread "+Thread.currentThread().isDaemon());
		}
	}

}
