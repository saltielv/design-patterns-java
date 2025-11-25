package com.saltielv.patterns.creational.prototype.report;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Report {
  private String reportTitle;
  private String organizationName;
  private Date generationTimestamp;
  private String dataRetentionPolicy;
  private String reportVersion;

  public Report(
      String reportTitle,
      String organizationName,
      String dataRetentionPolicy,
      String reportVersion) {
    this.reportTitle = reportTitle;
    this.organizationName = organizationName;
    this.generationTimestamp = new Date();
    this.dataRetentionPolicy = dataRetentionPolicy;
    this.reportVersion = reportVersion;
  }
}
