# @Author: Lizeth Salazar
# Feature: Employee Create

Feature: EmployeeCreate
  Scenario: Required error is displayed when clicking on Save button without entering any data
    Given 'SSI-A' home page is loaded
    And click 'Personnel' menu on 'Header' page
    And click 'Employee' submenu into 'Personnel' menu
    And click 'New Employee' button in 'Employees List' page
    And click 'Save' button in 'New Employee' page
    Then 'Please fill required fields' error pops up