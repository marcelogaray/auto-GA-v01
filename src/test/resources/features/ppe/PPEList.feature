# @Author: Walker Colina
# feature to review behaviour of ppe list
Feature: PPEList

  Scenario: Equipo de proteccion personal - Todos los datos de equipos de protección personal son mostrados en una lista
    Given 'SSI-A' home page is loaded
    And Click 'PPE' menu on 'Header' page
    And Click 'PPE' sub menu of 'PPE' menu
    Then 'PPE list' page loads correctly
