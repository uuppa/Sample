package com.junit.test;

public class Calculator {
	  public int evaluate(String expression) {
	    int sum = 0;
	    for (String summand: expression.split("\\+"))
	      sum += Integer.valueOf(summand);
	    return sum;
	  }
	  
	  public static void main(String args[]){
		  System.out.println("In Main");
	  }
	}