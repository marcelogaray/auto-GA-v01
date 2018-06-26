# @Author: Lizeth Salazar
# Feature: Department List

Feature: DepartmentList
  Scenario: Required error is displayed when clicking on Save button without entering any data
    Given 'SSI-A' home page is loaded
    And click 'Personnel' menu on 'Header' page
    And click 'Department' submenu into 'Personnel' menu
    Then 'Department List' page loads correctly