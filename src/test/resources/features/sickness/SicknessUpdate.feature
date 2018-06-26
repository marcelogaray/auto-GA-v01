# feature to review behaviour of update sickness
Feature: SicknessUpdate
  Scenario: Enfermedades - Actualizar enfermedades de los empleados y que se listen en la tabla
    Given 'SSI-A' home page is loaded
    And click Safety 'menu' on 'Header' page
    And click in sub menu 'Sickness' of menu 'Safety'
    And click in button 'Edit' of 'Sickness list' page
    And update 'Sickness' in form using Data Driver Test on update 'Sickness' page
    And click in button 'Update' into update 'Sickness' form page
    Then updated 'Sickness' is showed in 'Sickness list' page

