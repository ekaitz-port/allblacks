package command.refactorized.Tv;

import command.refactorized.Command;

public class TvVolumeDown implements Command {


	private Tv tv;
	
	public TvVolumeDown(Tv tv) {
		super();
		
		this.tv = tv;
	}

	@Override
	public void execute() {
		this.tv.printState();
	}
	
}
