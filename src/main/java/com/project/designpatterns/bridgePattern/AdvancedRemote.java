package com.project.designpatterns.bridgePattern;

public class AdvancedRemote extends RegularRemote{

	AdvancedRemote(ImplementationLayer impl) {
		super(impl);
	}
	public int muteOrUnmute() {
		return implLayer.muteOrUnmute();
	}

}
