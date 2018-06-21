package org.umssdiplo.automationv01.stepdefinitionproject.ssia;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.employee.EmployeeList;
import org.umssdiplo.automationv01.core.managepage.home.SSIAHome;
import org.umssdiplo.automationv01.core.managepage.role.RoleCreate;
import org.umssdiplo.automationv01.core.managepage.role.RoleList;
import org.umssdiplo.automationv01.core.utils.LoadPage;
import org.umssdiplo.automationv01.core.utils.SSIAResourceManager;

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
    private RoleCreate roleCreate;

    @And("^Click in sub menu 'Roles' of menu 'personnel'$")
    public void clickInSubMenuRolesOfMenuPersonnel() throws Throwable {
        roleList = ssiaHome.clickOnRoleMenu();
    }

    @Then("^'Role list' is showed in page$")
    public void roleListIsShowedInPage() throws Throwable {
        Assert.assertTrue(roleList.isRoleListPresent(), "Fail, Role list is not loaded");
    }

    @And("^Click in button 'New Role' of role list page$")
    public void clickInButtonNewRoleOfRoleListPage() throws Throwable {
        roleCreate = roleList.clickOnNewRoleButton();
    }

    @And("^Set 'role' data in create form page$")
    public void setRoleDataInCreateFormPage() throws Throwable {
        roleCreate.fillRole();
    }

    @And("^Click in button 'Create' into create form page$")
    public void clickInButtonCreateIntoCreateFormPage() throws Throwable {
        roleList = roleCreate.clickOnSaveButton();
    }

    @Then("^Created 'Role' is showed in role list page$")
    public void createdRoleIsShowedInRoleListPage() throws Throwable {
        Assert.assertEquals(roleList.getLastRoleNameInTable(), SSIAResourceManager.i.getKey("Role.create.name"), "Fail, Role is not created");
    }

    // Work Item List

    // Manual List

    // Safety List

    // PPE List

    // Audit List

}
