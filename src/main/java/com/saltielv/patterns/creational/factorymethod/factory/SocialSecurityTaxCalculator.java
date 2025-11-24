package com.saltielv.patterns.creational.factorymethod.factory;

import com.saltielv.patterns.creational.factorymethod.tax.SocialSecurityTax;
import com.saltielv.patterns.creational.factorymethod.tax.Tax;

public class SocialSecurityTaxCalculator extends TaxCalculator {
  @Override
  public Tax createTax() {
    return new SocialSecurityTax();
  }

  @Override
  public String toString() {
    return "SocialSecurityTaxCalculator";
  }
}
