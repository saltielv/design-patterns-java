package com.saltielv.patterns.structural.composite;

import com.saltielv.patterns.structural.composite.employee.*;

public class App {
  public static void main(String[] args) {
    var jrDeveloper = new JuniorDeveloper(1, "Mark", Position.JUNIOR_DEVELOPER);
    var jrDeveloper2 = new JuniorDeveloper(2, "Mike", Position.JUNIOR_DEVELOPER);
    var srDeveloper = new SeniorDeveloper(3, "Joseph", Position.SENIOR_DEVELOPER);
    var manager = new Manager(4, "Carlos", Position.MANAGER);
    var ceo = new CEO(5, "Walter", Position.CEO);

    srDeveloper.addSubordinate(jrDeveloper);
    srDeveloper.addSubordinate(jrDeveloper2);
    manager.addSubordinate(srDeveloper);
    ceo.addSubordinate(manager);
    ceo.showDetails();
  }
}
