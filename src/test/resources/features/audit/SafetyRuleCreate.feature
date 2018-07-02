# @Author: Neyber Rojas
# Feature: Safety Rule Create

Feature: SafetyRuleCreate
  Scenario: Assign Safety Rule to Audit
    Given 'SSI-A' home page is loaded
    And Click 'Safety Rules' submenu into 'Audits' menu on 'Header' page
    And click 'Assing Safety Rule to Audit' button on Safety Rule List page
    And Fill 'Safety Rule' form
    And click 'Create' button after fill form
    Then 'Assigned Safety Rule' is showed in Safety Rule List page
