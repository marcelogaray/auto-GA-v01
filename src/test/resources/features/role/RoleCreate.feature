# feature to review behaviour of create role
Feature: RoleCreate
  Scenario: Roles - Registrar datos de un nuevo rol
    Given 'SSI-A' home page is loaded
    And Clicking on Personnel menu on 'Header' page
    And Click in sub menu 'Roles' of menu 'personnel'
    And Click in button 'New Role' of role list page
    And Set 'role' data in create form page
    And Click in button 'Create' into create form page
    Then Created 'Role' is showed in role list page