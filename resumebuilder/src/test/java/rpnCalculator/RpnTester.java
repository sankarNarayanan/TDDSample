package rpnCalculator;

import junit.framework.TestCase;

public class RpnTester extends TestCase	 {
	
	
	public void testcase1(){
		this.performTest("2,3,6,+,+", 11.0);
	}
	
	public void testcase2(){
		this.performTest("2,3,6,7,-,-,-", -2.0);
	}
	
	public void testcase3(){
		this.performTest("2,3,6,*,*", 36.0);
	}
	
	public void testcase4(){
		this.performTest("2,3,6,/,/", 4.0);
	}
	
	public void testcase5(){
		this.performTest("2,3,6,2,3,6,/,/", 4.0);
	}
	
	public void testcase6(){
		this.performTest("2,3,^", 8.0);
	}
	
	public void testcase7(){
		this.performTest("2,3,2,^,^", 512.0);
	}
	
	public void testcase8(){
		this.performTest("2,3,2,1,^,^,^", 512.0);
	}
	
	public void testcase9(){
		this.performTest("2,3,6,8,10,/,/,+,+", 12.5);
	}
	
	public void testcase10(){
		this.performTest("2,3,+,8,+,10,+", 23.0);
	}
	
	public void testcase11(){
		this.performTest("2,3,+,8,+,10,+,10,-", 13.0);
		this.performTest("+",0.0);
	}
	
	public void testcase12(){
		this.performTest("+",0.0);
	}
	
	public void testcase13(){
		this.performTest("2,!",2.0);
	}
	
	public void performTest(String expression, Double eResult){
		RpnCalculator rpcCalc = new RpnCalculator();
		Double aResult = rpcCalc.performOperationForExpression(expression);
		if(aResult != null){
			System.out.println(Double.toString(aResult));
			assertEquals("Message",eResult,aResult);
		}else{
			
		}
	}

}
