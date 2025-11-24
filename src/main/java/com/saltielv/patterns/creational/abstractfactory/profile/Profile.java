package com.saltielv.patterns.creational.abstractfactory.profile;

import com.saltielv.patterns.creational.abstractfactory.education.Education;
import com.saltielv.patterns.creational.abstractfactory.experience.Experience;
import com.saltielv.patterns.creational.abstractfactory.factory.ProfileFactory;
import com.saltielv.patterns.creational.abstractfactory.skills.Skills;
import lombok.Getter;

@Getter
public class Profile {
  private final Education education;
  private final Experience experience;
  private final Skills skills;

  public Profile(ProfileFactory factory) {
    this.education = factory.createEducation();
    this.experience = factory.createExperience();
    this.skills = factory.createSkills();
  }
}
