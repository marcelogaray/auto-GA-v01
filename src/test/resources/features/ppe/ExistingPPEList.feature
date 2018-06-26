# @Author: Walker Colina
# feature to review behaviour of existing ppe list
Feature: ExistingPPEList

  Scenario: Una vez seleccionado el menu Existing PPE todos los Equipos existentes deben ser mostrados en una lista.
    Given 'SSI-A' home page is loaded
    And Click 'PPE' menu on 'Header' page
    And Click 'Existing PPE' sub menu of 'PPE' menu
    Then 'Existing PPE list' page loads correctly
