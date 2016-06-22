package command.undo.tv;

import command.undo.Command;

public class TvVolumeDown implements Command {


	private Tv tv;
	
	public TvVolumeDown(Tv tv) {
		super();
		
		this.tv = tv;
	}

	@Override
	public void execute() {
		this.tv.volumeDown();
	}

	@Override
	public void undo() {
		this.tv.volumeUp();
	}
	
}
