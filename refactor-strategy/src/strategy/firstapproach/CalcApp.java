package strategy.firstapproach;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class CalcApp {

	public CalcApp() {
		super();
	}
	
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
	
	private static Integer readInteger() {
		Integer number = null;
		
		String text = readLine();
		if(text != null) {
			number = new Integer(text);
		}
		
		return number;
	}
	
	public static void main(String[] args) {
		System.out.print("Escribe el primer operando: ");
		Integer number1 = readInteger();
		
		System.out.print("Escribe el segundo operando: ");
		Integer number2 = readInteger();
		
		System.out.print("Escribe la operación (+, -, *, /): ");
		String operator = readLine();
		
		Calculator calculator = new Calculator(number1, number2, operator);
		DecimalFormat df = new DecimalFormat("0.#");
		System.out.println("El resultado es: " + df.format(calculator.result()));
	}
	
}
