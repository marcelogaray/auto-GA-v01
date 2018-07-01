package org.umssdiplo.automationv01.core.managepage.accident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

/*
Created on 20/6/18
@author: HENRYBC
*/
public class AccidentList extends BasePage {

    @FindBy(id = "btn_createAccidentId")
    private WebElement btnCreateAccident;

    @FindBy(xpath = "//*[@id=\"accidentTable\"]/descendant::td[last()-1]")
    private WebElement btnEditAccident;

    @FindBy(xpath = "//table[@id='accidentTable']/descendant::tr[last()]/td[count(//table[@id='accidentTable']/descendant::th[text()='description'])+1]")
    private WebElement accidentUpated;

    @FindBy(xpath = "//table[@id='accidentTable']/descendant::tr[last()]/descendant::button[contains(concat(' ', normalize-space(@class), ' '), ' deleteBtn ')]")
    private WebElement deleteAccidentButton;

    public boolean isAccidentListPresent() {
        return CommonEvents.isPresent(btnCreateAccident);
    }

    public UpdateAccidentForm clickEditAccidentButton() {
        CommonEvents.clickButton(btnEditAccident);
        return new UpdateAccidentForm();
    }

    public String getLastDescriptionInTable() {
        return CommonEvents.getTextContent(accidentUpated);
    }

    public AccidentDeleteAlert clickDeleteAccidentButton() {
        String accidentDescription = getLastDescriptionInTable();
        CommonEvents.clickButton(deleteAccidentButton);
        return new AccidentDeleteAlert(accidentDescription);
    }

}
