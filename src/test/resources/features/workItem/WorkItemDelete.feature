# feature to review behaviour of remove Work item
Feature: WorkItemDelete
  Scenario: WorkItem - Eliminar una herramienta de trabajo
    Given 'SSI-A' home page is loaded
    And click Work Items 'menu' on 'Header' page
    And click 'Work Item' sub menu on 'Work Items' menu
    And click in button 'Delete' of 'Work Item list' page
    And click in button 'Accept' of delete 'WorkItem' confirmation popup
    Then deleted 'WorkItem' is not showed in 'Work item list' page
