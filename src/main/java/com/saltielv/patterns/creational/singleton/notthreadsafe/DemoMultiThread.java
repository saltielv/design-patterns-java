package com.saltielv.patterns.creational.singleton.notthreadsafe;

import lombok.extern.slf4j.Slf4j;

/**
 * Demo class to illustrate the Singleton pattern in a multi-thread context. Identical hashcode
 * values confirm singleton reuse. Different hashcode values indicate independent instances were
 * created.
 */
@Slf4j
public class DemoMultiThread {
  public static void main(String[] args) {
    Thread foo = new Thread(new ThreadFoo());
    Thread bar = new Thread(new ThreadBar());
    foo.start();
    bar.start();
  }

  static class ThreadFoo implements Runnable {
    @Override
    public void run() {
      Singleton singleton = Singleton.getInstance();
      log.info("Singleton hashcode: {}", singleton.hashCode());
    }
  }

  static class ThreadBar implements Runnable {
    @Override
    public void run() {
      Singleton singleton = Singleton.getInstance();
      log.info("Singleton hashcode: {}", singleton.hashCode());
    }
  }
}
