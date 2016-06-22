package command.firstapproach;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RemoteApp {

	private static String readLine() {
		String text = null;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			text = br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return text;
	}
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		
		// manage TV
		
		String operation = null;
		while(!"exit".equals(operation)) {
			System.out.print("Escribe la operación (p+, p-, v+, v-, exit): ");
			operation = readLine();
			
			if("p+".equals(operation)) {
				tv.programUp();
			}
			
			if("p-".equals(operation)) {
				tv.programDown();
			}
			
			if("v+".equals(operation)) {
				tv.volumeUp();
			}
			
			if("v-".equals(operation)) {
				tv.volumeDown();
			}
			
			tv.printState();
		}
		
		// manage HiFi
	}
}
