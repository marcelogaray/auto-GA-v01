/**
 * @author: Miguel Rojas
 */
package org.umssdiplo.automationv01.stepdefinitionproject.department;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.home.SSIAHome;
import org.umssdiplo.automationv01.core.managepage.department.DepartmentList;

public class DepartmentListStepDefs {
    @Given("^'SSI-A' home page is loaded$")
    public void ssiAHomePageIsLoaded() throws Throwable {
        SSIAHome.load();
    }


    @Then("^Load role list$")
    public void loadRoleList() throws Throwable {
        DepartmentList.load();
    }
}
