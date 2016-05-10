package com.junit.test;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  static Logger logger = Logger.getLogger(CalculatorTest.class);
  @Test
  public void evaluatesExpression() {
    BasicConfigurator.configure();
    logger.info("****Executing CalculatorTest****"); 
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(-6, sum);
  }
}
