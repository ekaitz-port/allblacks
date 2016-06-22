package command.undo.tv;

import command.undo.Command;

public class TvProgramDown implements Command {

	private Tv tv;
	
	public TvProgramDown(Tv tv) {
		super();
		
		this.tv = tv;
	}

	@Override
	public void execute() {
		this.tv.programDown();
	}

	@Override
	public void undo() {
		this.tv.programUp();
	}
	
}
