package org.umssdiplo.automationv01.stepdefinitionproject.ssia;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.accident.AccidentDeleteAlert;
import org.umssdiplo.automationv01.core.managepage.accident.UpdateAccidentForm;
import org.umssdiplo.automationv01.core.managepage.audit.AuditList;
import org.umssdiplo.automationv01.core.managepage.accident.AccidentForm;
import org.umssdiplo.automationv01.core.managepage.accident.AccidentList;
import org.umssdiplo.automationv01.core.managepage.audit.*;
import org.umssdiplo.automationv01.core.managepage.department.DepartmentCreate;
import org.umssdiplo.automationv01.core.managepage.department.DepartmentEdit;
import org.umssdiplo.automationv01.core.managepage.department.DepartmentList;
import org.umssdiplo.automationv01.core.managepage.employee.EmployeeCreate;
import org.umssdiplo.automationv01.core.managepage.employee.EmployeeList;
import org.umssdiplo.automationv01.core.managepage.functionmanual.FunctionManual;
import org.umssdiplo.automationv01.core.managepage.home.SSIAHome;
import org.umssdiplo.automationv01.core.managepage.menuheader.safetyMenu.SafetyMenu;
import org.umssdiplo.automationv01.core.managepage.menuheader.workItemsMenu.ItemClassificationMenu;
import org.umssdiplo.automationv01.core.managepage.role.RoleList;
import org.umssdiplo.automationv01.core.managepage.workItem.ItemClassificationCreate;
import org.umssdiplo.automationv01.core.managepage.workItem.ItemClassificationList;
import org.umssdiplo.automationv01.core.managepage.role.RoleDeleteAlert;
import org.umssdiplo.automationv01.core.managepage.menuheader.workItemsMenu.WorkItemsMenu;
import org.umssdiplo.automationv01.core.managepage.ppe.PPEClassificationCreate;
import org.umssdiplo.automationv01.core.managepage.ppe.PPEClassificationList;
import org.umssdiplo.automationv01.core.managepage.ppe.PPEList;
import org.umssdiplo.automationv01.core.managepage.role.RoleCreate;
import org.umssdiplo.automationv01.core.managepage.workItem.WorkItemDelete;
import org.umssdiplo.automationv01.core.managepage.workItem.WorkItemList;
import org.umssdiplo.automationv01.core.managepage.workItem.WorkItemCreate;
import org.umssdiplo.automationv01.core.managepage.workItem.WorkItemUpdate;
import org.umssdiplo.automationv01.core.managepage.role.RoleUpdate;
import org.umssdiplo.automationv01.core.managepage.sickness.SicknessCreate;
import org.umssdiplo.automationv01.core.managepage.sickness.SicknessDeleteAlert;
import org.umssdiplo.automationv01.core.managepage.sickness.SicknessList;
import org.umssdiplo.automationv01.core.managepage.sickness.SicknessUpdate;
import org.umssdiplo.automationv01.core.utils.DataDriverTest;
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
    public void clickPersonnelMenu() throws Throwable {
        ssiaHome.clickPersonnelMenu();
    }

    @And("click 'Employee' submenu into 'Personnel' menu")
    public void clickEmployeeMenu() throws Throwable {
        employeeList = ssiaHome.clickEmployeeMenu();
    }

    // Employees List
    @And("click 'New Employee' button in 'Employees List' page")
    public void clickNewEmployeeBtn() throws Throwable {
        employeeCreate = employeeList.clickNewEmployeeButton();
    }

    @Then("'Employee List' page loads correctly")
    public void isEmployeeListPresent() throws Throwable {
        boolean result = employeeList.isEmployeeListPresent();
        Assert.assertTrue(result, "Fail, Employe list is not loaded");
    }

    // Employee Create
    @And("click 'Save' button in 'New Employee' page")
    public void clickSaveEmployee() throws Throwable {
        employeeCreate.clickSaveEmployeeBtn();
    }

    @Then("'Please fill required fields' error pops up")
    public void isRequiredErrorDisplayed() throws Throwable {
        String actualResult = employeeCreate.isRequiredErrorDisplayed();
        employeeCreate.clickOKInAlert();
        Assert.assertEquals(actualResult, "Please fill required fields");
    }

    @And("click 'OK' button in 'Alert'")
    public void clickOKBtnInAlert() throws Throwable {
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
    private RoleCreate roleCreate;
    private RoleUpdate roleUpdate;
    private RoleDeleteAlert roleDeleteAlert;

    @And("^click sub menu 'Roles' of menu 'personnel'$")
    public void clickSubMenuRolesOfMenuPersonnel() throws Throwable {
        roleList = ssiaHome.clickRoleMenu();
    }

    @Then("^'Role list' is showed in page$")
    public void roleListIsShowedInPage() throws Throwable {
        Assert.assertTrue(roleList.isRoleListPresent(), "Fail, Role list is not loaded");
    }

    @And("^click button 'New Role' of role list page$")
    public void clickButtonNewRoleOfRoleListPage() throws Throwable {
        roleCreate = roleList.clickNewRoleButton();
    }

    @And("^fill 'Role' form using Data Driver Test on create 'Role' page$")
    public void fillRoleFormUsingDataDriverTestOnCreateRolePage() throws Throwable {
        roleCreate.fillRoleUsingDataDriverTest();
    }

    @And("^click button 'Create' into create form page$")
    public void clickButtonCreateIntoCreateFormPage() throws Throwable {
        roleList = roleCreate.clickSaveButton();
    }

    @Then("^created 'Role' is showed in role list page$")
    public void createdRoleIsShowedInRoleListPage() throws Throwable {
        Assert.assertEquals(roleList.getLastRoleNameInTable(), DataDriverTest.readValues.getValue("Role.create.name"), "Fail, Role is not created");
    }

    @And("^click button 'Edit' of 'Role list' page$")
    public void clickButtonEditOfRoleListPage() throws Throwable {
        roleUpdate = roleList.clickEditButton();
    }

    @And("^update 'Role' in form using Data Driver Test on update 'Role' page$")
    public void updateRoleInFormUsingDataDriverTestOnUpdateRolePage() throws Throwable {
        roleUpdate.updateRoleUsingDataDriverTest();
    }

    @And("^click button 'Update' into update 'Role' form page$")
    public void clickButtonUpdateIntoUpdateRoleFormPage() throws Throwable {
        roleList = roleUpdate.clickUpdateButton();
    }

    @Then("^updated 'Role' is showed in 'Role list' page$")
    public void updatedRoleIsShowedInRoleListPage() throws Throwable {
        Assert.assertEquals(roleList.getLastRoleNameInTable(), DataDriverTest.readValues.getValue("Role.update.name"), "Fail, Role is not updated");
    }

    @And("^click button 'Delete' of 'Role list' page$")
    public void clickButtonDeleteOfRoleListPage() throws Throwable {
        roleDeleteAlert = roleList.clickDeleteButton();
    }

    @And("^click button 'Accept' of delete 'Role' confirmation popup$")
    public void clickButtonAcceptOfDeleteRoleConfirmationPopup() throws Throwable {
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
    private SicknessDeleteAlert sicknessDeleteAlert;

    @And("^click sub menu 'Sickness' of menu 'Safety'$")
    public void clickSubMenuSicknessOfMenuSafety() throws Throwable {
        sicknessList = safetyMenu.clickSicknessMenu();
    }

    @Then("^'Sickness list' is showed in page$")
    public void sicknessListIsShowedInPage() throws Throwable {
        Assert.assertTrue(sicknessList.isSicknessListPresent(), "Fail, Sickness list is not loaded");
    }

    @And("^click button 'New Sickness' of sickness list page$")
    public void clickButtonNewSicknessOfSicknessListPage() throws Throwable {
        sicknessCreate = sicknessList.clickNewSicknessButton();
    }

    @And("^fill 'Sickness' form using Data Driver Test on create 'Sickness' page$")
    public void fillSicknessFormUsingDataDriverTestOnCreateSicknessPage() throws Throwable {
        sicknessCreate.fillSicknessUsingDataDriverTest();
    }

    @And("^click button 'Save' into 'Sickness' create form page$")
    public void clickButtonSaveIntoSicknessCreateFormPage() throws Throwable {
        sicknessList = sicknessCreate.clickSaveButton();
    }

    @Then("^created 'Sickness' is showed in 'Sickness list' page$")
    public void createdSicknessIsShowedInSicknessListPage() throws Throwable {
        Assert.assertEquals(sicknessList.getLastSicknessDescriptionInTable(), DataDriverTest.readValues.getValue("Sickness.create.description"), "Fail, Sickness is not created");
    }

    @And("^click button 'Edit' of 'Sickness list' page$")
    public void clickButtonEditOfSicknessListPage() throws Throwable {
        sicknessUpdate = sicknessList.clickEditButton();
    }

    @And("^update 'Sickness' in form using Data Driver Test on update 'Sickness' page$")
    public void updateSicknessInFormUsingDataDriverTestOnUpdateSicknessPage() throws Throwable {
        sicknessUpdate.updateSicknessUsingDataDriverTest();
    }

    @And("^click button 'Update' into update 'Sickness' form page$")
    public void clickButtonUpdateIntoUpdateSicknessFormPage() throws Throwable {
        sicknessList = sicknessUpdate.clickUpdateButton();
    }

    @Then("^updated 'Sickness' is showed in 'Sickness list' page$")
    public void updatedSicknessIsShowedInSicknessListPage() throws Throwable {
        Assert.assertEquals(sicknessList.getLastSicknessDescriptionInTable(), DataDriverTest.readValues.getValue("Sickness.update.description"), "Fail, Sickness is not updated");
    }

    @And("^click button 'Delete' of 'Sickness list' page$")
    public void clickButtonDeleteOfSicknessListPage() throws Throwable {
        sicknessDeleteAlert = sicknessList.clickDeleteButton();
    }

    @And("^click button 'Accept' of delete 'Sickness' confirmation popup$")
    public void clickButtonAcceptOfDeleteSicknessConfirmationPopup() throws Throwable {
        sicknessList = sicknessDeleteAlert.clickAcceptButton();
    }

    @Then("^deleted 'Sickness' is not showed in 'Sickness list' page$")
    public void deletedSicknessIsNotShowedInSicknessListPage() throws Throwable {
        Assert.assertNotEquals(sicknessList.getLastSicknessDescriptionInTable(), sicknessDeleteAlert.getSicknessDescription(), "Fail, Sickness is not deleted");
    }

    // Work Item List
    private WorkItemsMenu workItemsMenu;
    private WorkItemList workItemList;
    private WorkItemCreate workItemCreate;
    private WorkItemDelete workItemDelete;
    private WorkItemUpdate workItemUpdate;

    private ItemClassificationMenu itemClassMenu;
    private ItemClassificationList itemClassificationList;
    private ItemClassificationCreate itemClassificationCreate;




    @Given("click Work Items 'menu' on 'Header' page")
    public void clickWorkItemsMenu() throws Throwable {
        workItemsMenu = ssiaHome.clickWorkItemsMenu();
    }

    @And("click 'Work Item' sub menu on 'Work Items' menu")
    public void clickWorkItemSubMenu() throws Throwable {
        workItemList = workItemsMenu.clickWorkItemtMenu();
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

    @And("click in button 'Update' into update 'WorkItem' form page")
    public void clickInButtonUpdateIntoUpdateWorkItemFormPage() throws Throwable {
        workItemList = workItemUpdate.clickUpdateButton();
    }
    @Then("updated 'WorkItem' is showed in 'Work Item list' page")
    public void updatedWorkItemIsShowedInRoleListPage() throws Throwable {
        Assert.assertEquals(workItemList.getLastWorkItemNameInTable(), DataDriverTest.readValues.getValue("WorkItem.update.name"), "Fail, WorkItem is not updated");


    }

    @And("click 'Item Classification' sub menu on 'Work Items' menu")
    public void clickItemClassificationSubMenu() throws Throwable {
        itemClassificationList = workItemsMenu.clickItemClassificationtMenu();
    }

    @Then("'Item Classification List' page loads correctly")
    public void ItemClassIsShowedInPage() throws Throwable {
        Assert.assertTrue(itemClassificationList.isItemClassListPresent(), "Fail, Item Classification List is not loaded");
    }

    @And("click in button 'New Work Item Classification' of Item Classification list page")
    public void clickInButtonNewWorkItemOfItemListPage() throws Throwable {
        itemClassificationCreate = itemClassificationList.clickNewCreateItemButton();
    }

    @And("fill 'Item Classification' in Classification form page")
    public void fillItemFormUsingDataDriverTestOnCreateItemPage() throws Throwable {
        itemClassificationCreate.fillItemClassification();
    }

    @And("click in button 'Save' into create Item Classification form page")
    public void clickInButtonCreateIntoItemCreateFormPage() throws Throwable {
        workItemList = itemClassificationCreate.clickSaveButton();

    }

    // Manual List
    private FunctionManual functionManual;

    @And("^click 'function manual' on 'Header' page$")
    public void selectFunctionManualLink() throws  Throwable{
        functionManual = ssiaHome.clickManualMenu();
    }

    @Then("^'function manual' page loads correctly$")
    public void verifyFunctionManualList() throws Throwable{
        boolean result = functionManual.isFuntionalManualtableDisplayed();
        Assert.assertTrue(result, "Fail, Function Manual list is not loaded");
    }

    // Safety List

    private SafetyMenu safetyMenu;
    private AccidentList accidentList;
    private AccidentForm accidentForm;

    private UpdateAccidentForm updateAccidentForm;
    private AccidentDeleteAlert accidentDeleteAlert;

    @Given("click 'Safety' menu on 'Header' page")
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

    @And("click 'pencil' button on 'Accident' list page")
    public void clickEditButton() {
        updateAccidentForm = accidentList.clickEditAccidentButton();
    }

    @And("set all information required on 'Accident' form")
    public void updateAccidentForm() {
        updateAccidentForm.updateAccidentInformationForm();
    }

    @And("click 'update' button on 'Accident' form")
    public void saveUpdatedAccidentForm() {
        accidentList = updateAccidentForm.clickUpdateButton();
    }

    @Then("'Accident list' page loads with records edited")
    public void isEditedAccidentPresent() throws Throwable {
        Assert.assertEquals(accidentList.getLastDescriptionInTable(), DataDriverTest.readValues.getValue("Accident.update.accidentDescription"), "Fail, edited Accident record is not changed");
    }

    @And("click 'trash' button on 'Accident' list page")
    public void clickDeleteAccidentButton() throws Throwable {
        accidentDeleteAlert = accidentList.clickDeleteAccidentButton();
    }

    @And("click Accept button on popup to confirm delete 'Accident'")
    public void clickAcceptButtonAccidentAlert() throws Throwable {
        accidentList = accidentDeleteAlert.clickAcceptButton();
    }

    @Then("'Accident list' page loads without record deleted")
    public void deletedAccidentIsNotLoaded() {
        Assert.assertNotEquals(accidentList.getLastDescriptionInTable(), accidentDeleteAlert.getAccidentDescription(), "Fail, Accident is not deleted");
    }

    @And("click 'New accident for Employee' button on 'Accident' list page")
    public void clickCreateAccidentButton() {
        accidentForm = accidentList.clickCreateAccidentButton();
    }

    @And("fill all information required for 'Accident' form")
    public void fillAccidentForm() {
        accidentForm.fillAccidentForm();
    }

    @And("click 'save' button on 'Accident' form")
    public void saveAccidentForm() {
        accidentForm.clickSaveAccidentForm();
    }

    @Then("'Accident list' page loads with new records added")
    public void isNewAccidentPresent() {
        Assert.assertTrue(accidentList.isNewRecordPresent(), "Fail, Accident record is not loaded");
    }

    // PPE Menu
    @And("click 'PPE' menu on 'Header' page")
    public void clickPPEMenu() throws Throwable {
        ssiaHome.clickPPEMenu();
    }

    // PPE Classification List
    private PPEClassificationList ppeClassificationList;

    @And("^click 'PPE Classification' sub menu of 'PPE' menu$")
    public void clickSubMenuPPEClassification() throws Throwable {
        ppeClassificationList = ssiaHome.clickPPEClassificationSubMenu();
    }

    @Then("^'PPE Classification list' page loads correctly$")
    public void PPEClassificationListIsShowedInPage() throws Throwable {
        Assert.assertTrue(ppeClassificationList.isPPEClassificationListPresent(), "Fail, PPE Classification list is not loaded");
    }

    // PPE Classification Create
    private PPEClassificationCreate ppeClassificationCreate;

    @And("^click 'New PPE Classification' button of 'PPE Classification list' page$")
    public void clickButtonNewPPEClassification() throws Throwable {
        ppeClassificationCreate = ppeClassificationList.clickNewPPEClassification();
    }

    @And("^fill 'PPE Classification' form using Data Driver Test on create 'PPE Classification' page$")
    public void fillPPEClassificationFormUsingDataDriverTestOnCreatePPEClassificationPage() throws Throwable {
        ppeClassificationCreate.fillPPEClassificationUsingDataDriverTest();
    }

    @And("^click 'Save' button into create 'PPE Classification' form page$")
    public void clickSaveButtonInCreateNewPPEClassificationFormPage() throws Throwable {
        ppeClassificationList = ppeClassificationCreate.clickSaveButton();
    }

    @Then("^created 'PPE Classification' is showed in 'PPE Classification list' page$")
    public void createdPPEClassificationIsShowedInPPEClassificationListPage() throws Throwable {
        Assert.assertEquals(ppeClassificationList.getLastPPEClassificationNameInTable(), DataDriverTest.readValues.getValue("PPEClassification.create.name"), "Fail, PPE Classification is not created");
    }

    // PPE List
    private PPEList ppeList;

    @And("^click 'PPE' sub menu of 'PPE' menu$")
    public void clickSubMenuPPE() throws Throwable {
        ppeList = ssiaHome.clickPPESubMenu();
    }

    @Then("^'PPE list' page loads correctly$")
    public void PPEListIsShowedInPage() throws Throwable {
        Assert.assertTrue(ppeList.isPPEListPresent(), "Fail, PPE list is not loaded");
    }

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

    // Safety Rules Audits List
    private SafetyRulesList safetyRulesList;

    @And("click 'Safety Rules' submenu into 'Audits' menu on 'Header' page")
    public void clickSafetyRulesMenu() throws Throwable {
        safetyRulesList = ssiaHome.clickSafetyRulesMenu();
    }

    @Then("^'Safety Rules List' page loads correctly$")
    public void safetyRulesListIsShowedInPage() throws Throwable {
        Assert.assertTrue(safetyRulesList.isSafetyRulesListPresent(), "Fail, Safety Rules list is not loaded");
    }

    // Safety Rules Audits Create
    private SafetyRuleCreate safetyRuleCreate;

    @And("click 'Assing Safety Rule to Audit' button on Safety Rule List page")
    public void clickButtonAssignSafetyRuleToAuditOfSafetyRulePage() throws Throwable {
        safetyRuleCreate = safetyRulesList.clickAssignSafetyRuleButton();
    }

    @And("Fill 'Safety Rule' form")
    public void fillSafetyRuleFormUsingDataDriverTestOnSafetyRulePage() throws Throwable {
        safetyRuleCreate.fillSafetyRuleFromResourceUsingDataDriverTest();
    }

    @And("click 'Create' button after fill form")
    public void clickButtonCreateOnCreateSafetyRuleFormPage() throws Throwable {
        safetyRulesList = safetyRuleCreate.clickSaveButton();
    }

    @Then("^'Assigned Safety Rule' is showed in Safety Rule List page$")
    public void createdSafetyRuleIsShowedIntoSafetyRuleListPage() throws Throwable {
        Assert.assertTrue(safetyRulesList.isSafetyRulesListPresent(), "Fail, Audit list is not loaded");
    }

    // Audit Create
    private AuditCreate auditCreate;

    @And("click 'New Audit' button on Audit List page")
    public void clickButtonNewAuditOfAuditListPage() throws Throwable {
        auditCreate = auditList.clickNewAuditButton();
    }

    @And("Fill 'Audit' form")
    public void fillAuditFormUsingDataDriverTestOnCreateAuditPage() throws Throwable {
        auditCreate.fillAuditFromResourceUsingDataDriverTest();
    }

    @And("click 'Create' button after create audit fill form")
    public void clickButtonCreateOnCreateFormPage() throws Throwable {
        auditList = auditCreate.clickSaveButton();
    }

    @Then("^'Created Audit' is showed in Audit List page$")
    public void createdAuditIsShowedIntoAuditListPage() throws Throwable {
        Assert.assertTrue(auditList.isAuditListPresent(), "Fail, Audit list is not loaded");
    }

    // Report Audit Periodicity
    private ReportAuditPeriodicity reportAuditPeriodicity;

    @And("click 'Report Audit Periodicity' submenu into 'Audits' menu on 'Header' page")
    public void clickReportAuditPeriodicityMenu() throws Throwable {
        reportAuditPeriodicity = ssiaHome.clickReportAuditPeriodicityMenu();
    }

    @Then("^'Report Audit Periodicity' page loads correctly$")
    public void reportAuditPeriodicityIsShowedInPage() throws Throwable {
        Assert.assertTrue(reportAuditPeriodicity.isReportAuditPeriodicityPresent(), "Fail, Audit list is not loaded");
    }
}