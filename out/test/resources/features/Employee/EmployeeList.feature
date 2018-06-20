# @Author: Lizeth Salazar
# Feature: Employee List

Feature: EmployeeList
  Scenario: List of employees is displayed after selecting "Employee" option
    Given SSI-A home page is loaded
    And Clicking on Personnel menu on header
    And Clicking on Employee submenu into Personnel
    Then Employee List loads correctly

