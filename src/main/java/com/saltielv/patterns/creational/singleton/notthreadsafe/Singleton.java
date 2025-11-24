package com.saltielv.patterns.creational.singleton.notthreadsafe;

public final class Singleton {
  private static Singleton instance;

  private Singleton() {}

  public static Singleton getInstance() {
    if (instance == null) {
      // Simulate some delay to increase the chance of race condition
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      instance = new Singleton();
    }
    return instance;
  }
}
