package command.refactorized.Tv;

public class Tv {

	private Integer volume;
	
	private Integer program;
	
	public Tv() {
		super();
		
		this.volume = 10;
		this.program = 1;
	}
	
	public void programUp() {
		this.program++;
		
		if(this.program >= 100) {
			this.program = 1;
		}
	}
	
	public void programDown() {
		this.program--;
		
		if(this.program <= 0) {
			this.program = 99;
		}
	}
	
	public void volumeUp() {
		if(this.volume >= 50) return;
		
		this.volume++;
	}
	
	public void volumeDown() {
		if(volume <= 0) return;
		
		this.volume--;
	}
	
	public void printState() {
		System.out.println("programa: " + this.program + ", volumen: " + this.volume);
	}
	
}
