package com.project.designpatterns.flyweightPattern;

// This is an intrinsic property of the bullet.
class BulletType {
	String name; // 1B ==  8bits
	Byte[] bitMap = new Byte[20 * 1024]; // 20KB
	String dimensions;  //  1B ==  8bits
	int particleCount;
	public BulletType(String name, Byte[] bitMap, String dimensions, int particleCount) {
		this.name = name;
		this.bitMap = bitMap;
		this.dimensions = dimensions;
		this.particleCount = particleCount;
	}
}
