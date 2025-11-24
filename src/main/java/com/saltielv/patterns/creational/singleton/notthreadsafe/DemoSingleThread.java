package com.saltielv.patterns.creational.singleton.notthreadsafe;

import lombok.extern.slf4j.Slf4j;

/**
 * Demo class to illustrate the Singleton pattern in a single-threaded context. Identical hashcode
 * values confirm singleton reuse. Different hashcode values indicate different instances were
 * created.
 */
@Slf4j
public class DemoSingleThread {
  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    log.info("Singleton1 hashcode: {}", singleton1.hashCode());
    log.info("Singleton2 hashcode: {}", singleton2.hashCode());
  }
}
