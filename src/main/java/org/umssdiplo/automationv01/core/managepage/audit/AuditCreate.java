package org.umssdiplo.automationv01.core.managepage.audit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.DataDriverTest;

/**
 * @author Neyber Rojas Zapata
 */
public class AuditCreate extends BasePage {

    @FindBy(name = "auditName")
    private WebElement nameInput;

    @FindBy(name = "auditCode")
    private WebElement codeInput;

    @FindBy(name = "auditType")
    private WebElement typeSelectOption;

    @FindBy(name = "periodicity")
    private WebElement periodicitySelectOption;

    @FindBy(name = "departmentId")
    private WebElement departmentSelectOption;

    @FindBy(name = "employeeId")
    private WebElement employeeSelectOption;

    @FindBy(name = "auditScope")
    private WebElement scopeInput;

    @FindBy(name = "auditObjective")
    private WebElement objectiveInput;

    @FindBy(name = "auditCriteria")
    private WebElement criteriaInput;

    @FindBy(id = "saveAuditButton")
    private WebElement saveAuditButton;

    public AuditCreate() {
        CommonEvents.isVisible(nameInput);
    }

    public void fillAuditFromResourceUsingDataDriverTest() {
        fillAuditName(DataDriverTest.readValues.getValue("Audit.create.auditName"));
        fillAuditCode(DataDriverTest.readValues.getValue("Audit.create.auditCode"));
        selectOptionAuditType();
        selectOptionPeriodicity();
        selectOptionDepartment();
        selectOptionEmployee();
        fillAuditScope(DataDriverTest.readValues.getValue("Audit.create.auditScope"));
        fillAuditObjective(DataDriverTest.readValues.getValue("Audit.create.auditObjective"));
        fillAuditCriteria(DataDriverTest.readValues.getValue("Audit.create.auditCriteria"));
    }

    private void fillAuditName(String auditName) {
        CommonEvents.setInputField(nameInput, auditName);
    }

    private void fillAuditCode(String auditCode) {
        CommonEvents.setInputField(codeInput, auditCode);
    }

    private void selectOptionAuditType() {
        Select selectAuditType = new Select(typeSelectOption);
        selectAuditType.selectByIndex(1);
    }

    private void selectOptionPeriodicity() {
        Select selectPeriodicity = new Select(periodicitySelectOption);
        selectPeriodicity.selectByIndex(1);
    }

    private void selectOptionDepartment() {
        Select selectDepartment = new Select(departmentSelectOption);
        selectDepartment.selectByIndex(1);
    }

    private void selectOptionEmployee() {
        Select selectEmployee = new Select(employeeSelectOption);
        selectEmployee.selectByIndex(1);
    }

    private void fillAuditScope(String auditScope) {
        CommonEvents.setInputField(scopeInput, auditScope);
    }

    private void fillAuditObjective(String auditObjective) {
        CommonEvents.setInputField(objectiveInput, auditObjective);
    }

    private void fillAuditCriteria(String auditCriteria) {
        CommonEvents.setInputField(criteriaInput, auditCriteria);
    }

    public AuditList clickSaveButton() {
        CommonEvents.clickButton(saveAuditButton);
        return new AuditList();
    }
}
