package rpnCalculator;
import java.util.Stack;
public class RpnCalculator {
	Stack<Double> currentStack = new Stack<Double>();
	Boolean validExpression = true;	
	public Double performOperationForExpression(String expression){
		String[] splitStrings = expression.split("\\,");
			for (int i=0; i < splitStrings.length; i++){
				try{
				Double number = Double.parseDouble(splitStrings[i]);
				currentStack.push(number);
				}catch(NumberFormatException e){
					String operator = splitStrings[i];
					if(!this.getResultForOperator(operator)){
						this.validExpression = false;
					}
				}
			}
			if (!currentStack.isEmpty() && this.validExpression == true){
				return (Double)currentStack.pop();
			}else{
				return null;
			}
	}
	public Boolean getResultForOperator(String operator){
		Factory factory = new Factory();
		Operation operation = factory.getOperationClass(operator);
		Double result = 0.0;
		if(currentStack.size() > 1){
			Double firstOp = (Double) currentStack.pop();
			Double secondOp = (Double) currentStack.pop();
			result = operation.calculate(firstOp, secondOp);
			currentStack.push(result);
			return true;
		}else if(currentStack.size() > 0){
			Double firstOp = (Double) currentStack.pop();
			result = operation.calculate(firstOp);
			currentStack.push(result);
			return true;
		}
		return false;
	}
}