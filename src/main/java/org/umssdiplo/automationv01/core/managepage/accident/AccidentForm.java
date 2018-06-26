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

    public void fillAccidentForm(){
        CommonEvents.selectOptionFieldByValue(employeeList, "1");
        CommonEvents.setInputField(accidentDescriptionField, "new accident");
        CommonEvents.setDateField(accidentDateField, "06152018");
        CommonEvents.setInputField(accidentWhereField, "it happened at home");
        CommonEvents.setInputField(accidentDaysOutWorkField, "3");
        CommonEvents.setInputField(accidentDaysTransferredField, "2");
        CommonEvents.selectOptionFieldByValue(saCategoryListField, "2");
        CommonEvents.selectOptionFieldByValue(saTypeListField, "2");
        CommonEvents.clickButton(saveButton);

    }

}
