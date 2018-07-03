# @Author: Marcelo Loayza
# Feature: Function manual List
Feature: Function Manual

  Scenario: Function manual is displayed ones you select the tab function manual
    Given 'SSI-A' home page is loaded
    And click 'function manual' on 'Header' page
    Then 'function manual' page loads correctly