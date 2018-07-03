# @Author: Marcelo Loayza
# Feature: Function manual List
Feature: Function Manual

  Scenario: new function manual created is displayed in the page
    Given 'SSI-A' home page is loaded
    And click 'function manual' on 'Header' page
    And click 'New Manual' button
    And fill the 'New Manual' form
    And click on the 'Save' button
    Then new function manual is showed in page