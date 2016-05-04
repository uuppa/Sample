package com.junit.test;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void evaluatesExpression() {
    BasicConfigurator.configure();
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
    logger.info("CalculatorTest"); 
  }
}
