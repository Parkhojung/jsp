package jspbook.ch04;

import java.lang.Math;

public class Calc {

	private int result ;
//	private int firstOperand ;
//	private int secondOperand ;
//	private String operator;
	private int option;
	
	
	public Calc(int firstOperand, int secondOperand, String operator){
//		this.firstOperand = firstOperand;
//		this.secondOperand = secondOperand;
//		this.operator = operator;
	
		if(operator.equals("+")) result= firstOperand+secondOperand;
		else if(operator.equals("-")) result= firstOperand-secondOperand;;
		else if(operator.equals("*")) result= firstOperand*secondOperand;;
		else if(operator.equals("/")) result= firstOperand/secondOperand;;
		else if(operator.equals("^")) (int)Math.pow(firstOperand,secondOperand);
				
	}

	public int getResult() {
		return result;
	}
}
