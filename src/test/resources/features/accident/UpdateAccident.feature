# @Author: Henry Bustamante
# Feature: updateAccident

Feature: UpdateAccident

  Scenario: an accident update is displayed on list of accidents when we clicked on 'update' button
    Given  'SSI-A' home page is loaded
    And click 'Safety' menu on 'Header' page
    And click 'Accident' sub menu on 'Safety' menu
    And click 'pencil' button on 'Accident' list page
    And set all information required on 'Accident' form
    And click 'update' button on 'Accident' form
    Then 'Accident list' page loads with records edited
