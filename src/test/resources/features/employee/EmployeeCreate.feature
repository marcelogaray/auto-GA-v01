# @Author: Lizeth Salazar
# Feature: Employee Create

Feature: EmployeeCreate
  Scenario: Required error is displayed when clicking on Save button without entering any data
    Given 'SSI-A' home page is loaded
    And Click 'Personnel' menu on 'Header' page
    And Click 'Employee' submenu into 'Personnel' menu
    And Click 'New Employee' button in 'Employees List' page
    And Click 'Save' button in 'New Employee' page
    Then 'Please fill required fields' error pops up