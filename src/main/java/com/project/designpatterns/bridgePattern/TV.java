package com.project.designpatterns.bridgePattern;

public class TV implements ImplementationLayer {
	private int vol = 22;
	private int muteVol;
	private int chan = 22;
	private boolean isMute = false;
	
	@Override
	public int getCurrentVolume() {
		return vol;
	}

	@Override
	public int getCurrentChannel() {
		// TODO Auto-generated method stub
		return chan;
	}

	@Override
	public void setVolume(int vol) {
		this.vol = vol;

	}

	@Override
	public void setChannel(int chan) {
		this.chan = chan;

	}

	@Override
	public int muteOrUnmute() {
		if(isMute) {
			vol = muteVol;
		} else {
			muteVol = vol;
			vol = 0;
		}
		isMute = !isMute;
		return vol;
	}

}
