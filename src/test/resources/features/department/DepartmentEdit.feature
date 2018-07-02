# @Author: Lizeth Salazar
# Feature: Department Edit

Feature: DepartmentEdit
  Scenario: Department List is displayed when clicking on 'Cancel' button
    Given 'SSI-A' home page is loaded
    And click 'Personnel' menu on 'Header' page
    And click 'Department' submenu into 'Personnel' menu
    And click 'Edit Department' button in 'Departments List' page
    And click 'Cancel' button in 'Edit Department' page
    Then 'Department List' page loads correctly

  Scenario Outline: Edit any department
    Given 'SSI-A' home page is loaded
    And click 'Personnel' menu on 'Header' page
    And click 'Department' submenu into 'Personnel' menu
    And click 'Edit Department' button in 'Departments List' page
    And fill "<departmentName>" in 'Name' text box in 'Edit Department' page
    And fill "<departmentDescription>" in 'Description' text box in 'Edit Department' page
    And click 'Update' button in 'Edit Department' page
    Then "<departmentName>" and "<departmentDescription>" are displayed in 'Department List' page
    Examples:
      | departmentName | departmentDescription |
      | automationUpdatedDepartment | departmentUpdatedAutoDesc |
