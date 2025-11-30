package com.saltielv.patterns.structural.composite.employee;

public class Manager extends EmployeeBase {
  public Manager(int employeeId, String name, Position position) {
    super(employeeId, name, position);
  }

  @Override
  public void addSubordinate(Employee e) {
    reportingEmployees.add(e);
  }
}
