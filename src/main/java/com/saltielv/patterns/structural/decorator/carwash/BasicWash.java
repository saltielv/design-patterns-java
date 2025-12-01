package com.saltielv.patterns.structural.decorator.carwash;

public class BasicWash implements CarWashService {

  public static final double COST = 10.0;
  public static final String SERVICE_DESCRIPTION = "Exterior wash & Tire shine ";

  @Override
  public double getCost() {
    return COST;
  }

  @Override
  public String getDescription() {
    return SERVICE_DESCRIPTION;
  }
}
