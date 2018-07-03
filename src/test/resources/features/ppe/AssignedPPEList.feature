# @Author: Walker Colina
# feature to review behaviour of assigned ppe list
Feature: AssignedPPEList

  Scenario: Asignación EPP - Lista - Todos los datos de equipo de protección personal asignados son mostrados en una lista después de seleccionar la opción "Assing PPE" del menú "PPE"
    Given 'SSI-A' home page is loaded
    And click 'PPE' menu on 'Header' page
    And click 'Assigned PPE' sub menu of 'PPE' menu
    Then 'Assigned PPE list' page loads correctly