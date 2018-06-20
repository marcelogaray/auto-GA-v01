package org.umssdiplo.automationv01.stepdefinitionproject.home;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.home.SSIAHome;

/**
 * @Author: Lizeth Salazar
 */
public class HomeSteps extends BasePage {

    @Given("SSI-A home page is loaded")
    public void ssiAHomePageIsLoaded() throws Throwable {
        SSIAHome.load();
    }

    @And("Clicking on Personnel menu on header")
    public void clickPersonnelMenu() throws Throwable{
        SSIAHome.clickOnPersonnelMenu();
    }

    @And("Clicking on Employee submenu into Personnel")
    public void clickEmployeeMenu() throws Throwable{
        SSIAHome.clickOnEmployeeMenu();
    }
}
