package rpnCalculator;

public class FactorialOperation implements Operation {

	public Double calculate(Double... no) {
		Double firstOp = no[0];
		 int i;
		 Double fact=1.0;
		  int number=firstOp.intValue();//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }
		return fact;
	}
}
