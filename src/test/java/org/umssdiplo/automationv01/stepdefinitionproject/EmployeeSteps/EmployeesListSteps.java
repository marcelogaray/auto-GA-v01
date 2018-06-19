package org.umssdiplo.automationv01.stepdefinitionproject.EmployeeSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Employee.EmployeeList;

/**
 * @Author: Lizeth Salazar
 */

public class EmployeesListSteps {

    @Then("Load Employee List")
    public void employeeListLoaded() throws Throwable{
        EmployeeList.load();
    }

    @And("Clicking on NewEmployee button")
    public void clickNewEmployeeBtn() throws Throwable{
        EmployeeList.clickNewEmployeeButton();
    }
}
