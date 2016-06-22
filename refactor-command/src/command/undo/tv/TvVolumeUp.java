package command.undo.tv;

import command.undo.Command;

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

	@Override
	public void undo() {
		this.tv.volumeDown();
	}
	
}
