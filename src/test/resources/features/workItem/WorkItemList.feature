# @Author: Linet Torrico
# Feature: Work Item List

Feature: WorkItemList
  Scenario: List of work items is displayed after selecting "WorkItems" option
    Given 'SSI-A' home page is loaded
    And click Work Items 'menu' on 'Header' page
    And click 'Work Item' sub menu on 'Work Items' menu
    Then 'Work Item List' page loads correctly

