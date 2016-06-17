package strategy.refactorized;

import strategy.refactorized.operation.Addition;
import strategy.refactorized.operation.Division;
import strategy.refactorized.operation.Multiplication;
import strategy.refactorized.operation.NullOperation;
import strategy.refactorized.operation.Operation;
import strategy.refactorized.operation.Substraction;

public class Calculator {

	private Integer number1;

	private Integer number2;

	private Operation operation;
	
	public Calculator(Integer number1, Integer number2, String operator) {
		super();
		
		this.number1 = number1;
		this.number2 = number2;
		this.operation = getOperation(operator);
	}
	
	public Double result() {
		return this.operation.perform(this.number1, this.number2);
	}
	
	private Operation getOperation(String operator) {
		if("+".equals(operator)) return new Addition();
		if("-".equals(operator)) return new Substraction();
		if("*".equals(operator)) return new Multiplication();
		if("/".equals(operator)) return new Division();
		
		return new NullOperation();
	}
	
}
