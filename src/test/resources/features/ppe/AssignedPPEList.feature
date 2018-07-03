# @Author: Walker Colina
# feature to review behaviour of assigned ppe list
Feature: AssignedPPEList

  Scenario: Una vez seleccionado el menu PPE asigned todos los equipos asignados deben ser mostrados en una lista.
    Given 'SSI-A' home page is loaded
    And click 'PPE' menu on 'Header' page
    And click 'Assigned PPE' sub menu of 'PPE' menu
    Then 'Assigned PPE list' page loads correctly