# feature to review behaviour of delete sickness
Feature: SicknessDelete
  Scenario: Enfermedades - Eliminar enfermedades de los empleados y que dejen de listarse en la tabla
    Given 'SSI-A' home page is loaded
    And click Safety 'menu' on 'Header' page
    And click in sub menu 'Sickness' of menu 'Safety'
    And click in button 'Delete' of 'Sickness list' page
    And click in button 'Accept' of delete 'Sickness' confirmation popup
    Then deleted 'Sickness' is not showed in 'Sickness list' page

