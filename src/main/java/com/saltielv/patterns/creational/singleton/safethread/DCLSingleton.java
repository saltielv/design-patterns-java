package com.saltielv.patterns.creational.singleton.safethread;

/**
 * Thread-safe Singleton implementation using Double-Checked Locking (DCL) pattern. The instance is
 * declared as volatile to ensure visibility of changes across threads.
 */
public final class DCLSingleton {
  private static volatile DCLSingleton instance;

  private DCLSingleton() {}

  public static DCLSingleton getInstance() {
    var result = instance;
    if (result == null) {
      synchronized (DCLSingleton.class) {
        if (instance == null) instance = result = new DCLSingleton();
      }
    }
    return result;
  }
}
