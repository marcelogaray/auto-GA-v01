package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class CommonStepdef {
    @Given("^Profile is loaded$")
    public void tesitngPathToGenerateFiled() throws Throwable {
        System.out.println("=====================");
        System.out.println("new file generated");
        System.out.println("=====================");
    }

    @Given("^'PHP travel' page is loaded$")
    public void phpProfilePageIsLoaded() throws Throwable {
        profile= Page.loginPage();
        System.out.println("el valor del login es::::::::::::::::::::::::::::::: "+login);
    }
}
