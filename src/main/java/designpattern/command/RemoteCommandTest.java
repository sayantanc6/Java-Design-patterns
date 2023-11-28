package designpattern.command;

public class RemoteCommandTest  {
	
	public static void main(String[] args) {
		CompositeCommand compositeCommand = new CompositeCommand();
		compositeCommand.addCommand(new StereoDVDOffCommand(new StereoDVD()))
		.addCommand( new StereoDVDOnCommand(new StereoDVD()))
		.undoCommand(new StereoDVDOnCommand(new StereoDVD()))
		.addCommand(new StereoJockeyOffCommand(new StereoJockey()))
		.addCommand( new StereoJockeyOnCommand(new StereoJockey()))
		.execute();
	}
}
