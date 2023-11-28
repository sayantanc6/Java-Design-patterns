package designpattern.command;

public class StereoJockey implements Stereo {

	@Override
	public void on() {
		System.out.println("stereo Jockey ON");
		
	}

	@Override
	public void off() {
		System.out.println("stereo Jockey OFF");
	}
}
