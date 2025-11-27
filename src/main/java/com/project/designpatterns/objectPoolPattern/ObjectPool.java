package com.project.designpatterns.objectPoolPattern;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class ObjectPool <T> {
	
	private ConcurrentLinkedQueue<T> poolQueue;
	// The Executors[Executor, ExecutorService, ScheduledExecutorService] 
	// probably use abstract factory pattern. hence its difficult to find the 
	// appropriate variable type.
	private ScheduledExecutorService scheduledService;
	
	public ObjectPool(final int minSize) {
		initialize(minSize);
	}
	
	public ObjectPool(final int minSize, final int maxSize, final long scheduleInterval) {
		
		initialize(minSize);
		scheduledService = Executors.newSingleThreadScheduledExecutor();
		
		// use lambda's here.
		scheduledService.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				
				// TODO:
				if(poolQueue.size() < minSize) {
					int toAdd = minSize + poolQueue.size();
					for(int i = 0; i < toAdd; i++) {
						poolQueue.add(createObject());
					}
				}
				if(poolQueue.size() > maxSize) {
					int toRemove = poolQueue.size() - maxSize;
					for(int i = 0; i < toRemove; i++) {
						poolQueue.poll();
					}
				}
			}
			
		}, maxSize, 2, TimeUnit.SECONDS);
	}
	
	public abstract T createObject();
	public T borrow() {
		T t;
		if((t = poolQueue.poll()) == null) {
			return createObject();
		}
		System.out.println("CURRENT POOL SIZE = " + poolQueue.size());
		return t;
	}
	public void returnObject(T obj) {
		if(obj != null) 
			poolQueue.add(obj);
	}
	private final void initialize(final int minSize) {
		poolQueue = new ConcurrentLinkedQueue<>();
		for(int i = 0; i < minSize; i++) {
			poolQueue.add(this.createObject());
		}
	}
	public void shutdown() {
		if(scheduledService != null)
			scheduledService.shutdown();
	}

}
