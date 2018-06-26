package org.umssdiplo.automationv01.stepdefinitionproject.ssia;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.audit.AuditList;
import org.umssdiplo.automationv01.core.managepage.accident.AccidentList;
import org.umssdiplo.automationv01.core.managepage.department.DepartmentCreate;
import org.umssdiplo.automationv01.core.managepage.department.DepartmentEdit;
import org.umssdiplo.automationv01.core.managepage.department.DepartmentList;
import org.umssdiplo.automationv01.core.managepage.employee.EmployeeCreate;
import org.umssdiplo.automationv01.core.managepage.employee.EmployeeList;
import org.umssdiplo.automationv01.core.managepage.home.SSIAHome;
import org.umssdiplo.automationv01.core.managepage.menuheader.safetyMenu.SafetyMenu;
import org.umssdiplo.automationv01.core.managepage.role.RoleList;
import org.umssdiplo.automationv01.core.managepage.workItem.WorkItemList;
import org.umssdiplo.automationv01.core.managepage.menuheader.workItemsMenu.WorkItemsMenu;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author: Lizeth Salazar
 */
public class SSIAStepDefinitions extends BasePage {

    private SSIAHome ssiaHome;
    private EmployeeList employeeList;
    private EmployeeCreate employeeCreate;

    //SSIA Home
    @Given("'SSI-A' home page is loaded")
    public void ssiAHomePageIsLoaded() throws Throwable {
        ssiaHome = LoadPage.SSIAHomePage();
    }

    @And("click 'Personnel' menu on 'Header' page")
    public void clickPersonnelMenu() throws Throwable{
        ssiaHome.clickOnPersonnelMenu();
    }

    @And("click 'Employee' submenu into 'Personnel' menu")
    public void clickEmployeeMenu() throws Throwable{
        employeeList = ssiaHome.clickOnEmployeeMenu();
    }

    // Employees List
    @And("click 'New Employee' button in 'Employees List' page")
    public void clickNewEmployeeBtn() throws Throwable{
        employeeCreate = employeeList.clickNewEmployeeButton();
    }

    @Then("'Employee List' page loads correctly")
    public void isEmployeeListPresent() throws Throwable {
        boolean result = employeeList.isEmployeeListPresent();
        Assert.assertTrue(result, "Fail, Employe list is not loaded");
    }

    // Employee Create
    @And("click 'Save' button in 'New Employee' page")
    public void clickSaveEmployee() throws Throwable{
        employeeCreate.clickSaveEmployeeBtn();
    }

    @Then("'Please fill required fields' error pops up")
    public void isRequiredErrorDisplayed() throws Throwable{
        String actualResult = employeeCreate.isRequiredErrorDisplayed();
        employeeCreate.clickOKInAlert();
        Assert.assertEquals(actualResult, "Please fill required fields");
    }

    @And("click 'OK' button in 'Alert'")
    public void clickOKBtnInAlert() throws Throwable{
        employeeCreate.clickOKInAlert();
    }

    // Department List
    private DepartmentList departmentList;
    private DepartmentCreate departmentCreate;
    private DepartmentEdit departmentEdit;

    @And("click 'Department' submenu into 'Personnel' menu")
    public void clickDepartmentMenu() throws Throwable{
        departmentList = ssiaHome.clickDepartmentMenu();
    }

    @And("click 'New Department' button in 'Departments List' page")
    public void clickNewDepartmentBtn() throws Throwable{
        departmentCreate = departmentList.clickNewDepartmentButton();
    }

    @And("click 'Edit Department' button in 'Departments List' page")
    public void clickEditDepartmentBtn() throws Throwable{
        departmentEdit = departmentList.clickEditDepartmentButton();
    }

    @Then("'Department List' page loads correctly")
    public void isDepartmentListPresent() throws Throwable {
        boolean result = departmentList.isDepartmentListPresent();
        Assert.assertTrue(result, "Fail, Department list is not loaded");
    }

    @Then("\"(.*)\" and \"(.*)\" are displayed in 'Department List' page")
    public void isNewDepartmentDisplayedInList(String departmentName, String departmentDescription) throws Throwable {
        boolean dptoName = departmentList.isDepartmentNamePresent(departmentName);
        boolean dptoDesc = departmentList.isDepartmentNamePresent(departmentDescription);
        Assert.assertTrue(dptoName & dptoDesc, "Fail, Department list is not loaded");
    }

    // Department Create
    @And("fill \"(.*)\" in 'Name' text box in 'New Department' page")
    public void fillNameInput(String departmentName) throws Throwable{
        departmentCreate.fillNameInput(departmentName + new Timestamp(new Date().getTime()));
    }
    @And("fill \"(.*)\" in 'Description' text box in 'New Department' page")
    public void fillDescriptionInput(String departmentDescription) throws Throwable{
        departmentCreate.fillDescriptionInput(departmentDescription + new Timestamp(new Date().getTime()));
    }

    @And("click 'Save' button in 'New Department' page")
    public void clickSaveDepartment() throws Throwable{
        departmentList = departmentCreate.clickSaveDepartmentBtn();
    }

    @And("click 'Cancel' button in 'New Department' page")
    public void clickCancelDepartment() throws Throwable{
        departmentList = departmentCreate.clickCancelDepartmentBtn();
    }

    // Department Edit
    @And("fill \"(.*)\" in 'Name' text box in 'Edit Department' page")
    public void editNameInput(String departmentName) throws Throwable{
        departmentEdit.fillNameInput(departmentName + new Timestamp(new Date().getTime()));
    }
    @And("fill \"(.*)\" in 'Description' text box in 'Edit Department' page")
    public void editDescriptionInput(String departmentDescription) throws Throwable{
        departmentEdit.fillDescriptionInput(departmentDescription + new Timestamp(new Date().getTime()));
    }

    @And("click 'Update' button in 'Edit Department' page")
    public void clickUpdateDepartment() throws Throwable{
        departmentList = departmentEdit.clickUpdateDepartmentBtn();
    }

    @And("click 'Cancel' button in 'Edit Department' page")
    public void clickCancelEditionDepartment() throws Throwable{
        departmentList = departmentEdit.clickCancelDepartmentBtn();
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
    private WorkItemsMenu workItemsMenu;
    private WorkItemList workItemList;

    @Given("click Work Items 'menu' on 'Header' page")
    public void clickWorkItemsMenu() throws Throwable {
        workItemsMenu = ssiaHome.clickWorkItemsMenu();
    }

    @And("click 'Work Item' sub menu on 'Work Items' menu")
    public void clickWorkItemSubMenu() throws Throwable {
        workItemList = workItemsMenu.clickAccidentMenu();
    }

    @Then("'Work Item List' page loads correctly")
    public void workItemListIsShowedInPage() throws Throwable {
        Assert.assertTrue(workItemList.isWorkItemListPresent(), "Fail, Work Item List is not loaded");
    }


    // Manual List

    // Safety List

    private SafetyMenu safetyMenu;
    private AccidentList accidentList;

    @Given("click Safety 'menu' on 'Header' page")
    public void clickSafetyMenu() throws Throwable {
        safetyMenu = ssiaHome.clickSafetyMenu();
    }

    @And("click 'Accident' sub menu on 'Safety' menu")
    public void clickAccidentMenu() throws Throwable {
        accidentList = safetyMenu.clickAccidentMenu();
    }

    @Then("'Accident list' page loads correctly")
    public void isAccidentListPresent() throws Throwable {
        Assert.assertTrue(accidentList.isAccidentListPresent(), "Fail, Accident List is not loaded");
    }
    // PPE List

    // Audit List
    private AuditList auditList;

    @And("Click 'Audit' submenu into 'Audits' menu on 'Header' page")
    public void clickAuditMenu() throws Throwable{
        auditList = ssiaHome.clickAuditMenu();
    }

    @Then("^'Audit List' page loads correctly$")
    public void auditListIsShowedInPage() throws Throwable {
        Assert.assertTrue(auditList.isAuditListPresent(), "Fail, Audit list is not loaded");
    }
}
