package designpattern.command;

public class StereoDVDOnCommand implements Command {
	
	Stereo stereo;

	public StereoDVDOnCommand(Stereo stereo) {
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
