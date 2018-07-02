# @Author: Linet Torrico
# Feature: Listado de Clasificacion de Herramientas

Feature: Listado de Clasificacion  de herramienta de trabajo
  Scenario: Todos los datos  de la Clasificacion de herramientas de trabajo son mostrados en una lista
    Given 'SSI-A' home page is loaded
    And click Work Items 'menu' on 'Header' page
    And click 'Item Classification' sub menu on 'Work Items' menu
    Then 'Item Classification List' page loads correctly

