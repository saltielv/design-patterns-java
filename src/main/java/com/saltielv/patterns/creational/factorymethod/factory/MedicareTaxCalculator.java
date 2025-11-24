package com.saltielv.patterns.creational.factorymethod.factory;

import com.saltielv.patterns.creational.factorymethod.tax.MedicareTax;
import com.saltielv.patterns.creational.factorymethod.tax.Tax;

public class MedicareTaxCalculator extends TaxCalculator {
  @Override
  public Tax createTax() {
    return new MedicareTax();
  }

  @Override
  public String toString() {
    return "MedicareTaxCalculator";
  }
}
