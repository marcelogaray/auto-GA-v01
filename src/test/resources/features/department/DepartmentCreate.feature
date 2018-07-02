# @Author: Lizeth Salazar
# Feature: Department Create

Feature: DepartmentCreate
  Scenario: Department List is displayed when clicking on 'Cancel' button
    Given 'SSI-A' home page is loaded
    And click 'Personnel' menu on 'Header' page
    And click 'Department' submenu into 'Personnel' menu
    And click 'New Department' button in 'Departments List' page
    And click 'Cancel' button in 'New Department' page
    Then 'Department List' page loads correctly

  Scenario Outline: Create a new department
    Given 'SSI-A' home page is loaded
    And click 'Personnel' menu on 'Header' page
    And click 'Department' submenu into 'Personnel' menu
    And click 'New Department' button in 'Departments List' page
    And fill "<departmentName>" in 'Name' text box in 'New Department' page
    And fill "<departmentDescription>" in 'Description' text box in 'New Department' page
    And click 'Save' button in 'New Department' page
    Then "<departmentName>" and "<departmentDescription>" are displayed in 'Department List' page
  Examples:
    | departmentName | departmentDescription |
    | automationDepartment | departmentAutoDesc |