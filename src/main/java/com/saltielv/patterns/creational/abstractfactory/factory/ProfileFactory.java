package com.saltielv.patterns.creational.abstractfactory.factory;

import com.saltielv.patterns.creational.abstractfactory.education.Education;
import com.saltielv.patterns.creational.abstractfactory.experience.Experience;
import com.saltielv.patterns.creational.abstractfactory.skills.Skills;

public interface ProfileFactory {
  Education createEducation();

  Experience createExperience();

  Skills createSkills();
}
