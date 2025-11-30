package com.saltielv.patterns.structural.composite.employee;

public class SeniorDeveloper extends EmployeeBase {
  public SeniorDeveloper(int employeeId, String name, Position position) {
    super(employeeId, name, position);
  }

  @Override
  public void addSubordinate(Employee e) {
    reportingEmployees.add(e);
  }
}
