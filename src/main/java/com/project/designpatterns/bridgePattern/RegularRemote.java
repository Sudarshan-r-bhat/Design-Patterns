package com.project.designpatterns.bridgePattern;

public class RegularRemote extends AbstractionLayer {

	RegularRemote(ImplementationLayer impl) {
		super(impl);
	}
	
	public int getCurrentVol() {
		return implLayer.getCurrentVolume();
	}
	public int getCurrentChannel() {
		return implLayer.getCurrentChannel();
	}
	public int increaseVolume() {
		int incVol = implLayer.getCurrentVolume() + 1;
		implLayer.setVolume(incVol);
		return incVol;
	}
	public int reduceVolume() {
		int decVol = implLayer.getCurrentVolume() - 1;
		implLayer.setVolume(decVol);
		return decVol;
	}
	public int channelUp() {
		int incChannel = implLayer.getCurrentChannel() + 1;
		implLayer.setChannel(incChannel);
		return incChannel;
	}
	public int channelDown() {
		int decChannel = implLayer.getCurrentChannel() - 1;
		implLayer.setChannel(decChannel);
		return decChannel;
	}

}
