package rpnCalculator;

public class Factory {

	public Operation getOperationClass(String operator){
		if (operator.equals("+")){
			return new AdditionOperation();
		}else if (operator.equals("-")){
			return new SubtractionOperation();
		}else if (operator.equals("*")){
			return new MultiplicationOperation();
		}else if (operator.equals("/")){
			return new DivisionOperation();
		}else if (operator.equals("^")){
			return new PowerOperation();
		}else if (operator.equals("!")){
			return new FactorialOperation();
		}else{
			return new AdditionOperation();
		}
	}
}
