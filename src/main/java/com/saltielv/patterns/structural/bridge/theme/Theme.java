package com.saltielv.patterns.structural.bridge.theme;

public interface Theme {
  String getBackgroundColor();

  String getTextColor();

  void apply();
}
