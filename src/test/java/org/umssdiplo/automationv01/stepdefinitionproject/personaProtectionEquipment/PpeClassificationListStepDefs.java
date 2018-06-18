/**
 * @author: Walker Colina
 */
package org.umssdiplo.automationv01.stepdefinitionproject.personaProtectionEquipment;

        import cucumber.api.java.en.Given;
        import cucumber.api.java.en.Then;
        import org.umssdiplo.automationv01.core.managepage.home.SSIAHome;
        import org.umssdiplo.automationv01.core.managepage.personalProtectionEquipment.PpeClassificationList;

public class PpeClassificationListStepDefs {
    @Given("^'SSI-A' home page is loaded$")
    public void ssiAHomePageIsLoaded() throws Throwable {
        SSIAHome.load();
    }

    @Then("^Load ppe classifications list$")
    public void loadPpeClassificationList() throws Throwable {
        PpeClassificationList.load();
    }
}