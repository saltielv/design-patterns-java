package com.saltielv.patterns.structural.bridge;

import com.saltielv.patterns.structural.bridge.theme.Dark;
import com.saltielv.patterns.structural.bridge.theme.Light;
import com.saltielv.patterns.structural.bridge.theme.Theme;
import com.saltielv.patterns.structural.bridge.webpage.About;
import com.saltielv.patterns.structural.bridge.webpage.Contact;
import com.saltielv.patterns.structural.bridge.webpage.Home;

public class App {
  public static void main(String[] args) {
    testThemes(new Dark());
    testThemes(new Light());
  }

  public static void testThemes(Theme theme) {
    var about = new About(theme);
    var home = new Home(theme);
    var contact = new Contact(theme);

    about.renderContent();
    home.renderContent();
    contact.renderContent();
  }
}
