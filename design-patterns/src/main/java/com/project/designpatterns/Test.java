package com.project.designpatterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		LinkedList<String> ll = new LinkedList<>();
		Iterator<String> i = ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
