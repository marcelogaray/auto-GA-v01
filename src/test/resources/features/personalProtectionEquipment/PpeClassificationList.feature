# feature to review behaviour of ppe classification list
Feature: PpeClassificationList
  Scenario: Clasificacion de equipo de proteccion personal - Todos los datos de clasificacion de equipos de proteccion personal son mostrados en una lista
    Given 'SSI-A' home page is loaded
    And Clicking on PPE menu on 'Header' page
    And Click in sub menu 'PPE Classification' of menu 'PPE'
    Then 'Ppe Classification list' is showed in page
