# @Author: Neyber Rojas
# Feature: Safety Rules List

Feature: SafetyRulesList
  Scenario: List of Safety Rules is displayed after selecting "Safety Rules" option
    Given 'SSI-A' home page is loaded
    And click 'Safety Rules' submenu into 'Audits' menu on 'Header' page
    Then 'Safety Rules List' page loads correctly
