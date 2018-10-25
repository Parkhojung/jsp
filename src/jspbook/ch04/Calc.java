package jspbook.ch04;

import java.lang.Math;

public class Calc {

	private int result ;
	private int firstOperand ;
	private int secondOperand ;
	private String operator;
	private int option;
	
	
	Calc(int firstOperand, int secondOperand, String operator){
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
		this.operator = operator;
	
		if(this.operator.equals("+")) option = 1;
		else if(this.operator.equals("-")) option = 2;
		else if(this.operator.equals("*")) option = 3;
		else if(this.operator.equals("/")) option = 4;
		else if(this.operator.equals("^")) option = 5;
		
		switch(option) {
		case 1: result= firstOperand+secondOperand;	break;
		case 2: result= firstOperand-secondOperand;	break;
		case 3: result= firstOperand*secondOperand; break;
		case 4: result= firstOperand/secondOperand;	break;
		case 5: result= (int)Math.pow(firstOperand,secondOperand); break;

		default: break;
		}
	}

	int getResult() {
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
