package com.saltielv.patterns.structural.decorator.carwash;

public abstract class ServiceDecorator implements CarWashService {

  private final CarWashService carWashService;

  protected ServiceDecorator(CarWashService carWashService) {
    this.carWashService = carWashService;
  }

  @Override
  public double getCost() {
    return carWashService.getCost();
  }

  @Override
  public String getDescription() {
    return carWashService.getDescription();
  }
}
