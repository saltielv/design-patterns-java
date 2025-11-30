package com.saltielv.patterns.structural.composite.employee;

public class CEO extends EmployeeBase {
  public CEO(int employeeId, String name, Position position) {
    super(employeeId, name, position);
  }

  @Override
  public void addSubordinate(Employee e) {
    reportingEmployees.add(e);
  }
}
