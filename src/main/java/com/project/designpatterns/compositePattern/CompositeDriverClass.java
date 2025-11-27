package com.project.designpatterns.compositePattern;

public class CompositeDriverClass {
	
	public static void main(String[] args) {
		GraphicToolbox gc = new GraphicToolbox();
		
		gc.addGraphic(new CircleComponent());
		GraphicToolbox gc1 = new GraphicToolbox();
		gc1.addGraphic(new SquareComponent());
		gc1.addGraphic(new CircleComponent());
		gc.addGraphic(gc1);
		
		gc.execute();
	}
}
