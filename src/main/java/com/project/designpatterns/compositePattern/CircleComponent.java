package com.project.designpatterns.compositePattern;

import java.time.LocalDateTime;

public class CircleComponent extends Components{

	@Override
	public void execute() {
		draw();
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle at " + LocalDateTime.now());
		
	}

}
