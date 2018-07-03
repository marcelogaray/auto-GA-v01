# @Author: Linet Torrico
# Feature: Registrar datos de una herramienta de trabajo

Feature: Registrar datos de una herramienta de trabajo
  Scenario: Herramienta de trabajo - Registrar datos de una herramienta
    Given 'SSI-A' home page is loaded
    And click Work Items 'menu' on 'Header' page
    And click 'Work Item' sub menu on 'Work Items' menu
    And click in button 'New Work Item' of Work Item list page
    And fill 'Work Item' form using Data Driver Test on create 'Work Item' page
    And click in button 'Create' into create form page
    Then created 'WorkItem' is showed in Work Item List page