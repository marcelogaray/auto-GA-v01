# feature to review behaviour of sickness list
Feature: SicknessList
  Scenario: Enfermedades - Todos los datos de enfermedades son mostrados en una lista
    Given 'SSI-A' home page is loaded
    And click 'Safety' menu on 'Header' page
    And click sub menu 'Sickness' of menu 'Safety'
    Then 'Sickness list' is showed in page