package rpnCalculator;

public class AdditionOperation implements Operation {

	public Double calculate(Double... no) {
		Double firstOp = no[0];
		Double secondOp = no[1];
		return secondOp + firstOp;
	}

}
