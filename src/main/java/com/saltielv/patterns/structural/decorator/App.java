package com.saltielv.patterns.structural.decorator;

import com.saltielv.patterns.structural.decorator.carwash.BasicWash;
import com.saltielv.patterns.structural.decorator.carwash.InteriorCleaningService;
import com.saltielv.patterns.structural.decorator.carwash.WaxService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
  public static void main(String[] args) {
    var basicService = new BasicWash();
    log.info(
        "[Basic Service] - Description: {}, Cost: {} ",
        basicService.getDescription(),
        basicService.getCost());
    var interiorService = new InteriorCleaningService(new BasicWash());
    log.info(
        "[Interior Cleaning Service] - Description: {}, Cost: {} ",
        interiorService.getDescription(),
        interiorService.getCost());
    var interiorAndWaxService = new InteriorCleaningService(new WaxService(new BasicWash()));
    log.info(
        "[Interior Cleaning Service + Wax Service] - Description: {}, Cost: {} ",
        interiorAndWaxService.getDescription(),
        interiorAndWaxService.getCost());
  }
}
