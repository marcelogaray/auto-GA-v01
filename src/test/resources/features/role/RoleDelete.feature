# feature to review behaviour of update role
Feature: RoleDelete
  Scenario: Roles - Eliminar datos de un rol
    Given 'SSI-A' home page is loaded
    And Clicking on Personnel menu on 'Header' page
    And click in sub menu 'Roles' of menu 'personnel'
    And click in button 'Delete' of 'Role list' page
    And click in button 'Accept' of delete 'Role' confirmation popup
    Then deleted 'Role' is not showed in 'Role list' page
