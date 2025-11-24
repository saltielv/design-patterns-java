package com.saltielv.patterns.creational.abstractfactory.factory;

import com.saltielv.patterns.creational.abstractfactory.education.Education;
import com.saltielv.patterns.creational.abstractfactory.education.ProfessorEducation;
import com.saltielv.patterns.creational.abstractfactory.experience.Experience;
import com.saltielv.patterns.creational.abstractfactory.experience.ProfessorExperience;
import com.saltielv.patterns.creational.abstractfactory.skills.ProfessorSkills;
import com.saltielv.patterns.creational.abstractfactory.skills.Skills;

public class ProfessorProfileFactory implements ProfileFactory {

  @Override
  public Education createEducation() {
    return new ProfessorEducation();
  }

  @Override
  public Experience createExperience() {
    return new ProfessorExperience();
  }

  @Override
  public Skills createSkills() {
    return new ProfessorSkills();
  }
}
