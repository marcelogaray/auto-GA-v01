# @Author: Lizeth Salazar
# Feature: Employee List

Feature: EmployeeList
  Scenario: List of employees is displayed after selecting "Employee" option
    Given 'SSI-A' home page is loaded
    And Click 'Personnel' menu on 'Header' page
    And Click 'Employee' submenu into 'Personnel' menu
    Then 'Employee List' page loads correctly
