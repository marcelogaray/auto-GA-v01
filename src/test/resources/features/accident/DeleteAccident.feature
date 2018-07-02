# @Author: Henry Bustamante
# Feature: deleteAccident

Feature: DeleteAccident

  Scenario: an accident deleted is not displayed on list of accidents when we clicked on 'update' button
    Given  'SSI-A' home page is loaded
    And click 'Safety' menu on 'Header' page
    And click 'Accident' sub menu on 'Safety' menu
    And click 'trash' button on 'Accident' list page
    And click Accept button on popup to confirm delete 'Accident'
    Then 'Accident list' page loads without record deleted
