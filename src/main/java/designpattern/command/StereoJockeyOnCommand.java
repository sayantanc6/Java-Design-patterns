package designpattern.command;

public class StereoJockeyOnCommand implements Command {
	
	Stereo stereo;

	public StereoJockeyOnCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
	}
	
	@Override
	public void undo() {
		stereo.off();
	}
}
