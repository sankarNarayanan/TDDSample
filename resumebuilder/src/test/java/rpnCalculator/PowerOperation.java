package rpnCalculator;

public class PowerOperation implements Operation {
	
	public Double calculate(Double... no) {
		Double firstOp = no[0];
		Double secondOp = no[1];
		return Math.pow(secondOp,firstOp);
	}

}