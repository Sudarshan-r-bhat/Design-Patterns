/*
 ps:
 	build a flyweight pattern application, which will reuse the 
 	commonly objects / most used objects.
 	basically, reduce the size by avoiding unnecessary object creation.
 	
 	 call -> change in state. -> immutable states

	dnc:
		you fire a bullet in a game, and its properties change, like direction, speed, coordinates
*/
package com.project.designpatterns.flyweightPattern;

public class Flyweight {
	
	public static void main(String[] args) {
		
		final int speed = 150; // mph
		int[][] startCordinates = {
				{1, 2},
				{3, 4},
				{2, 3}
		};
		int[][] targetCordinates = {
				{9, 9},
				{9, 9},
				{9, 9}
		};
		
		Game player1 = new Game();
		for(int i = 0; i < targetCordinates.length; i++) {
			player1.fire(startCordinates[i], targetCordinates[i], speed);
		}
	}
}










