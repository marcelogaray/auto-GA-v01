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

    @FindBy(xpath = "//*[@id=\"accidentTable\"]/descendant::td[contains(text(), 'Fred Mour')]")
    private WebElement newAccidentAdded;

    public boolean isAccidentListPresent() {
        return CommonEvents.isPresent(btnCreateAccident);
    }

    public AccidentForm clickCreateAccidentButton() {
        CommonEvents.clickButton(btnCreateAccident);
        return new AccidentForm();
    }

    public boolean isNewRecordPresent(){
        return CommonEvents.isPresent(newAccidentAdded);
    }

}
