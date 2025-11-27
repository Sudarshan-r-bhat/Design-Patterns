package com.project.designpatterns.bridgePattern;

public class AbstractionLayer {
	protected ImplementationLayer implLayer;
	AbstractionLayer(ImplementationLayer impl) {
		implLayer = impl;
	}
	public String deviceInfo() {
		StringBuilder builder = new StringBuilder();
		builder.append(implLayer.getClass().getSimpleName());
		builder.append("\n");
		builder.append("channel = " + implLayer.getCurrentChannel());
		builder.append("\n");
		builder.append("volume = " + implLayer.getCurrentVolume());
		builder.append("\n");
		return builder.toString();
	}
}
