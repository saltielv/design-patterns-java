package com.saltielv.patterns.creational.abstractfactory.factory;

public class FactoryMaker {
  public enum ProfileType {
    PROFESSOR,
    STUDENT
  }

  public ProfileFactory makeFactory(ProfileType type) {
    return switch (type) {
      case PROFESSOR -> new ProfessorProfileFactory();
      case STUDENT -> new StudentProfileFactory();
    };
  }
}
