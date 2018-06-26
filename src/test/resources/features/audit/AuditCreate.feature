# @Author: Neyber Rojas
# Feature: Audit Create

Feature: AuditCreate
  Scenario: Register Audit
    Given 'SSI-A' home page is loaded
    And Click 'Audit' submenu into 'Audits' menu on 'Header' page
    And Click 'New Audit' button on Audit List page
    And Fill 'Audit' form
    And Click 'Create' button after fill form
    Then 'Created Audit' is showed in Audit List page

