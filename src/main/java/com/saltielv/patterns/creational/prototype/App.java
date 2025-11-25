package com.saltielv.patterns.creational.prototype;

import com.saltielv.patterns.creational.prototype.report.UserReport;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
  public static void main(String[] args) {
    UserReport userReport =
        new UserReport(
            1,
            "Walter White",
            "Monthly Activity Report",
            "Heisenberg Corp",
            "Retain for 1 year",
            "v1.0");

    UserReport clonedReport = userReport.copy();
    clonedReport.setUserId(2);
    clonedReport.setUserName("Jesse Pinkman");
    log.info("UserReport: {}", userReport);
    log.info("UserReport: {}", clonedReport);
  }
}
