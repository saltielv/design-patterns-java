package com.saltielv.patterns.structural.bridge.webpage;

import com.saltielv.patterns.structural.bridge.theme.Theme;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class About implements WebpageSection {

  private final String backgroundColor;
  private final String textColor;
  private final Theme theme;

  public About(Theme theme) {
    this.theme = theme;
    this.backgroundColor = theme.getBackgroundColor();
    this.textColor = theme.getTextColor();
  }

  @Override
  public void renderContent() {
    log.info("Rendering Contact Section");
    this.theme.apply();
    log.info("BackgroundColor: {}, TextColor: {}", this.backgroundColor, this.textColor);
  }
}
