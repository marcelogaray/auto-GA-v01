package org.umssdiplo.automationv01.stepdefinitionproject.ssia;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.employee.EmployeeList;
import org.umssdiplo.automationv01.core.managepage.home.SSIAHome;
import org.umssdiplo.automationv01.core.managepage.personlProtectionEquipment.PpeClassificationList;
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

    @And("Clicking on PPE menu on 'Header' page")
    public void clickPpeMenu() throws Throwable{
        ssiaHome.clickOnPpeMainMenu();
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

    // PPE Classification List
    private PpeClassificationList ppeClassificationList;

    @And("^Click in sub menu 'PPE Classification' of menu 'PPE'$")
    public void clickInSubMenuPpeClassificationOfMenuPpe() throws Throwable {
        ppeClassificationList = ssiaHome.clickOnPpeClassificationMenu();
    }

    @Then("^'Ppe Classification list' is showed in page$")
    public void ppeClassificationListIsShowedInPage() throws Throwable {
        Assert.assertTrue(ppeClassificationList.isPpeClassificationListPresent(), "Fail, PPE Classification list is not loaded");
    }

    // PPE List

    // Existing PPE List

    // Existing PPE Assigned List

    // Audit List

}
