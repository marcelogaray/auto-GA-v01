# feature to review behaviour of update work item
Feature: Update Work Item
  Scenario: Herramienta de trabajo - Actualizar datos de una herramienta de trabajo
    Given 'SSI-A' home page is loaded
    And click Work Items 'menu' on 'Header' page
    And click 'Work Item' sub menu on 'Work Items' menu
    And click in button 'Edit' of 'Work Item list' page
    And update 'WorkItem' in form using on update 'WorkItem' page
    And click in button 'Update' into update 'WorkItem' form page
    Then 'Work Item List' page loads correctly
