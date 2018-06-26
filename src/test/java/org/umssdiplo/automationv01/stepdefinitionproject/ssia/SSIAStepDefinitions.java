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
import org.umssdiplo.automationv01.core.managepage.ppe.PPEClassificationCreate;
import org.umssdiplo.automationv01.core.managepage.ppe.PPEClassificationList;
import org.umssdiplo.automationv01.core.managepage.role.RoleList;
import org.umssdiplo.automationv01.core.managepage.workItem.WorkItemList;
import org.umssdiplo.automationv01.core.managepage.menuheader.workItemsMenu.WorkItemsMenu;
import org.umssdiplo.automationv01.core.utils.DataDriverTest;
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
    public void clickPersonnelMenu() throws Throwable {
        ssiaHome.clickPersonnelMenu();
    }

    @And("Click 'PPE' menu on 'Header' page")
    public void clickPPEMenu() throws Throwable {
        ssiaHome.clickPPEMenu();
    }

    @And("Clicking on Employee submenu into 'Personnel' menu")
    public void clickEmployeeMenu() throws Throwable {
        employeeList = ssiaHome.clickEmployeeMenu();
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
        roleList = ssiaHome.clickRoleMenu();
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

    // PPE Classification List
    private PPEClassificationList ppeClassificationList;

    @And("^Click 'PPE Classification' sub menu of 'PPE' menu$")
    public void clickSubMenuPPEClassification() throws Throwable {
        ppeClassificationList = ssiaHome.clickPPEClassificationSubMenu();
    }

    @Then("^'PPE Classification list' page loads correctly$")
    public void PPEClassificationListIsShowedInPage() throws Throwable {
        Assert.assertTrue(ppeClassificationList.isPPEClassificationListPresent(), "Fail, PPE Classification list is not loaded");
    }

    private PPEClassificationCreate ppeClassificationCreate;

    @And("^Click 'New PPE Classification' button of 'PPE Classification list' page$")
    public void clickButtonNewPPEClassification() throws Throwable {
        ppeClassificationCreate = ppeClassificationList.clickNewPPEClassification();
    }

    @And("^Fill 'PPE Classification' form using Data Driver Test on create 'PPE Classification' page$")
    public void fillRoleFormUsingDataDriverTestOnCreateRolePage() throws Throwable {
        ppeClassificationCreate.fillPPEClassificatinUsingDataDriverTest();
    }

    @And("^Click 'Save' button into create 'PPE Classification' form page$")
    public void clickSaveButtonInCreateNewPPEClassificationFormPage() throws Throwable {
        ppeClassificationList = ppeClassificationCreate.clickSaveButton();
    }

    @Then("^Created 'PPE Classification' is showed in PPE Classification list page$")
    public void createdPPEClassificationIsShowedInPPEClassificationListPage() throws Throwable {
        Assert.assertEquals(ppeClassificationList.getLastPPEClassificationNameInTable(), DataDriverTest.readValues.getValue("PPEClassification.create.name"), "Fail, PPE Classification is not created");
    }

    @And("^Click 'Cancel' button into create 'PPE Classification' form page$")
    public void clickCancelButtonInCreateNewPPEClassificationFormPage() throws Throwable {
        ppeClassificationList = ppeClassificationCreate.clickCancelButton();
    }

    @Then("^Cancel creation 'PPE Classification' is not showed in PPE Classification list page$")
    public void cancelCreationPPEClassificationIsNotShowedInPPEClassificationListPage() throws Throwable {
        Assert.assertNotEquals(ppeClassificationList.getLastPPEClassificationNameInTable(), DataDriverTest.readValues.getValue("PPEClassification.create.name"), "Fail, PPE Classification is not created");
    }
    // Existing PPE List

    // Existing PPE Assigned List

    // Audit List
    private AuditList auditList;

    @And("Click 'Audit' submenu into 'Audits' menu on 'Header' page")
    public void clickAuditMenu() throws Throwable {
        auditList = ssiaHome.clickAuditMenu();
    }

    @Then("^'Audit List' page loads correctly$")
    public void auditListIsShowedInPage() throws Throwable {
        Assert.assertTrue(auditList.isAuditListPresent(), "Fail, Audit list is not loaded");
    }
}
