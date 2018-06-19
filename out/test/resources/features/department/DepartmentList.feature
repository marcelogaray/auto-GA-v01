# Department List feature
Feature: DepartmentList

  Scenario: Department list is displayed once home page is load
    Given 'SSI-A' home page is loaded
    Then Load role list
