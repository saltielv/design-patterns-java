package com.saltielv.patterns.structural.bridge.theme;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dark implements Theme {

  @Override
  public String getBackgroundColor() {
    return "BLACK";
  }

  @Override
  public String getTextColor() {
    return "GREY";
  }

  @Override
  public void apply() {
    log.info("Applying Dark Theme");
  }
}
