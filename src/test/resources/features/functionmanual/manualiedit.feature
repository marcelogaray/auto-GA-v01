# @Author: Marcelo Loayza
# Feature: Function manual List
Feature: Function Manual

  Scenario: Function manual is updated after an edit was completed
    Given 'SSI-A' home page is loaded
    And click 'function manual' on 'Header' page
    And click 'edit' button of a selected function manual
    And fill the 'edit Manual' form
    And click on the 'Update' button
    Then edited changes of the function manual are displayed in page