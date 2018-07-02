# feature to review behaviour of create role
Feature: RoleCreate
  Scenario: Roles - Registrar datos de un nuevo rol
    Given 'SSI-A' home page is loaded
    And click 'Personnel' menu on 'Header' page
    And click sub menu 'Roles' of menu 'personnel'
    And click button 'New Role' of role list page
    And fill 'Role' form using Data Driver Test on create 'Role' page
    And click button 'Create' into create form page
    Then created 'Role' is showed in role list page