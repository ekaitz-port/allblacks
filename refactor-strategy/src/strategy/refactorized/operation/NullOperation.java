package strategy.refactorized.operation;

public class NullOperation implements Operation {

	@Override
	public Double perform(Integer number1, Integer number2) {
		return new Double(0);
	}

}
