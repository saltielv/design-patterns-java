package com.saltielv.patterns.creational.abstractfactory;

import com.saltielv.patterns.creational.abstractfactory.factory.FactoryMaker;
import com.saltielv.patterns.creational.abstractfactory.factory.ProfileFactory;
import com.saltielv.patterns.creational.abstractfactory.profile.Profile;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App implements Runnable {

  public static void main(String[] args) {
    new App().run();
  }

  public Profile createProfile(FactoryMaker.ProfileType type) {
    ProfileFactory profileFactory = new FactoryMaker().makeFactory(type);
    return new Profile(profileFactory);
  }

  @Override
  public void run() {
    Profile profile;
    profile = createProfile(FactoryMaker.ProfileType.STUDENT);
    log.info(profile.getEducation().getDescription());
    log.info(profile.getExperience().getDescription());
    log.info(profile.getSkills().getDescription());

    profile = createProfile(FactoryMaker.ProfileType.PROFESSOR);
    log.info(profile.getEducation().getDescription());
    log.info(profile.getExperience().getDescription());
    log.info(profile.getSkills().getDescription());
  }
}
