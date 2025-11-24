package com.saltielv.patterns.creational.singleton.safethread.demo;

import com.saltielv.patterns.creational.singleton.notthreadsafe.Singleton;
import com.saltielv.patterns.creational.singleton.safethread.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Demo class to illustrate various thread-safe Singleton implementations. Identical hashcode values
 * confirm singleton reuse. Different hashcode values indicate independent instances were created.
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
      // Bill Pugh's singleton implementation
      var billPughSingleton = BillPughSingleton.getInstance();
      log.info(
          "{}: billPughSingleton={}",
          this.getClass().getSimpleName(),
          billPughSingleton.hashCode());
      var billPughSingleton2 = BillPughSingleton.getInstance();
      log.info(
          "{}, billPughSingleton2={}",
          this.getClass().getSimpleName(),
          billPughSingleton2.hashCode());

      // double-checked locking
      var dclSingleton1 = DCLSingleton.getInstance();
      log.info("{}, dclSingleton1={}", this.getClass().getSimpleName(), dclSingleton1.hashCode());
      var dlcSingleton2 = DCLSingleton.getInstance();
      log.info("{}, dlcSingleton2={}", this.getClass().getSimpleName(), dlcSingleton2.hashCode());

      // eagerly initialized singleton
      var eagerSingleton1 = EagerSingleton.getInstance();
      var eagerSingleton2 = EagerSingleton.getInstance();
      log.info(
          "{}, eagerSingleton1={}", this.getClass().getSimpleName(), eagerSingleton1.hashCode());
      log.info(
          "{}, eagerSingleton2={}", this.getClass().getSimpleName(), eagerSingleton2.hashCode());

      // enum singleton
      var enumSingleton1 = EnumSingleton.INSTANCE;
      var enumSingleton2 = EnumSingleton.INSTANCE;
      log.info("{}, enumSingleton1={}", this.getClass().getSimpleName(), enumSingleton1);
      log.info("{}, enumSingleton2={}", this.getClass().getSimpleName(), enumSingleton2);

      // lazily initialized singleton
      var synchronizedSingleton1 = SynchronizedSingleton.getInstance();
      var synchronizedSingleton2 = SynchronizedSingleton.getInstance();
      log.info(
          "{}, synchronizedSingleton1={}",
          this.getClass().getSimpleName(),
          synchronizedSingleton1.hashCode());
      log.info(
          "{}, synchronizedSingleton2={}",
          this.getClass().getSimpleName(),
          synchronizedSingleton2.hashCode());
    }
  }

  static class ThreadBar implements Runnable {
    @Override
    public void run() {
      // Bill Pugh's singleton implementation
      var billPughSingleton = BillPughSingleton.getInstance();
      log.info(
          "{}, billPughSingleton={}",
          this.getClass().getSimpleName(),
          billPughSingleton.hashCode());
      var billPughSingleton2 = BillPughSingleton.getInstance();
      log.info(
          "{}, billPughSingleton2={}",
          this.getClass().getSimpleName(),
          billPughSingleton2.hashCode());

      // double-checked locking
      var dclSingleton1 = DCLSingleton.getInstance();
      log.info("{}, dclSingleton1={}", this.getClass().getSimpleName(), dclSingleton1.hashCode());
      var dclSingleton2 = DCLSingleton.getInstance();
      log.info("{}, dclSingleton2={}", this.getClass().getSimpleName(), dclSingleton2.hashCode());

      // eagerly initialized singleton
      var eagerSingleton1 = EagerSingleton.getInstance();
      var eagerSingleton2 = EagerSingleton.getInstance();
      log.info(
          "{}, eagerSingleton1={}", this.getClass().getSimpleName(), eagerSingleton1.hashCode());
      log.info(
          "{}, eagerSingleton2={}", this.getClass().getSimpleName(), eagerSingleton2.hashCode());

      // enum singleton
      var enumSingleton1 = EnumSingleton.INSTANCE;
      var enumSingleton2 = EnumSingleton.INSTANCE;
      log.info("{}, enumSingleton1={}", this.getClass().getSimpleName(), enumSingleton1);
      log.info("{}, enumSingleton2={}", this.getClass().getSimpleName(), enumSingleton2);

      // lazily initialized singleton
      var synchronizedSingleton1 = SynchronizedSingleton.getInstance();
      var synchronizedSingleton2 = SynchronizedSingleton.getInstance();
      log.info(
          "{}, synchronizedSingleton1={}",
          this.getClass().getSimpleName(),
          synchronizedSingleton1.hashCode());
      log.info(
          "{}, synchronizedSingleton2={}",
          this.getClass().getSimpleName(),
          synchronizedSingleton2.hashCode());
    }
  }
}
