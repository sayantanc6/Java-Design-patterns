package designpattern.command;

public class StereoDVD implements Stereo {

	@Override
	public void on() {
		System.out.println("stereo DVD ON");
		
	}

	@Override
	public void off() {
		System.out.println("stereo DVD OFF");
	}
}

