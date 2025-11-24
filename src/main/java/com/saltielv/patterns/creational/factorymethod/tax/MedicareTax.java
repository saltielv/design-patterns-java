package com.saltielv.patterns.creational.factorymethod.tax;

public class MedicareTax implements Tax {

  private static final double TAX_RATE = 0.062;

  @Override
  public double calculate(double amount) {
    return amount * TAX_RATE;
  }
}
