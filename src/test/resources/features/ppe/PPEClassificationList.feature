# @Author: Walker Colina
# feature to review behaviour of ppe classification list
Feature: PPEClassificationList

  Scenario: Clasificación de EPP - Lista - Todos los datos de clasificación de equipo de protección personal son mostrados en una lista después de seleccionar la opción "PpeClassification" del menú "PPE"
    Given 'SSI-A' home page is loaded
    And click 'PPE' menu on 'Header' page
    And click 'PPE Classification' sub menu of 'PPE' menu
    Then 'PPE Classification list' page loads correctly