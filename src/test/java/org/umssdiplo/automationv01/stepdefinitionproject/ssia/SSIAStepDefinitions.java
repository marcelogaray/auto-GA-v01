package org.umssdiplo.automationv01.stepdefinitionproject.ssia;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.accident.AccidentList;
import org.umssdiplo.automationv01.core.managepage.employee.EmployeeList;
import org.umssdiplo.automationv01.core.managepage.home.SSIAHome;
import org.umssdiplo.automationv01.core.managepage.menuheader.safetyMenu.SafetyMenu;
import org.umssdiplo.automationv01.core.managepage.role.RoleList;
import org.umssdiplo.automationv01.core.utils.LoadPage;

/**
 * @Author: Lizeth Salazar
 */
public class SSIAStepDefinitions extends BasePage {

    private SSIAHome ssiaHome;
    private EmployeeList employeeList;

    //SSIA Home
    @Given("'SSI-A' home page is loaded")
    public void ssiAHomePageIsLoaded() throws Throwable {
        ssiaHome = LoadPage.SSIAHomePage();
    }

    @And("Clicking on Personnel menu on 'Header' page")
    public void clickPersonnelMenu() throws Throwable{
        ssiaHome.clickOnPersonnelMenu();
    }

    @And("Clicking on Employee submenu into 'Personnel' menu")
    public void clickEmployeeMenu() throws Throwable{
        employeeList = ssiaHome.clickOnEmployeeMenu();
    }

    // Employees List
    @And("Clicking on NewEmployee button")
    public void clickNewEmployeeBtn() throws Throwable{
        employeeList.clickNewEmployeeButton();
    }

    @Then("'Employee List' page loads correctly")
    public void isEmployeeListPresent() throws Throwable{
        boolean result = employeeList.isEmployeeListPresent();
        Assert.assertTrue(result);
    }

    // Role List
    private RoleList roleList;

    @And("^Click in sub menu 'Roles' of menu 'personnel'$")
    public void clickInSubMenuRolesOfMenuPersonnel() throws Throwable {
        roleList = ssiaHome.clickOnRoleMenu();
    }

    @Then("^'Role list' is showed in page$")
    public void roleListIsShowedInPage() throws Throwable {
        Assert.assertTrue(roleList.isRoleListPresent(), "Fail, Role list is not loaded");
    }

    // Work Item List

    // Manual List

    // Safety List

    private SafetyMenu safetyMenu;
    private AccidentList accidentList;

    @Given("click Safety 'menu' on 'Header' page")
    public void clickSafetyMenu() throws  Throwable{
        safetyMenu = ssiaHome.clickSafetyMenu();
    }

    @And("click 'Accident' sub menu on 'Safety' menu")
    public void clickAccidentMenu() throws  Throwable{
        accidentList = safetyMenu.clickAccidentMenu();
    }

    @Then("'Accident list' page loads correctly")
    public void isAccidentListPresent() throws  Throwable{
        Assert.assertTrue(accidentList.isAccidentListPresent(), "Fail, Accident List is not loaded");
    }
    // PPE List

    // Audit List

}
