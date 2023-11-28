package designpattern.command;

public class StereoDVDOffCommand implements Command {
	
	Stereo stereo;

	public StereoDVDOffCommand(Stereo stereo) {
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
