package org.umssdiplo.automationv01.stepdefinitionproject.HomeSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Home.SSIAHome;

/**
 * @Author: Lizeth Salazar
 */
public class HomeSteps {

    @Given("SSI-A home page is loaded")
    public void ssiAHomePageIsLoaded() throws Throwable {
        SSIAHome.load();
    }

    @And("Clicking on Personnel menu")
    public void clickPersonnelMenu() throws Throwable{
        SSIAHome.clickOnPersonnelMenu();
    }

    @And("Clicking on Employee menu")
    public void clickEmployeeMenu() throws Throwable{
        SSIAHome.clickOnEmployeeMenu();
    }
}
