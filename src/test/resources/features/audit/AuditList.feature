# @Author: Neyber Rojas
# Feature: Audit List

Feature: AuditList
  Scenario: List of Audit is displayed after selecting "Audit" option
    Given 'SSI-A' home page is loaded
    And Click 'Audit' submenu into 'Audits' menu on 'Header' page
    Then 'Audit List' page loads correctly

