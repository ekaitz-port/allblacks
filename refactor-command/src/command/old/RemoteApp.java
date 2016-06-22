package command.old;

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
		Integer volume = 10;
		Integer program = 1;
		
		String operation = null;
		
		while(!"exit".equals(operation)) {
			System.out.print("Escribe la operación (p+, p-, v+, v-, exit): ");
			operation = readLine();
			
			if("p+".equals(operation)) {
				program++;
				
				if(program >= 100) {
					program = 1;
				}
			}
			
			if("p-".equals(operation)) {
				program--;
				
				if(program <= 0) {
					program = 99;
				}
			}
			
			if("v+".equals(operation)) {
				if(volume < 50) {
					volume++;
				}
			}
			
			if("v-".equals(operation)) {
				if(volume > 0) {
					volume--;
				}
			}
			
			System.out.println("programa: " + program + ", volumen: " + volume);
		}
		
	}
}
