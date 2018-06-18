# Work Item List feature
Feature: WorkItemList

  Scenario: WorkItem list is displayed once home page is loaded
    Given 'SSI-A' home page is loaded
    Then Load workItem list
