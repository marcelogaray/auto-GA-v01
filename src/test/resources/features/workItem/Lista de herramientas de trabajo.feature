# @Author: Linet Torrico
# Feature: Work Item List

Feature: Lista de herramientas de trabajo
  Scenario: Todos los datos de herramientas de trabajo son mostrados en una lista
    Given 'SSI-A' home page is loaded
    And click Work Items 'menu' on 'Header' page
    And click 'Work Item' sub menu on 'Work Items' menu
    Then 'Work Item List' page loads correctly

