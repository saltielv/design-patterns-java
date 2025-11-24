package com.saltielv.patterns.creational.factorymethod;

import com.saltielv.patterns.creational.factorymethod.factory.MedicareTaxCalculator;
import com.saltielv.patterns.creational.factorymethod.factory.SocialSecurityTaxCalculator;
import com.saltielv.patterns.creational.factorymethod.factory.TaxCalculator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

  public static void main(String[] args) {
    double amount = 2000.0;
    TaxCalculator socialTaxCalculator = new SocialSecurityTaxCalculator();
    log.info(
        "{}: Calculating tax for amount ${}: ${}",
        socialTaxCalculator,
        amount,
        socialTaxCalculator.calculateTax(amount));

    TaxCalculator medicareTaxCalculator = new MedicareTaxCalculator();
    log.info(
        "{}: Calculating tax for amount ${}: ${}",
        medicareTaxCalculator,
        amount,
        medicareTaxCalculator.calculateTax(amount));
  }
}
