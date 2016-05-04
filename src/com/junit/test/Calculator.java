package com.junit.test;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class Calculator {
	
	static Logger logger = Logger.getLogger(Calculator.class);
	
	  public int evaluate(String expression) {
	    int sum = 0;
	    for (String summand: expression.split("\\+"))
	      sum += Integer.valueOf(summand);
	    return sum;
	  }
	  
	  public static void main(String args[]){
		BasicConfigurator.configure();
        	logger.info("****Executing Calculator****"); 
	  }
	}
