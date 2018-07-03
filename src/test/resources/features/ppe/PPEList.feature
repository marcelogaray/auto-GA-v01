# @Author: Walker Colina
# feature to review behaviour of ppe list
Feature: PPEList

  Scenario: EPP - Lista - Todos los datos de equipos de protección personal son mostrados en una lista después de seleccionar la opción "PPE" del menú "PPE"
    Given 'SSI-A' home page is loaded
    And click 'PPE' menu on 'Header' page
    And click 'PPE' sub menu of 'PPE' menu
    Then 'PPE list' page loads correctly