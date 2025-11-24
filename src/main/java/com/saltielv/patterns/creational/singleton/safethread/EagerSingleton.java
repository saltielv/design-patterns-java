package com.saltielv.patterns.creational.singleton.safethread;

/**
 * Thread-safe Singleton implementation using eager initialization. The instance is created at the
 * time of class loading, ensuring thread safety without the need for synchronization.
 */
public final class EagerSingleton {
  private static final EagerSingleton instance = new EagerSingleton();

  private EagerSingleton() {}

  public static EagerSingleton getInstance() {
    return instance;
  }
}
