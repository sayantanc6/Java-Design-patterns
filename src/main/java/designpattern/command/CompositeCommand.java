package designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
	
	List<Command> commands = new ArrayList<Command>();
	List<Command> undoCommands = new ArrayList<Command>();

	CompositeCommand() {} 

	@Override
	public void execute() {
		for (Command command : commands) 
			command.execute();
		for (Command command : undoCommands) 
			command.undo();
		}
	
	public CompositeCommand addCommand(Command command) {
				commands.add(command);		
				return  this;
	}
	
	public CompositeCommand undoCommand(Command command) {
		undoCommands.add(command);		
		return this;
	}

	@Override
	public void undo() {}

}
