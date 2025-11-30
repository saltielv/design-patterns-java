package com.saltielv.patterns.structural.composite.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@ToString
@Slf4j
public abstract class EmployeeBase implements Employee {

  private final int employeeId;
  private final String name;
  private final Position position;
  protected final List<Employee> reportingEmployees = new ArrayList<>();

  protected EmployeeBase(int employeeId, String name, Position position) {
    this.employeeId = employeeId;
    this.name = name;
    this.position = position;
  }

  public void addSubordinate(Employee e) {
    throw new UnsupportedOperationException("Operation not supported for this employee type");
  }

  @Override
  public void showDetails() {
    log.info(this.toString());
  }
}
