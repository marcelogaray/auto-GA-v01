# @Author: Walker Colina
# feature to review behaviour of ppe list
Feature: PPEist

  Scenario: La insercion de registro para un de equipo de proteccion personal se muestra en la lista de de equipo de proteccion personal cuando presiono boton Save
    Given 'SSI-A' home page is loaded
    And Click 'PPE' menu on 'Header' page
    And Click 'PPE' sub menu of 'PPE' menu
    Then 'PPE list' page loads correctly
