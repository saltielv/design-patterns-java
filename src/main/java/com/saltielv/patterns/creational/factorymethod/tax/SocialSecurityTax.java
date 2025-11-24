package com.saltielv.patterns.creational.factorymethod.tax;

public class SocialSecurityTax implements Tax {

  private static final double TAX_RATE = 0.0145;

  @Override
  public double calculate(double amount) {
    return amount * TAX_RATE;
  }
}
