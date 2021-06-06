package com.project.designpatterns.bridgePattern;

public interface ImplementationLayer {
	public int getCurrentVolume();
	public int getCurrentChannel();
	public void setVolume(int vol);
	public void setChannel(int chan);
	public int muteOrUnmute();
	
}
