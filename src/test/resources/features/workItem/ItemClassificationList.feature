# @Author: Linet Torrico
# Feature: Item Classification List

Feature: ItemClassificationList
  Scenario: List of work items is displayed after selecting "WorkItems" option
    Given 'SSI-A' home page is loaded
    And click Work Items 'menu' on 'Header' page
    And click 'Item Classification' sub menu on 'Work Items' menu
    Then 'Item Classification List' page loads correctly

