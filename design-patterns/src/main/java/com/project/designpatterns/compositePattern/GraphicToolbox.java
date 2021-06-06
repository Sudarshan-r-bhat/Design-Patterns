package com.project.designpatterns.compositePattern;

import java.util.ArrayList;

public class GraphicToolbox implements Graphics {
	
	private ArrayList<Graphics> toolBoxAndComponents;
	
	GraphicToolbox() {
		toolBoxAndComponents = new ArrayList<>();
	}
	
	public void addGraphic(Graphics graph) {
		toolBoxAndComponents.add(graph);
	}
	@Override
	public void execute() {
		
		for(int i = 0; i < toolBoxAndComponents.size(); i++) {
			Graphics g = toolBoxAndComponents.get(i);
			g.execute();
		}
	}

}
