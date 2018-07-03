# feature to review behaviour of update role
Feature: RoleUpdate
  Scenario: Roles - Actualizar datos de un rol
    Given 'SSI-A' home page is loaded
    And click 'Personnel' menu on 'Header' page
    And click sub menu 'Roles' of menu 'personnel'
    And click button 'Edit' of 'Role list' page
    And update 'Role' in form using Data Driver Test on update 'Role' page
    And click button 'Update' into update 'Role' form page
    Then updated 'Role' is showed in 'Role list' page
