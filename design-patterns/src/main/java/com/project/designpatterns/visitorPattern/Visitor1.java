package com.project.designpatterns.visitorPattern;

public class Visitor1 implements Visitor {

	@Override
	public void processEditor1(String... strings) {
		System.out.println("Exporting data from Editor 1 ...");
		try {
			Thread.currentThread().sleep(2999);
		} catch(InterruptedException e) {
			e.printStackTrace();
		} finally {
			for(String s: strings) {
				System.out.print(s + ", ");
			}
			System.out.println();
		}
		
		
	}

	@Override
	public void processEditor2(String... strings) {
		System.out.println("Exporting data from Editor 2 ...");
		try {
			Thread.currentThread().sleep(2999);
		} catch(InterruptedException e) {
			e.printStackTrace();
		} finally {
			for(String s: strings) {
				System.out.print(s + ", ");
			}
			System.out.println();
		}		
	}

	@Override
	public void processEditor3(String... strings) {
		System.out.println("Exporting data from Editor 3 ...");
		try {
			Thread.currentThread().sleep(2999);
		} catch(InterruptedException e) {
			e.printStackTrace();
		} finally {
			for(String s: strings) {
				System.out.print(s + ", ");
			}
			System.out.println();
		}		
	}

}
