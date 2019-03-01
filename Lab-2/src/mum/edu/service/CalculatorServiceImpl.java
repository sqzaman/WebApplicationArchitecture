package mum.edu.service;

import mum.edu.domain.Calculator;

 
public class CalculatorServiceImpl implements CalculatorService  {

	
	
	public void add(Calculator calculator){
		calculator.add();
		
		/*
		 * Possible "externalized" Logic/notification
		 * Is this the right place?
		 * [Thin .vs. rich domain model]
		  if calculator.getSum() <= 0
		  	register debit
		  	notify debit processor
		 */
		return ;
	}
	
	public void mult(Calculator calculator){
		calculator.mult();
		
		/*
		  if calculator.getMult() >  maxLimit
		  	register over budget
		  	notify overflow processor
		 */

		
		return ;
	}
 
}
