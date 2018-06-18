# Login feature review the behavior in thie feature
Feature: PpeClassificationList

  Scenario: Personal protection equipment list is displayed once home page is load
    Given 'SSI-A' home page is loaded
    Then Load ppe classifications list
