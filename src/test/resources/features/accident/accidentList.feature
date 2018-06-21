# @Author: Henry Bustamante
# Feature: AccidentList

Feature: AccidentList
  Scenario: List of accidents is displayed when we clicked on sub-menu 'Accident' of menu 'Safety'
    Given  'SSI-A' home page is loaded
    And clicking on Safety menu 'Header' Safety page
    And clicking on sub menu into 'Accident' menu
    Then 'Accident list' page loads correctly
