package com.saltielv.patterns.structural.bridge.theme;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Light implements Theme {

  @Override
  public String getBackgroundColor() {
    return "WHITE";
  }

  @Override
  public String getTextColor() {
    return "BLACK";
  }

  @Override
  public void apply() {
    log.info("Applying Light Theme");
  }
}
