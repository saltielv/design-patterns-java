package com.saltielv.patterns.creational.factorymethod.factory;

import com.saltielv.patterns.creational.factorymethod.tax.Tax;

public abstract class TaxCalculator {
  public abstract Tax createTax();

  public double calculateTax(double amount) {
    Tax tax = createTax();
    return tax.calculate(amount);
  }
}
