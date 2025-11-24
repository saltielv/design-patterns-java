package com.saltielv.patterns.creational.abstractfactory.factory;

import com.saltielv.patterns.creational.abstractfactory.education.Education;
import com.saltielv.patterns.creational.abstractfactory.education.StudentEducation;
import com.saltielv.patterns.creational.abstractfactory.experience.Experience;
import com.saltielv.patterns.creational.abstractfactory.experience.StudentExperience;
import com.saltielv.patterns.creational.abstractfactory.skills.Skills;
import com.saltielv.patterns.creational.abstractfactory.skills.StudentSkills;

public class StudentProfileFactory implements ProfileFactory {
  @Override
  public Education createEducation() {
    return new StudentEducation();
  }

  @Override
  public Experience createExperience() {
    return new StudentExperience();
  }

  @Override
  public Skills createSkills() {
    return new StudentSkills();
  }
}
