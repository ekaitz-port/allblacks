package command.undo.tv;

import command.undo.Command;

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

	@Override
	public void undo() {
	}
	
}
