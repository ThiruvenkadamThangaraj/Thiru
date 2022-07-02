package com.test.thiru;

public class DemoThreadDemo  {

	public static void main(String[] args) {
		Demothread demothread = new Demothread();
		demothread.setDaemon(true);
		demothread.start();
		for (int i =0;i<100;i++) {
			System.out.println("i am executing the main thread"+i);
		}
	}

}
