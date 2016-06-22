package command.refactorized.tv;

import command.refactorized.Command;

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
	
}
