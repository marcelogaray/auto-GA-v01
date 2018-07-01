package org.umssdiplo.automationv01.core.managepage.accident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.DataDriverTest;

/*
Created on 30/6/18
@author: HENRYBC
Description:
    DataDriverTest is used to insert information into accident form to create new record of accident
*/
public class UpdateAccidentForm extends BasePage {

    @FindBy(id = "accidentDescriptionId")
    private WebElement accidentDescriptionField;

    @FindBy(id = "BirthDateId")
    private WebElement birthDateField;

    @FindBy(id = "accidentWhereFieldId")
    private WebElement accidentWhereField;

    @FindBy(id = "accidentDaysOutOfWorkFieldId")
    private WebElement accidentDaysOutOfWorkField;

    @FindBy(id = "accidentDaysTransferredFieldId")
    private WebElement accidentDaysTransferredField;

    @FindBy(id = "accidentCategoryFieldId")
    private WebElement accidentCategoryField;

    @FindBy(id = "accidentTypeFieldId")
    private WebElement accidentTypeField;

    @FindBy(xpath = "//form[@id='form-accident']/input[@value='Update']")
    private WebElement updateButton;

    public UpdateAccidentForm() {
        CommonEvents.isVisible(updateButton);
    }

    public void updateAccidentInformationForm() {

        updateAccidentDescription(DataDriverTest.readValues.getValue("Accident.update.accidentDescription"));
        updateWhereOccurredAccident(DataDriverTest.readValues.getValue("Accident.update.WhereOccurredAccident"));
        updateDaysOutOfWork(DataDriverTest.readValues.getValue("Accident.update.DaysOutOfWork"));
        updateDaysTransferred(DataDriverTest.readValues.getValue("Accident.update.DaysTransferred"));
        updateAccidentCategory(DataDriverTest.readValues.getValue("Accident.update.AccidentCategory"));
        updateAccidentType(DataDriverTest.readValues.getValue("Accident.update.AccidentType"));
    }

    private void updateAccidentDescription(String accidentDescription) {
        CommonEvents.setInputField(accidentDescriptionField, accidentDescription);
    }

    private void updateWhereOccurredAccident(String accidentDescription) {
        CommonEvents.setInputField(accidentWhereField, accidentDescription);
    }

    private void updateDaysOutOfWork(String updatedDaysOutOfWork) {
        CommonEvents.setInputField(accidentDaysOutOfWorkField, updatedDaysOutOfWork);
    }

    private void updateDaysTransferred(String updatedDaysTransferred) {
        CommonEvents.setInputField(accidentDaysTransferredField, updatedDaysTransferred);
    }

    private void updateAccidentCategory(String updatedAccidentCategory) {
        CommonEvents.selectOptionFieldByValue(accidentCategoryField, updatedAccidentCategory);
    }

    private void updateAccidentType(String updatedAccidentType) {
        CommonEvents.selectOptionFieldByValue(accidentTypeField, updatedAccidentType);
    }

    public AccidentList clickUpdateButton() {
        CommonEvents.clickButton(updateButton);
        return new AccidentList();
    }
}
