package strategy.firstapproach;

public class Calculator {

	private Integer number1;
	
	private Integer number2;
	
	private String operator;

	public Calculator(Integer number1, Integer number2, String operator) {
		super();
		
		this.number1 = number1;
		this.number2 = number2;
		this.operator = operator;
	}
	
	public Double result() {
		Double result = null;
		
		if("+".equals(this.operator)) {
			result = new Double(this.number1 + this.number2);
		} else if("-".equals(this.operator)) {
			result = new Double(this.number1 - this.number2);
		} else if("*".equals(this.operator)) {
			result = new Double(this.number1 * this.number2);
		} else if("/".equals(this.operator)) {
			result = new Double(this.number1 / this.number2);
		} else {
			result = new Double(0);
		}
		
		return result;
	}
	
}
