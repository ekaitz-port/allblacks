package command.undo;

public class NullCommand implements Command {

	@Override
	public void execute() {
	}
	
	public void undo() {
	}

}
