package org.umssdiplo.automationv01.stepdefinitionproject.workItem;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.home.SSIAHome;
import org.umssdiplo.automationv01.core.managepage.workItem.WorkItemList;

/**
 * @author Neyber Rojas Zapata
 */
public class WorkItemListStepDefinition {

    @Given("^'SSI-A' home page is loaded$")
    public void ssiAHomePageIsLoaded() throws Throwable {
        SSIAHome.load();
    }

    @Then("^Load workItem list$")
    public void loadWorkItemList() throws Throwable {
        WorkItemList.load();
    }
}
