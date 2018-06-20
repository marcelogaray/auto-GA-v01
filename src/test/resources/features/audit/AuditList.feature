# @Author: Neyber Rojas
# Feature: Audit List

Feature: AuditList
  Scenario: List of Audit is displayed after selecting "Audit" option
    Given 'SSI-A' home page is loaded
    And Clicking on Audits menu on 'Header' page
    And Clicking on Audit submenu into 'Audits' menu
    Then 'Audit List' page loads correctly

