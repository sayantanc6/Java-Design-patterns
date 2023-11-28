package designpattern.command;

public class StereoJockeyOffCommand implements Command {
	
	Stereo stereo;


	public StereoJockeyOffCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}



	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
	}
}
