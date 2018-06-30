package org.umssdiplo.automationv01.core.managepage.accident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

/*
Created on 25/6/18
@author: HENRYBC
*/
public class AccidentForm extends BasePage {

    @FindBy(id = "employeeListId")
    private WebElement employeeList;

    @FindBy(id = "accidentDescriptionFieldId")
    private WebElement accidentDescriptionField;

    @FindBy(id = "accidentDateFieldId")
    private WebElement accidentDateField;

    @FindBy(id = "accidentWhereFieldId")
    private WebElement accidentWhereField;

    @FindBy(id = "accidentDaysOutWorkFieldId")
    private WebElement accidentDaysOutWorkField;

    @FindBy(id = "accidentDaysTransferredFieldId")
    private WebElement accidentDaysTransferredField;

    @FindBy(id = "saCategoryListFieldId")
    private WebElement saCategoryListField;

    @FindBy(id = "saTypeListFieldId")
    private WebElement saTypeListField;

    @FindBy(id = "saveButtonId")
    private WebElement saveButton;

    public AccidentForm() {
        CommonEvents.isVisible(saveButton);
    }

    public void fillAccidentForm() {
        selectEmployeeToSave("6");
        saveAccidentDescription("it was too hard");
        saveDate("06202018");
        saveWhereOccurredAccident("at home");
        saveDaysOutOfWork("3");
        saveDaysTransferred("4");
        selectAccidentCategory("3");
        selectAccidentType("2");
    }

    private void selectEmployeeToSave(String selectIndex) {
        CommonEvents.selectOptionFieldByValue(employeeList, selectIndex);
    }

    private void saveAccidentDescription(String accidentDescription) {
        CommonEvents.setInputField(accidentDescriptionField, accidentDescription);
    }

    private void saveDate(String dateValue) {
        CommonEvents.setDateField(accidentDateField, dateValue);
    }

    private void saveWhereOccurredAccident(String whereOccurred) {
        CommonEvents.setInputField(accidentWhereField, whereOccurred);
    }

    private void saveDaysOutOfWork(String totalDaysOutOfWork) {
        CommonEvents.setInputField(accidentDaysOutWorkField, totalDaysOutOfWork);
    }
    private void saveDaysTransferred(String totalDaysTransferred) {
        CommonEvents.setInputField(accidentDaysTransferredField, totalDaysTransferred);
    }

    private void selectAccidentCategory(String selectIndexCategory) {
        CommonEvents.selectOptionFieldByValue(saCategoryListField, selectIndexCategory);
    }

    private void selectAccidentType(String selectIndexType) {
        CommonEvents.selectOptionFieldByValue(saTypeListField, selectIndexType);
    }

    public void clickSaveAccidentForm() {
        CommonEvents.clickButton(saveButton);
    }

}
