# @Author: Neyber Rojas
# Feature: Report Audit Periodicity

Feature: ReportAuditPeriodicity
  Scenario: Report of Audit Periodicity is displayed after selecting "Report Audit Periodicity" option
    Given 'SSI-A' home page is loaded
    And Click 'Report Audit Periodicity' submenu into 'Audits' menu on 'Header' page
    Then 'Report Audit Periodicity' page loads correctly

