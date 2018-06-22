# @Author: Henry Bustamante
# Feature: AccidentList

Feature: AccidentList
  Scenario: List of accidents is displayed when we clicked on sub-menu 'Accident' of menu 'Safety'
    Given  'SSI-A' home page is loaded
    And click Safety 'menu' on 'Header' page
    And click 'Accident' sub menu on 'Safety' menu
    Then 'Accident list' page loads correctly
