# @Author: Linet Torrico
# Feature: Work Item List

Feature: WorkItemList
  Scenario: List of work items is displayed after selecting "WorkItems" option
    Given 'SSI-A' home page is loaded
    And Click on Work Items menu on 'Header' page
    And Click on Work Item submenu into 'Work Items' menu
    Then 'Work Item List' page loads correctly

