package com.project.designpatterns.singletonMultiThreaded;

public class SingletonMultiThreaded implements Runnable {
	
	private volatile static SingletonMultiThreaded instance;
	
	private SingletonMultiThreaded() {
		System.out.println("Instance Created");
	}
	
	public static synchronized SingletonMultiThreaded getInstance() {
		
		if(instance == null) {
			instance = new SingletonMultiThreaded();
			return instance;
		}
		return instance;
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(SingletonMultiThreaded.getInstance());
		Thread t2 = new Thread(SingletonMultiThreaded.getInstance());
		
		t1.setName("Thread 1");
		t1.start();
		
		t2.setName("Thread 2");
		t2.start();
	}
	
	@Override
	public void run() {
		System.out.println("Thread running..." + Thread.currentThread().getName());
	}
}
