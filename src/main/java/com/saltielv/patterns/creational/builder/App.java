package com.saltielv.patterns.creational.builder;

import com.saltielv.patterns.creational.builder.computer.Computer;
import lombok.extern.slf4j.Slf4j;

/**
 * Builder Pattern Example
 *
 * <p>This example demonstrates the Builder design pattern by constructing a Computer object with
 * both required and optional parameters. The Computer class uses a static nested Builder class to
 * facilitate the construction process.
 */
@Slf4j
public class App {
  public static void main(String[] args) {
    var computer =
        new Computer.Builder("Macbook Air", 8)
            .setStorageGB(256)
            .setHasGraphicsCard(false)
            .setOperatingSystem("macOS Ventura")
            .build();
    log.info("Computer built: {}", computer);
  }
}
