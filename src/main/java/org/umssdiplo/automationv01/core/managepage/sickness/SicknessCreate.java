/**
 * @author Miguel Rojas
 */
package org.umssdiplo.automationv01.core.managepage.sickness;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.DataDriverTest;

public class SicknessCreate extends BasePage {

    @FindBy(name = "employeeId")
    private WebElement employeeSelect;

    @FindBy(name = "description")
    private WebElement descriptionInput;

    @FindBy(name = "dateSickness")
    private WebElement dateSicknessInput;

    @FindBy(name = "whereOccurred")
    private WebElement whereOccurredInput;

    @FindBy(name = "totalDaysOutOfWork")
    private WebElement totalDaysOutOfWorkInput;

    @FindBy(name = "totalDaysRestrictedTransferredWork")
    private WebElement totalDaysRestrictedTransferredInput;

    @FindBy(name = "saCategoryId")
    private WebElement saCategorySelect;

    @FindBy(name = "saTypeId")
    private WebElement saTypeSelect;

    @FindBy(id = "saveBtn")
    private WebElement saveButton;

    public SicknessCreate() {
        CommonEvents.isVisible(descriptionInput);
    }

    public void fillSicknessUsingDataDriverTest() {
        fillEmployeeSelect(DataDriverTest.readValues.getValue("Sickness.create.employee"));
        fillDescriptionInput(DataDriverTest.readValues.getValue("Sickness.create.description"));
        fillDateSicknessInput(DataDriverTest.readValues.getValue("Sickness.create.dateSickness"));
        fillWhereOccurredInput(DataDriverTest.readValues.getValue("Sickness.create.whereOccurred"));
        fillTotalDaysOutOfWorkInput(DataDriverTest.readValues.getValue("Sickness.create.totalDaysOutOfWork"));
        fillTotalDaysRestrictedTransferredInput(DataDriverTest.readValues.getValue("Sickness.create.totalDaysRestrictedTransferred"));
        fillSaCategorySelect(DataDriverTest.readValues.getValue("Sickness.create.saCategory"));
        fillSaTypeSelect(DataDriverTest.readValues.getValue("Sickness.create.saType"));
    }

    private void fillEmployeeSelect(String employee) {
        CommonEvents.setSelectFieldByText(employeeSelect, employee);
    }

    private void fillDescriptionInput(String description) {
        CommonEvents.setInputField(descriptionInput, description);
    }

    private void fillDateSicknessInput(String dateSickness) {
        CommonEvents.setInputDateField(dateSicknessInput, dateSickness);
    }

    private void fillWhereOccurredInput(String whereOccurred) {
        CommonEvents.setInputField(whereOccurredInput, whereOccurred);
    }

    private void fillTotalDaysOutOfWorkInput(String totalDaysOutOfWork) {
        CommonEvents.setInputField(totalDaysOutOfWorkInput, totalDaysOutOfWork);
    }

    private void fillTotalDaysRestrictedTransferredInput(String totalDaysRestrictedTransferred) {
        CommonEvents.setInputField(totalDaysRestrictedTransferredInput, totalDaysRestrictedTransferred);
    }

    private void fillSaCategorySelect(String saCategory) {
        CommonEvents.setSelectFieldByText(saCategorySelect, saCategory);
    }

    private void fillSaTypeSelect(String saType) {
        CommonEvents.setSelectFieldByText(saTypeSelect, saType);
    }

    public SicknessList clickSaveButton() {
        CommonEvents.clickButton(saveButton);
        return new SicknessList();
    }
}
