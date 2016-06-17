package strategy.refactorized.operation;

public class Addition implements Operation {

	@Override
	public Double perform(Integer number1, Integer number2) {
		return new Double(number1 + number2);
	}

}
