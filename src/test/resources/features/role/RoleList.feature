# feature to review behaviour of role list
Feature: RoleList
  Scenario: Roles - Todos los datos de roles son mostrados en una lista
    Given 'SSI-A' home page is loaded
    And Clicking on Personnel menu on 'Header' page
    And click sub menu 'Roles' of menu 'personnel'
    Then 'Role list' is showed in page
