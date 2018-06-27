package org.umssdiplo.automationv01.stepdefinitionproject.ssia;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.audit.AuditList;
import org.umssdiplo.automationv01.core.managepage.accident.AccidentList;
import org.umssdiplo.automationv01.core.managepage.employee.EmployeeList;
import org.umssdiplo.automationv01.core.managepage.home.SSIAHome;
import org.umssdiplo.automationv01.core.managepage.menuheader.safetyMenu.SafetyMenu;
import org.umssdiplo.automationv01.core.managepage.role.RoleList;
import org.umssdiplo.automationv01.core.managepage.workItem.WorkItemDelete;
import org.umssdiplo.automationv01.core.managepage.workItem.WorkItemList;
import org.umssdiplo.automationv01.core.managepage.menuheader.workItemsMenu.WorkItemsMenu;
import org.umssdiplo.automationv01.core.managepage.workItem.WorkItemCreate;
import org.umssdiplo.automationv01.core.managepage.workItem.WorkItemUpdate;
import org.umssdiplo.automationv01.core.utils.LoadPage;
import org.umssdiplo.automationv01.core.utils.DataDriverTest;


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
    public void clickPersonnelMenu() throws Throwable {
        ssiaHome.clickOnPersonnelMenu();
    }

    @And("Clicking on Employee submenu into 'Personnel' menu")
    public void clickEmployeeMenu() throws Throwable {
        employeeList = ssiaHome.clickOnEmployeeMenu();
    }

    // Employees List
    @And("Clicking on NewEmployee button")
    public void clickNewEmployeeBtn() throws Throwable {
        employeeList.clickNewEmployeeButton();
    }

    @Then("'Employee List' page loads correctly")
    public void isEmployeeListPresent() throws Throwable {
        boolean result = employeeList.isEmployeeListPresent();
        Assert.assertTrue(result, "Fail, Employe list is not loaded");
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
    private WorkItemCreate workItemCreate;
    private WorkItemDelete workItemDelete;
    private WorkItemUpdate workItemUpdate;

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

    @And("click in button 'New Work Item' of Work Item list page")
    public void clickInButtonNewWorkItemOfWorkItemListPage() throws Throwable {
        workItemCreate = workItemList.clickNewCreateItemButton();
    }

    @And("fill 'Work Item' form using Data Driver Test on create 'Work Item' page")
    public void fillItemFormUsingDataDriverTestOnCreateWorkItemPage() throws Throwable {
        workItemCreate.fillWorkItemUsingDataDriverTest();
    }

    @And("click in button 'Create' into create form page")
    public void clickInButtonCreateIntoCreateFormPage() throws Throwable {
        workItemList = workItemCreate.clickSaveButton();
    }

    @Then("created 'WorkItem' is showed in Work Item List page")
    public void createdItemIsShowedInWorkItemListPage() throws Throwable {
        Assert.assertEquals(workItemList.getLastWorkItemNameInTable(), DataDriverTest.readValues.getValue("WorkItem.create.name"), "Fail, Work Item is not created");
    }

    @And("click in button 'Delete' of 'Work Item list' page")
    public void clickInButtonDeleteOfWorkItemListPage() throws Throwable {
        workItemDelete = workItemList.clickDeleteButton();
    }
    @And("click in button 'Accept' of delete 'WorkItem' confirmation popup")
    public void clickInButtonAcceptOfDeleteWorkItemConfirmationPopup() throws Throwable {
        workItemList = workItemDelete.clickAcceptButton();
    }

    @Then("'WorkItem' deleted is removed from 'Work item list' page")
    public void deletedWorkItemIsNotShowedInWorkItemListPage() throws Throwable {
        Assert.assertNotEquals(workItemList.getLastWorkItemNameInTable(), workItemDelete.getWorkItemName(), "Fail, Work Item is not deleted");
    }

    @And("click in button 'Edit' of 'Work Item list' page")
    public void clickInButtonEditOfWorkItemListPage() throws Throwable {
        workItemUpdate = workItemList.clickEditButton();
    }

    @And("update 'WorkItem' in form using on update 'WorkItem' page")
    public void updateRoleInFormUsingDataDriverTestOnUpdateRolePage() throws Throwable {
        workItemUpdate.updateWorkItemUsingDataDriverTest();
    }

    @And("click in button 'Update' into update 'WorkItem' form page")
    public void clickInButtonUpdateIntoUpdateWorkItemFormPage() throws Throwable {
        workItemList = workItemUpdate.clickUpdateButton();
    }
    @Then("updated 'WorkItem' is showed in 'Work Item list' page")
    public void updatedWorkItemIsShowedInRoleListPage() throws Throwable {
        Assert.assertEquals(workItemList.getLastWorkItemNameInTable(), DataDriverTest.readValues.getValue("WorkItem.update.name"), "Fail, WorkItem is not updated");
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
