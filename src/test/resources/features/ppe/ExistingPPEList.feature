# @Author: Walker Colina
# feature to review behaviour of existing ppe list
Feature: ExistingPPEList

  Scenario: Inventario EPP - Lista - Todos los datos de inventario clasificación de equipo de protección personal son mostrados en una lista después de seleccionar la opción "Inventory" del menú "PPE"
    Given 'SSI-A' home page is loaded
    And click 'PPE' menu on 'Header' page
    And click 'Existing PPE' sub menu of 'PPE' menu
    Then 'Existing PPE list' page loads correctly