package com.project.designpatterns.objectPoolPattern;

public class EmailTaskExecutor implements Runnable {
	EmailClientPool pool;
	
	public EmailTaskExecutor (EmailClientPool pool) {
		this.pool = pool;
	}
	@Override
	public void run() {
		EmailClient emailClient = pool.borrow();
		try {
			System.out.println("Running on thread = " + Thread.currentThread().getId());
			emailClient.process();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// overriden method will be called
		pool.returnObject(emailClient);
		System.out.println("Returning object from thread = " + Thread.currentThread().getId());
	}

}


