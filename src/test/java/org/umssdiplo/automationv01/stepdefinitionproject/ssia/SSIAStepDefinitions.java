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
import org.umssdiplo.automationv01.core.managepage.role.RoleCreate;
import org.umssdiplo.automationv01.core.managepage.menuheader.safetyMenu.SafetyMenu;
import org.umssdiplo.automationv01.core.managepage.role.RoleDeleteAlert;
import org.umssdiplo.automationv01.core.managepage.role.RoleList;
import org.umssdiplo.automationv01.core.managepage.role.RoleUpdate;
import org.umssdiplo.automationv01.core.managepage.sickness.SicknessCreate;
import org.umssdiplo.automationv01.core.managepage.sickness.SicknessList;
import org.umssdiplo.automationv01.core.managepage.sickness.SicknessUpdate;
import org.umssdiplo.automationv01.core.managepage.workItem.WorkItemList;
import org.umssdiplo.automationv01.core.managepage.menuheader.workItemsMenu.WorkItemsMenu;
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
    private RoleCreate roleCreate;
    private RoleUpdate roleUpdate;
    private RoleDeleteAlert roleDeleteAlert;

    @And("^click in sub menu 'Roles' of menu 'personnel'$")
    public void clickInSubMenuRolesOfMenuPersonnel() throws Throwable {
        roleList = ssiaHome.clickOnRoleMenu();
    }

    @Then("^'Role list' is showed in page$")
    public void roleListIsShowedInPage() throws Throwable {
        Assert.assertTrue(roleList.isRoleListPresent(), "Fail, Role list is not loaded");
    }

    @And("^click in button 'New Role' of role list page$")
    public void clickInButtonNewRoleOfRoleListPage() throws Throwable {
        roleCreate = roleList.clickNewRoleButton();
    }

    @And("^fill 'Role' form using Data Driver Test on create 'Role' page$")
    public void fillRoleFormUsingDataDriverTestOnCreateRolePage() throws Throwable {
        roleCreate.fillRoleUsingDataDriverTest();
    }

    @And("^click in button 'Create' into create form page$")
    public void clickInButtonCreateIntoCreateFormPage() throws Throwable {
        roleList = roleCreate.clickSaveButton();
    }

    @Then("^created 'Role' is showed in role list page$")
    public void createdRoleIsShowedInRoleListPage() throws Throwable {
        Assert.assertEquals(roleList.getLastRoleNameInTable(), DataDriverTest.readValues.getValue("Role.create.name"), "Fail, Role is not created");
    }

    @And("^click in button 'Edit' of 'Role list' page$")
    public void clickInButtonEditOfRoleListPage() throws Throwable {
        roleUpdate = roleList.clickEditButton();
    }

    @And("^update 'Role' in form using Data Driver Test on update 'Role' page$")
    public void updateRoleInFormUsingDataDriverTestOnUpdateRolePage() throws Throwable {
        roleUpdate.updateRoleUsingDataDriverTest();
    }

    @And("^click in button 'Update' into update 'Role' form page$")
    public void clickInButtonUpdateIntoUpdateRoleFormPage() throws Throwable {
        roleList = roleUpdate.clickUpdateButton();
    }

    @Then("^updated 'Role' is showed in 'Role list' page$")
    public void updatedRoleIsShowedInRoleListPage() throws Throwable {
        Assert.assertEquals(roleList.getLastRoleNameInTable(), DataDriverTest.readValues.getValue("Role.update.name"), "Fail, Role is not updated");
    }

    @And("^click in button 'Delete' of 'Role list' page$")
    public void clickInButtonDeleteOfRoleListPage() throws Throwable {
        roleDeleteAlert = roleList.clickDeleteButton();
    }

    @And("^click in button 'Accept' of delete 'Role' confirmation popup$")
    public void clickInButtonAcceptOfDeleteRoleConfirmationPopup() throws Throwable {
        roleList = roleDeleteAlert.clickAcceptButton();
    }

    @Then("^deleted 'Role' is not showed in 'Role list' page$")
    public void deletedRoleIsNotShowedInRoleListPage() throws Throwable {
        Assert.assertNotEquals(roleList.getLastRoleNameInTable(), roleDeleteAlert.getRoleName(), "Fail, Role is not deleted");
    }

    //Sickness
    private SicknessList sicknessList;
    private SicknessCreate sicknessCreate;
    private SicknessUpdate sicknessUpdate;

    @And("^click in sub menu 'Sickness' of menu 'Safety'$")
    public void clickInSubMenuSicknessOfMenuSafety() throws Throwable {
        sicknessList = safetyMenu.clickSicknessMenu();
    }

    @Then("^'Sickness list' is showed in page$")
    public void sicknessListIsShowedInPage() throws Throwable {
        Assert.assertTrue(sicknessList.isSicknessListPresent(), "Fail, Sickness list is not loaded");
    }

    @And("^click in button 'New Sickness' of sickness list page$")
    public void clickInButtonNewSicknessOfSicknessListPage() throws Throwable {
        sicknessCreate = sicknessList.clickNewSicknessButton();
    }

    @And("^fill 'Sickness' form using Data Driver Test on create 'Sickness' page$")
    public void fillSicknessFormUsingDataDriverTestOnCreateSicknessPage() throws Throwable {
        sicknessCreate.fillSicknessUsingDataDriverTest();
    }

    @And("^click in button 'Save' into 'Sickness' create form page$")
    public void clickInButtonSaveIntoSicknessCreateFormPage() throws Throwable {
        sicknessList = sicknessCreate.clickSaveButton();
    }

    @Then("^created 'Sickness' is showed in 'Sickness list' page$")
    public void createdSicknessIsShowedInSicknessListPage() throws Throwable {
        Assert.assertEquals(sicknessList.getLastSicknessDescriptionInTable(), DataDriverTest.readValues.getValue("Sickness.create.description"), "Fail, Sickness is not created");
    }

    @And("^click in button 'Edit' of 'Sickness list' page$")
    public void clickInButtonEditOfSicknessListPage() throws Throwable {
        sicknessUpdate = sicknessList.clickEditButton();
    }

    @And("^update 'Sickness' in form using Data Driver Test on update 'Sickness' page$")
    public void updateSicknessInFormUsingDataDriverTestOnUpdateSicknessPage() throws Throwable {
        sicknessUpdate.updateSicknessUsingDataDriverTest();
    }

    @And("^click in button 'Update' into update 'Sickness' form page$")
    public void clickInButtonUpdateIntoUpdateSicknessFormPage() throws Throwable {
        sicknessList = sicknessUpdate.clickUpdateButton();
    }

    @Then("^updated 'Sickness' is showed in 'Sickness list' page$")
    public void updatedSicknessIsShowedInSicknessListPage() throws Throwable {
        Assert.assertEquals(sicknessList.getLastSicknessDescriptionInTable(), DataDriverTest.readValues.getValue("Sickness.update.description"), "Fail, Sickness is not updated");
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
