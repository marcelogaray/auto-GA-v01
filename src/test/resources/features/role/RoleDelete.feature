# feature to review behaviour of update role
Feature: RoleDelete
  Scenario: Roles - Eliminar datos de un rol
    Given 'SSI-A' home page is loaded
    And click 'Personnel' menu on 'Header' page
    And click sub menu 'Roles' of menu 'personnel'
    And click button 'Delete' of 'Role list' page
    And click button 'Accept' of delete 'Role' confirmation popup
    Then deleted 'Role' is not showed in 'Role list' page
