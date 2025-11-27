package com.project.designpatterns.flyweightPattern;

public class Game {
	
	public void fire(int[] startCoord, int[] targCoord, int speed) {
		
		String[] names = {"9mm", "45pc", "7mm"}; // TODO: This needs to change.
		String[] colors = {"copper", "golden", "titanium"};
		String[] dimensions = {"9mm", "45pc", "7mm"};
		
		int index = (int)(Math.random() * 3);
		
		String name = names[index];
		String color = colors[index];
		String dimension = dimensions[index];
		
		BulletType type = BulletFactory.getBullet(name, color, dimension);
		String s = String.format("%s bullet is fired from xy= %s  to xy=%s", name, startCoord[0] + ", " + startCoord[1]
				, targCoord[0] + ", " + targCoord[1]);
		System.out.println(s);
	}
	
}