package com.saltielv.patterns.creational.singleton.safethread;

/**
 * Thread-safe Singleton implementation using synchronized method. This approach ensures that only
 * one thread can access the getInstance method at a time, preventing multiple instances from being
 * created.
 */
public final class SynchronizedSingleton {
  private static SynchronizedSingleton instance;

  private SynchronizedSingleton() {}

  public static synchronized SynchronizedSingleton getInstance() {
    if (instance == null) {
      instance = new SynchronizedSingleton();
    }
    return instance;
  }
}
