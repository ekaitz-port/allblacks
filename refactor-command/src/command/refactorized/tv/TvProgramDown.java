package command.refactorized.tv;

import command.refactorized.Command;

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
	
}
