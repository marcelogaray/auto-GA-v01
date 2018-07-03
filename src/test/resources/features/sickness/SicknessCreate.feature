# feature to review behaviour of create sickness
Feature: SicknessCreate
  Scenario: Enfermedades - Registrar enfermedades para los empleados, y que se listen en la tabla
    Given 'SSI-A' home page is loaded
    And click 'Safety' menu on 'Header' page
    And click sub menu 'Sickness' of menu 'Safety'
    And click button 'New Sickness' of sickness list page
    And fill 'Sickness' form using Data Driver Test on create 'Sickness' page
    And click button 'Save' into 'Sickness' create form page
    Then created 'Sickness' is showed in 'Sickness list' page

