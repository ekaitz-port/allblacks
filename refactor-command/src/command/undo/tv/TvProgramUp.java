package command.undo.tv;

import command.undo.Command;

public class TvProgramUp implements Command {


	private Tv tv;
	
	public TvProgramUp(Tv tv) {
		super();
		
		this.tv = tv;
	}

	@Override
	public void execute() {
		this.tv.programUp();
	}

	@Override
	public void undo() {
		this.tv.programDown();
	}
	
}
