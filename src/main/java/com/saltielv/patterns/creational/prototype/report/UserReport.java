package com.saltielv.patterns.creational.prototype.report;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true, includeFieldNames = true)
public class UserReport extends Report implements Prototype<UserReport> {
  private int userId;
  private String userName;

  public UserReport(
      int userId,
      String userName,
      String reportTitle,
      String organizationName,
      String dataRetentionPolicy,
      String reportVersion) {
    super(reportTitle, organizationName, dataRetentionPolicy, reportVersion);
    this.userId = userId;
    this.userName = userName;
  }

  private UserReport(UserReport userReport) {
    super(
        userReport.getReportTitle(),
        userReport.getOrganizationName(),
        userReport.getDataRetentionPolicy(),
        userReport.getReportVersion());
    this.userId = userReport.userId;
    this.userName = userReport.userName;
  }

  @Override
  public UserReport copy() {
    return new UserReport(this);
  }
}
