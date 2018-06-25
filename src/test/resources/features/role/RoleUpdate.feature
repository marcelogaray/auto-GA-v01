# feature to review behaviour of update role
Feature: RoleUpdate
  Scenario: Roles - Actualizar datos de un rol
    Given 'SSI-A' home page is loaded
    And Clicking on Personnel menu on 'Header' page
    And click in sub menu 'Roles' of menu 'personnel'
    And click in button 'Edit' of 'Role list' page
    And update 'Role' in form using Data Driver Test on update 'Role' page
    And click in button 'Update' into update 'Role' form page
    Then updated 'Role' is showed in 'Role list' page
