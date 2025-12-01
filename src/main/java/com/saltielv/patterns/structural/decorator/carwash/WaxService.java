package com.saltielv.patterns.structural.decorator.carwash;

public class WaxService extends ServiceDecorator {

  public static final double EXTRA_COST = 5.0;
  public static final String SERVICE_DESCRIPTION = "+ Hand Wax ";

  public WaxService(CarWashService carWashService) {
    super(carWashService);
  }

  @Override
  public double getCost() {
    return super.getCost() + EXTRA_COST;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + SERVICE_DESCRIPTION;
  }
}
