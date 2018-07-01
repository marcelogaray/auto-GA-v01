package org.umssdiplo.automationv01.core.managepage.menuheader.safetyMenu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.accident.AccidentList;
import org.umssdiplo.automationv01.core.managepage.sickness.SicknessList;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

/*
Created on 21/6/18
@author: HENRYBC
*/
public class SafetyMenu extends BasePage {

    @FindBy(id = "sicknessMenu")
    private WebElement sicknessMenu;

    @FindBy(id = "accidentMenu")
    private WebElement accidentMenu;

    public SicknessList clickSicknessMenu() {
        CommonEvents.clickButton(sicknessMenu);
        return new SicknessList();
    }

    public AccidentList clickAccidentMenu() {
        CommonEvents.clickButton(accidentMenu);
        return new AccidentList();
    }
}
