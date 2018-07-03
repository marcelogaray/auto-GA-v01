# @Author: Marcelo Loayza
# Feature: Function manual Edit
Feature: FunctionManualDelete

  Scenario: Function manual deleted is not displayed
    Given 'SSI-A' home page is loaded
    And click 'function manual' on 'Header' page
    And click 'delete' button of a selected function manual
    And click 'Accept' of delete 'Manual' confirmation popup
    Then deleted 'Manual' is not showed in 'Manual list' page