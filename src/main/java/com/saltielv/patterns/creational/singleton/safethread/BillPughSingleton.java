package com.saltielv.patterns.creational.singleton.safethread;

/**
 * Thread-safe Singleton implementation using Bill Pugh's approach with a static inner helper class.
 * The instance is created only when the getInstance method is called for the first time.
 */
public final class BillPughSingleton {
  private BillPughSingleton() {}

  private static class SingletonHelper {
    private static final BillPughSingleton INSTANCE = new BillPughSingleton();
  }

  public static BillPughSingleton getInstance() {
    return SingletonHelper.INSTANCE;
  }
}
