package command.refactorized.tv;

import command.refactorized.Command;

public class TvShowStatus implements Command {

	private Tv tv;
	
	public TvShowStatus(Tv tv) {
		super();
		
		this.tv = tv;
	}

	@Override
	public void execute() {
		this.tv.printState();
	}
	
}
