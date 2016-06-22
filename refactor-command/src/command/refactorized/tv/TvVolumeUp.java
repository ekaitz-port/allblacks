package command.refactorized.tv;

import command.refactorized.Command;

public class TvVolumeUp implements Command {

	private Tv tv;
	
	public TvVolumeUp(Tv tv) {
		super();
		
		this.tv = tv;
	}

	@Override
	public void execute() {
		this.tv.volumeUp();
	}
	
}
