# @Author: Henry Bustamante
# Feature: createAccident

Feature: CreateAccident
  Scenario: new accident created is displayed on list of accidents when we clicked on 'save' button
    Given  'SSI-A' home page is loaded
    And click Safety 'menu' on 'Header' page
    And click 'Accident' sub menu on 'Safety' menu
    And click 'New accident for Employee' button on 'Accident' list page
    And fill all information required for 'Accident' form
    And click 'save' button on 'Accident' form
    Then 'Accident list' page loads correctly
