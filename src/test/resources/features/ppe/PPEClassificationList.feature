# @Author: Walker Colina
# feature to review behaviour of ppe classification list
Feature: PPEClassificationList

  Scenario: Clasificacion de equipo de proteccion personal - Todos los datos de clasificacion de equipos de proteccion personal son mostrados en una lista
    Given 'SSI-A' home page is loaded
    And Click 'PPE' menu on 'Header' page
    And Click 'PPE Classification' sub menu of 'PPE' menu
    Then 'PPE Classification list' page loads correctly
