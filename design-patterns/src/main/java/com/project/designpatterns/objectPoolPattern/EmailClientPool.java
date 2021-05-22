package com.project.designpatterns.objectPoolPattern;

// This is a thread safe Singleton ObjectPool.
public class EmailClientPool extends ObjectPool{
	private volatile static EmailClientPool emailClientPool;
	
	private EmailClientPool(final int minSize) {
		super(minSize);
		// TODO Auto-generated constructor stub
	}
	private EmailClientPool(final int min, final int max, final int interval) {
		super(min, max, interval);
	}

	@Override
	public EmailClient createObject() {
		return new EmailClient();
	}
	public synchronized static EmailClientPool getPool(int min, int max, int interval) {
		if(emailClientPool == null) {
			emailClientPool = new EmailClientPool(min, max, interval);
		}
		return emailClientPool;
	}
	public synchronized static EmailClientPool getPool(int min) {
		if(emailClientPool == null) {
			emailClientPool = new EmailClientPool(min);
		}
		return emailClientPool;
	}
	@Override
	public synchronized EmailClient borrow() {
		return (EmailClient) super.borrow();
	}
	public synchronized void returnObject(EmailClient client) {
		super.returnObject(client);
	}
	@Override
	public synchronized void shutdown() {
		 super.shutdown();
	}
}
