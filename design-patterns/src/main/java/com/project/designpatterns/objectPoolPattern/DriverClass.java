package com.project.designpatterns.objectPoolPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DriverClass {
	
	public static void main(String[] args) {
		
		EmailClientPool pool = EmailClientPool.getPool(12, 18, 3);	
		
		// Mocking Realtime scenario by, spawning multiple threads.
		ExecutorService executorService = Executors.newFixedThreadPool(8);
		
		executorService.execute(new EmailTaskExecutor(pool));
		executorService.execute(new EmailTaskExecutor(pool));
		executorService.execute(new EmailTaskExecutor(pool));
		executorService.execute(new EmailTaskExecutor(pool));
		executorService.execute(new EmailTaskExecutor(pool));
		executorService.execute(new EmailTaskExecutor(pool));
		executorService.execute(new EmailTaskExecutor(pool));
		executorService.execute(new EmailTaskExecutor(pool));
		executorService.execute(new EmailTaskExecutor(pool));
		executorService.execute(new EmailTaskExecutor(pool));
		executorService.execute(new EmailTaskExecutor(pool));
		
		pool.shutdown();
		executorService.shutdown();
		try {
			executorService.awaitTermination(20, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
