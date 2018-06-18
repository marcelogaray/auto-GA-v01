/**
 * @author: Miguel Rojas
 */
package org.umssdiplo.automationv01.stepdefinitionproject.role;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.home.SSIAHome;
import org.umssdiplo.automationv01.core.managepage.role.RoleList;

public class RoleListStepDefs {
    @Given("^'SSI-A' home page is loaded$")
    public void ssiAHomePageIsLoaded() throws Throwable {
        SSIAHome.load();
    }

    @Then("^Load role list$")
    public void loadRoleList() throws Throwable {
        RoleList.load();
    }
}
