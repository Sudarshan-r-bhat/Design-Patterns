package com.project.designpatterns.compositePattern;

import java.time.LocalDateTime;

public class SquareComponent extends Components{

	@Override
	public void execute() {
		draw();
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing square at " + LocalDateTime.now());
		
	}

}
