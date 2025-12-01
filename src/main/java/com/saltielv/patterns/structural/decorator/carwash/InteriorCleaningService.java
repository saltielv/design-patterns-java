package com.saltielv.patterns.structural.decorator.carwash;

public class InteriorCleaningService extends ServiceDecorator {

  public static final double EXTRA_COST = 7.0;
  public static final String SERVICE_DESCRIPTION = "+ Interior Surface Cleaning";

  public InteriorCleaningService(CarWashService carWashService) {
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
