package com.saltielv.patterns.creational.singleton.safethread;

/**
 * Thread-safe Singleton implementation using Enum. This approach is inherently thread-safe and
 * provides serialization guarantees, making it the most robust way to implement a Singleton in
 * Java.
 */
public enum EnumSingleton {
  INSTANCE;

  @Override
  public String toString() {
    return getDeclaringClass().getCanonicalName() + "@" + hashCode();
  }
}
