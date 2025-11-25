package com.saltielv.patterns.creational.builder.computer;

public class Computer {
  private final String model;
  private final int ramGB;
  private final int storageGB;
  private final boolean hasGraphicsCard;
  private final String operatingSystem;

  private Computer(Builder builder) {
    this.model = builder.model;
    this.ramGB = builder.ramGB;
    this.storageGB = builder.storageGB;
    this.hasGraphicsCard = builder.hasGraphicsCard;
    this.operatingSystem = builder.operatingSystem;
  }

  @Override
  public String toString() {
    return String.format(
        "Computer [Model: %s, RAM: %dGB, Storage: %dGB, GPU: %b, OS: %s]",
        model, ramGB, storageGB, hasGraphicsCard, operatingSystem);
  }

  public static class Builder {
    // Required parameters (typically passed to builder constructor)
    private final String model;
    private final int ramGB;

    // Optional parameters (default values)
    private int storageGB = 512;
    private boolean hasGraphicsCard = false;
    private String operatingSystem;

    public Builder(String model, int ramGB) {
      this.model = model;
      this.ramGB = ramGB;
    }

    // Setters return the Builder instance itself (fluent interface)
    public Builder setStorageGB(int storageGB) {
      this.storageGB = storageGB;
      return this;
    }

    public Builder setHasGraphicsCard(boolean hasGraphicsCard) {
      this.hasGraphicsCard = hasGraphicsCard;
      return this;
    }

    public Builder setOperatingSystem(String operatingSystem) {
      this.operatingSystem = operatingSystem;
      return this;
    }

    public Computer build() {
      // Optional validation logic here before creating the final object
      if (ramGB < 4) {
        throw new IllegalStateException("RAM must be at least 4GB");
      }
      return new Computer(this);
    }
  }
}
